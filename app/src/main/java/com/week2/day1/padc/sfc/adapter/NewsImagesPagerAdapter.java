package com.week2.day1.padc.sfc.adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.week2.day1.padc.sfc.R;

/**
 * Created by Min Thein Win on 11/11/2017.
 */

public class NewsImagesPagerAdapter extends PagerAdapter {
    private LayoutInflater mLayoutInflater;

    public NewsImagesPagerAdapter(Context context) {
        mLayoutInflater = LayoutInflater.from(context);

    }

    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view == (View) object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View itemview = mLayoutInflater.inflate(R.layout.view_item_news_details_image, container, false);

        container.addView(itemview);
        return itemview;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
        super.destroyItem(container, position, object);
    }
}
