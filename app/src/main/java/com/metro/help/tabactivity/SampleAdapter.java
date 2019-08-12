package com.metro.help.tabactivity;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class SampleAdapter extends FragmentPagerAdapter {
    private Context mContext;

    public SampleAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if(position == 0) {
            return FirstFragment.newInstance(position + 1);
        } else if(position == 1) {
            return SecondFragment.newInstance(position + 1);
        } else if(position == 2) {
            return ThirdFragment.newInstance(position + 1);
        } else {
            return FourthFragment.newInstance(position + 1);
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "역무실 보관금\n계산기";
            case 1:
                return "금고 시재\n계산기";
            case 2:
                return "열차 도착\n알람";
            case 3:
                return "실시간\n열차운행정보";
            default:
                return null;
        }
    }


}
