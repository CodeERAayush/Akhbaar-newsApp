package com.aayushpandey.newsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager viewPager;
    TabItem mHome,mScience,mHealth,mTech,mEntertainment,mSports;
    PagerAdapter pagerAdapter;
    Toolbar mToolbar;
    String api="5e7ccf5de80248128778e341575399fa";
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        getSupportActionBar().hide();

        mToolbar=findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);


mEntertainment=findViewById(R.id.entertainment);
mHealth=findViewById(R.id.health);
mScience=findViewById(R.id.science);
mHome=findViewById(R.id.home);
mTech=findViewById(R.id.technology);
mSports=findViewById(R.id.Sports);
viewPager=findViewById(R.id.fragmentcontainer);
tabLayout=findViewById(R.id.include);
        pagerAdapter=new pagerAdapter(getSupportFragmentManager(),6);
        viewPager.setAdapter(pagerAdapter);

tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
    @Override
    public void onTabSelected(TabLayout.Tab tab) {
        viewPager.setCurrentItem(tab.getPosition());
        if(tab.getPosition()==0||tab.getPosition()==1||tab.getPosition()==2||tab.getPosition()==3||tab.getPosition()==4||tab.getPosition()==5){
            pagerAdapter.notifyDataSetChanged();
        }

    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }
});
viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
    }
}