package com.cs360.lydiasmith.localcoffeeshop.Gallery2;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;

/*
Allows for swipeable slides of images found in most galleries. It is using ViewPager which is a
widget available in Android Support Library. This is the Adapter for the ViewPager.
 */

public class GalleryPagerAdapter extends FragmentStatePagerAdapter {

    private ArrayList<ImageModel> images;

    public GalleryPagerAdapter(FragmentManager fm, ArrayList<ImageModel> images) {
        super(fm);
        this.images = images;
    }

    //Returning an instance of the ImageDetailFragment for series of Fragments of same type needed for ViewPager.
    @Override
    public Fragment getItem(int position) {
        ImageModel image = images.get(position);
        return ImageDetailFragment.newInstance(image, image.getName());
    }

    @Override
    public int getCount() {
        return images.size();
    }
}
