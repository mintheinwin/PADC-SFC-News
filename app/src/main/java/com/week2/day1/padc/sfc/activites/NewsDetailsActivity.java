package com.week2.day1.padc.sfc.activites;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.week2.day1.padc.sfc.R;
import com.week2.day1.padc.sfc.adapter.NewsImagesPagerAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Min Thiein Win on 11/11/2017.
 */

public class NewsDetailsActivity extends AppCompatActivity {
    @BindView(R.id.vp_news_details_images)
    ViewPager vpNewsDetailsImages;

    public static Intent newIntent(Context context){
        Intent intent=new Intent(context,NewsDetailsActivity.class);
        return intent;
    }
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activiity_news_details);
        ButterKnife.bind(this,this);
        NewsImagesPagerAdapter newsImagesPagerAdapter=new NewsImagesPagerAdapter(getApplicationContext());
        vpNewsDetailsImages.setAdapter(newsImagesPagerAdapter);

    }
}
