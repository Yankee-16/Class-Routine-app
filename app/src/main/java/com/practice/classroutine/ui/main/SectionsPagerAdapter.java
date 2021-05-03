package com.practice.classroutine.ui.main;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.practice.classroutine.Friday;
import com.practice.classroutine.Monday;
import com.practice.classroutine.R;
import com.practice.classroutine.Saturday;
import com.practice.classroutine.Sunday;
import com.practice.classroutine.Thursday;
import com.practice.classroutine.Tuesday;
import com.practice.classroutine.Wednesday;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.saturday, R.string.sunday, R.string.monday, R.string.tuesday, R.string.wednesday, R.string.thursday, R.string.friday};
    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;

        switch (position) {
            case 0:
                fragment = new Saturday();
                break;
            case 1:
                fragment = new Sunday();
                break;
            case 2:
                fragment = new Monday();
                break;
            case 3:
                fragment = new Tuesday();
                break;
            case 4:
                fragment = new Wednesday();
                break;
            case 5:
                fragment = new Thursday();
                break;
            case 6:
                fragment = new Friday();
                break;
        }

        return fragment;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(TAB_TITLES[position]);
    }

    @Override
    public int getCount() {
        return 7;
    }
}