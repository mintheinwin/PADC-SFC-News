package com.week2.day1.padc.sfc.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.week2.day1.padc.sfc.R;
import com.week2.day1.padc.sfc.delegates.NewsItemDelegate;
import com.week2.day1.padc.sfc.viewholder.NewsViewHolder;

/**
 * Created by Min Thein Win on 11/4/2017.
 */

public class NewsListAdapter extends RecyclerView.Adapter<NewsViewHolder> {
    private Context mContext;
    private LayoutInflater mLayoutInflater;
    private NewsItemDelegate mNewsItemDelegate;

    public NewsListAdapter(Context context, NewsItemDelegate newsItemDelegate) {
        this.mLayoutInflater = LayoutInflater.from(context);
        this.mNewsItemDelegate = newsItemDelegate;

    }

    @Override
    public NewsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View newsItemView = mLayoutInflater.inflate(R.layout.view_item_news, parent, false);
        return new NewsViewHolder(newsItemView, mNewsItemDelegate);
    }

    @Override
    public void onBindViewHolder(NewsViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 30;
    }
}
