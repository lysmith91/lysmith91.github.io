package com.cs360.lydiasmith.localcoffeeshop.data;


import android.os.Bundle;

import com.cs360.lydiasmith.localcoffeeshop.models.Customer;

import java.util.ArrayList;
import java.util.List;



public class SampleCustomerData {

    public static List<Customer> getCustomers(){

        List<Customer> customers = new ArrayList<>();

        Customer customer1 = new Customer();
        customer1.setCustomerName("Debbie Sam");
        customer1.setEmailAddress("deb@email.net");
        customer1.setProfileImagePath("");
        customers.add(customer1);


        Customer customer2 = new Customer();
        customer2.setCustomerName("Keisha Williams");
        customer2.setEmailAddress("diva@comcast.com");
        customer2.setProfileImagePath("");
        customers.add(customer2);



        return customers;
    }
}
