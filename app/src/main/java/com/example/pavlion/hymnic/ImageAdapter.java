package com.example.pavlion.hymnic;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;



public class ImageAdapter extends BaseAdapter {
    private Context mContext;

    public ImageAdapter(Context c) {
        mContext = c;
    }

    public int getCount() {
        return mThumbIds.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    // Create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        // if it's not recycled, initialize some attributes
        if (convertView == null) {
            imageView = new ImageView(mContext);
            // Center crop image
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        } else {
            imageView = (ImageView) convertView;
        }
        // Set images into ImageView
        imageView.setImageResource(mThumbIds[position]);
        return imageView;
    }

    // References to my images in res > drawable
    public Integer[] mThumbIds = { R.drawable.drake, R.drawable.theweknd,
            R.drawable.taylorswift, R.drawable.djkhaled,
            R.drawable.kanyewest, R.drawable.justintimberlake, R.drawable.zayn,
            R.drawable.shawnmendes, R.drawable.eminem,
            R.drawable.dualipa,R.drawable.chrisbrown};
}