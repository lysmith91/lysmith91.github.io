package com.cs360.lydiasmith.localcoffeeshop.Gallery2;

import android.widget.ImageView;

/*
Click interface for gallery images. Listens for click events.
 */

public interface GalleryItemClickListener {
    void onGalleryItemClickListener(int position, ImageModel imageModel, ImageView imageView);
}
