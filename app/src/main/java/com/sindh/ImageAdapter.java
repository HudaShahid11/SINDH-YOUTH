package com.sindh;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class ImageAdapter extends PagerAdapter {
    private Context c;
    private int[] i = new int[]{};
    ImageAdapter(Context context){
        c= context;
    }
    @Override
    public int getCount() {
        return i.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        ImageView iv = new ImageView(c);
        iv.setScaleType(ImageView.ScaleType.FIT_XY);
        iv.setImageResource(i[position]);
        container.addView(iv,0);
        return iv;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((ImageView)object);
    }
}
