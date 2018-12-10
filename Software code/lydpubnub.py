#!/usr/bin/env python
import sys
import grovepi
import math
import time
from pubnub import Pubnub

# Connect the Grove Light Sensor to analog port A0
# SIG,NC,VCC,GND
light_sensor = 0

# Temp and Humidity data will not be collected when sensor exceeds threshold resistance
# Adjusted threshold value to ensure collection happens during daylight (not covered from light).
threshold = 180

##################################

# Connect the Grove Temperature & Humidity Sensor Pro to digital port D4
# This example uses the blue colored sensor.
# SIG,NC,VCC,GND
tempHumSensor = 7  # The Sensor goes on digital port 7.

# temp_humidity_sensor_type
# Grove Base Kit comes with the blue sensor.
dhtblue = 0    # The Blue colored sensor.
####################################

# Connect the LED to digital port D3
redLed = 3
# Connect the LED to digital port D5
greenLed = 5
# Connect the LED to digital port D4
blueLed = 4

####################################

grovepi.pinMode(light_sensor,"INPUT")

# Setting publish and subscribe_key for pubnub
pubnub = Pubnub(publish_key='pub-c-94fe9d5e-3fb6-4b30-8cb2-199a7c26ac68', subscribe_key='sub-c-b5d77fc0-e82d-11e8-9318-4a98695c4421')
channel = 'lydia'


def callback(message):
  print(message)


while True:
    try:
        # Get sensor value
        sensor_value = grovepi.analogRead(light_sensor)
        # Calculate resistance of sensor in K
        resistance = (float)(1023 - sensor_value) * 10 / sensor_value

        # This sets up the Temp/Humidity Sensor to collect data
        # The first parameter is the port, the second parameter is the type of sensor.
        [temp, humidity] = grovepi.dht(tempHumSensor, dhtblue)    

        # When light sensor is in daylight conditions, the resistance will be less than threshold.
        if resistance < threshold:
            
            if math.isnan(temp) == False and math.isnan(humidity) == False:
                # Converting Celsius to Fahrenheit
                tempF = (temp * 1.8 + 32)

                #Rounding temperature to the nearest integer
                tempF = round(tempF, 0)
                    
                # print statement for terminal
                print("Temp = %s F Humidity =%s%%" % (tempF, humidity))

                # Code for turning LED's on
                if (60 < tempF < 85) and (humidity < 80):
                    # Send HIGH to switch on Green LED
                    grovepi.digitalWrite(greenLed, 1)
                    print("Green on")
                    time.sleep(1) #LED responds better when this is done after each digitalWrite
                elif ((tempF <= 60) or (tempF >= 85)):
                    grovepi.digitalWrite(greenLed, 0)
                    print("Green off")
                    time.sleep(1)

                if (85 < tempF < 95) and (humidity < 80):
                    # Send HIGH to switch on Blue LED
                    grovepi.digitalWrite(blueLed, 1)
                    print("Blue on")
                    time.sleep(0.5)
                elif ((tempF <= 85) or (tempF >= 95)):
                    grovepi.digitalWrite(blueLed, 0)
                    print("Blue off")
                    time.sleep(0.5)

                if (tempF > 95):
                    # Send HIGH to switch on Red LED
                    grovepi.digitalWrite(redLed, 1)
                    print("Red on")
                    time.sleep(0.5)
                elif (tempF <= 95):
                    grovepi.digitalWrite(redLed, 0)
                    print("Red off")
                    time.sleep(0.5)

                if (humidity > 80):
                    # Send HIGH to switch on Green and Blue LED
                    grovepi.digitalWrite(greenLed, 1)
                    grovepi.digitalWrite(blueLed, 1)
                    print("Green and blue on")

                #sending message with temp and humidity to pubnub   
                message = {'temperature': tempF, 'humidity': humidity}
                pubnub.publish(channel=channel, message=message, callback=callback, error=callback)
                
		
        else:
            print("It is night time.")
            ## Turning off all the LEDs since it is night time. 
            grovepi.digitalWrite(greenLed, 0)
            time.sleep(1)
            grovepi.digitalWrite(redLed, 0)
            time.sleep(1)
            grovepi.digitalWrite(blueLed, 0)
            time.sleep(1)
     
        #collecting every 5 seconds
        time.sleep(5)        

    except IOError:
        print ("Error")
    except KeyboardInterrupt:
        sys.exit()
