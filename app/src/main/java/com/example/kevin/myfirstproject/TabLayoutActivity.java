package com.example.kevin.myfirstproject;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class TabLayoutActivity extends AppCompatActivity {
    FragmentAdapter fragmentAdapter;
    ViewPager vpFragment;

    FragmentAdapter mFragmentAdapter;
    ViewPager mViewPager;
    TabLayout tabLayout;

    private int pageCount=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_layout);

        mViewPager = findViewById(R.id.vpFragment);
        tabLayout=findViewById(R.id.tabs);
        iniUi();

    }

    private void iniUi(){

        mFragmentAdapter = new FragmentAdapter(getSupportFragmentManager());
        mViewPager.setAdapter(mFragmentAdapter);
        pageCount=mFragmentAdapter.getCount();
        mViewPager.setOffscreenPageLimit(pageCount);

        ViewPager.OnPageChangeListener mViewPagerListener = new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                Toast.makeText(TabLayoutActivity.this,"Selected page position: " + position, Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        };


        TabLayout.TabLayoutOnPageChangeListener mTabLayoutListener= new TabLayout.TabLayoutOnPageChangeListener(tabLayout);
        TabLayout.Tab tab1 = tabLayout.newTab();
        tab1.setIcon(R.drawable.ic_shopping_cart_black_24dp);
        tab1.setText("Hola1");
        TabLayout.Tab tab2 = tabLayout.newTab();
        //tab1.setIcon(R.drawable.ic_launcher_background);
        tab2.setText("Hola2");
        tabLayout.addTab(tab2);
        tabLayout.addTab(tab1);
        //mViewPager.addOnPageChangeListener(mViewPagerListener);
        mViewPager.addOnPageChangeListener(mTabLayoutListener);
        mViewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        tabLayout.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(mViewPager));
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }


}
