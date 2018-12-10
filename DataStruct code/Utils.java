package com.cs360.lydiasmith.localcoffeeshop.Gallery2;

import com.cs360.lydiasmith.localcoffeeshop.R;

import java.util.ArrayList;
/*
Utility class for image loading
 */

public class Utils {


    static Integer IMGS[] = {
            R.drawable.img1,
            R.drawable.img2,
            R.drawable.img3,
            R.drawable.img4,
            R.drawable.img5,
            R.drawable.img6,
            R.drawable.img7,
            R.drawable.img8,
            R.drawable.img9,
            R.drawable.img10
    };


    //Using an array list to store each image data that will display in gallery
    public static ArrayList<ImageModel> getData() {
        ArrayList<ImageModel> arrayList = new ArrayList<>();
        for (int i = 0; i < IMGS.length; i++) {
            ImageModel imageModel = new ImageModel();
            imageModel.setName("Image " + i);
            imageModel.setImage_ID(IMGS[i]);
            arrayList.add(imageModel);
        }
        return arrayList;
    }
}
