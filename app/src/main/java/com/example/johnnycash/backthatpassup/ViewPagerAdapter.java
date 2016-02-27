package com.example.johnnycash.backthatpassup;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    CharSequence Titles[];
    int NumbOfTabs;
    String t;

    public ViewPagerAdapter(String activityType, FragmentManager fm,
                            CharSequence mTitles[], int mNumbOfTabsumb) {
        super(fm);
        this.t = activityType;
        this.Titles = mTitles;
        this.NumbOfTabs = mNumbOfTabsumb;
    }

    @Override
    public Fragment getItem(int position) {
        // Method to return the fragment for each position in the View Pager
        if (t.equals("offense")) {
            if (position == 0) {
                OffenseShort tab1 = new OffenseShort();
                return tab1;
            } else {
                OffenseLong tab2 = new OffenseLong();
                return tab2;
            }
        } else if (t.equals("routes")){
            if (position == 0) {
                OneRoute tab1 = new OneRoute();
                return tab1;
            } else if (position == 1){
                TwoRoute tab2 = new TwoRoute();
                return tab2;
            } else if (position == 2){
                ThreeRoute tab3 = new ThreeRoute();
                return tab3;
            } else if (position == 3){
                FourRoute tab4 = new FourRoute();
                return tab4;
            } else if (position == 4){
                FiveRoute tab5 = new FiveRoute();
                return tab5;
            } else if (position == 5){
                SixRoute tab6 = new SixRoute();
                return tab6;
            } else if (position == 6){
                SevenRoute tab7 = new SevenRoute();
                return tab7;
            } else if (position == 7){
                EightRoute tab8 = new EightRoute();
                return tab8;
            } else {
                NineRoute tab9 = new NineRoute();
                return tab9;
            }
        } else {
            if (position == 0){
                DefenseCover2 tab1 = new DefenseCover2();
                return tab1;
            } else {
                DefenseCover3 tab2 = new DefenseCover3();
                return tab2;
            }
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // This method return the titles for the Tabs in the Tab Strip
        return Titles[position];
    }

    @Override
    public int getCount() {
        // This method return the Number of tabs for the tabs Strip
        return NumbOfTabs;
    }
}