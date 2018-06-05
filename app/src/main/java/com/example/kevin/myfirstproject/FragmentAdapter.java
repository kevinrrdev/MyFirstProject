package com.example.kevin.myfirstproject;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.kevin.myfirstproject.Fragment.Fragmento1;
import com.example.kevin.myfirstproject.Fragment.Fragmento2;

public class FragmentAdapter extends FragmentPagerAdapter {

    public FragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch(position) {

            case 0: return Fragmento1.newInstance("FirstFragment, Instance 1");
            case 1: return Fragmento2.newInstance("SecondFragment, Instance 2");
            default: return Fragmento1.newInstance("FirstFragment, Default");
        }
    }

    @Override
    public int getCount() {
        return 2;
    }

}