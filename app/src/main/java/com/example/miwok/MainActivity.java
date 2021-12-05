package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.TextView;

//import com.example.lang.R;
import com.example.miwok.ViewPagerFragmentAdapter;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {
   ViewPagerFragmentAdapter viewPagerFragmentAdapter;
   TabLayout tabLayout;
   ViewPager2 viewPager2;
    private String[] title = {"Number", "Family Member", "Colors", "Phrases"};

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);

        getSupportActionBar().setDisplayShowTitleEnabled(true);
        viewPager2 = findViewById (R.id.view_pager);
        tabLayout = findViewById (R.id.tab_bar);
        viewPagerFragmentAdapter = new ViewPagerFragmentAdapter (this);
        viewPager2.setAdapter (viewPagerFragmentAdapter);

        new TabLayoutMediator (tabLayout, viewPager2, ((tab, position) -> tab.setText (title[position]))).attach ();

    }
}