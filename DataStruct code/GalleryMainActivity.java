package com.cs360.lydiasmith.localcoffeeshop.Gallery2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.cs360.lydiasmith.localcoffeeshop.R;

public class GalleryMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.galleryactivity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //RecyclerView Fragment is launched.
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.content, RecyclerViewFragment.newInstance())
                .commit();
    }
}
