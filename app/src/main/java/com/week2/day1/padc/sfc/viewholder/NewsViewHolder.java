package com.week2.day1.padc.sfc.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.week2.day1.padc.sfc.delegates.NewsItemDelegate;

/**
 * Created by Min Thein Win on 11/4/2017.
 */

public class NewsViewHolder extends RecyclerView.ViewHolder {
    private NewsItemDelegate mNewsItemDelegate;

    public NewsViewHolder(View itemView,NewsItemDelegate newsItemDelegate) {
        super(itemView);
        mNewsItemDelegate=newsItemDelegate;
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               mNewsItemDelegate.onTagNews();
            }
        });
    }
}
