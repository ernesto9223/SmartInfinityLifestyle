package hk.com.novare.smart.infinitylifestyle.adapter;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import hk.com.novare.smart.infinitylifestyle.fragments.LatestFragment;

/**
 * Created by Ado on 6/19/13.
 */
public class CategoryPagerAdapter extends FragmentStatePagerAdapter {
    public CategoryPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        Fragment fragment = new LatestFragment();
        Bundle args = new Bundle();
        args.putInt(LatestFragment.ARG_OBJECT, i+1);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return "OBJECT " + (position+1);
    }
}
