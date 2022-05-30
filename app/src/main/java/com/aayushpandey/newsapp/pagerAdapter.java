package com.aayushpandey.newsapp;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.recyclerview.widget.RecyclerView;

public class pagerAdapter extends FragmentPagerAdapter {


    int tabcount;

    public pagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        tabcount=behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
       switch(position){
           case 0:
               return new HomeFrag();
           case 1:
               return new sports();
           case 2:
               return new health();
           case 3:
               return new science();
           case 4:
               return new entertainment();
           case 5:
               return new tech();
           default:
               return null;

       }
    }

    @Override
    public int getCount() {
        return tabcount;
    }
}
