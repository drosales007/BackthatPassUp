package com.example.johnnycash.backthatpassup;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class OffensivePlaybook extends AppCompatActivity {

    Toolbar toolbar;
    ViewPager pager;
    ViewPagerAdapter adapter;
    SlidingTabLayout tabs;
    CharSequence Titles[]={"Short","Long"};
    int Numboftabs = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_offensive_playbook);
        getWindow().setStatusBarColor(Color.BLACK);

        // Creating The Toolbar and setting it as the Toolbar for the activity
        toolbar = (Toolbar) findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);

        setTitle("Offensive Playbook");

        // Create ViewPagerAdapter passing fragment manager titles for the tabs
        adapter =  new ViewPagerAdapter("offense", getSupportFragmentManager(),
                Titles, Numboftabs);

        // Assigning ViewPager View and setting the adapter
        pager = (ViewPager) findViewById(R.id.pager);
        pager.setAdapter(adapter);

        // Assign Sliding Tab Layout View
        tabs = (SlidingTabLayout) findViewById(R.id.tabs);
        tabs.setDistributeEvenly(true);

        // Setting Custom Color for the Scroll bar indicator
        tabs.setCustomTabColorizer(new SlidingTabLayout.TabColorizer() {
            @Override
            public int getIndicatorColor(int position) {
                return getResources().getColor(R.color.yellowAccent);
            }
        });

        // Set ViewPager For the SlidingTabsLayout
        tabs.setViewPager(pager);
    }

    public void openPlay(View view){
        // Method for opening a view of the selected play
        String tag = String.valueOf(view.getTag());
        Intent intent = new Intent(this, PlayDisplay.class);
        intent.putExtra("message", tag);
        startActivity(intent);
    }
}
