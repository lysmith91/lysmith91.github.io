package com.cs360.lydiasmith.localcoffeeshop.Gallery2;

import android.os.Parcel;
import android.os.Parcelable;

/*
This image model class is the bridge between the layout and its data.
Parcelable is implemented to allow for easy passing of the ArrayList holding a custom object (ImageModel).
 */

public class ImageModel implements Parcelable {

    private String name;
    private String url;
    private Integer image_id;

    public ImageModel() {

    }

    public ImageModel(Parcel in) {
        name = in.readString();
        url = in.readString();
    }

    public static final Creator<ImageModel> CREATOR = new Creator<ImageModel>() {
        @Override
        public ImageModel createFromParcel(Parcel in) {
            return new ImageModel(in);
        }

        @Override
        public ImageModel[] newArray(int size) {
            return new ImageModel[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setImage_ID(Integer android_image_url) {
        this.image_id = android_image_url;
    }
    public Integer getImage_ID() {
        return image_id;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(url);
    }
}
