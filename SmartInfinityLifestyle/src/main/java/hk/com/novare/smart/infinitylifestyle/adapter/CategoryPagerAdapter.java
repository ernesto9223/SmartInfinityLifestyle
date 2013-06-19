package hk.com.novare.smart.infinitylifestyle.adapter;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import hk.com.novare.smart.infinitylifestyle.fragments.LatestFragment;
import hk.com.novare.smart.infinitylifestyle.fragments.MySmartFragment;
import hk.com.novare.smart.infinitylifestyle.fragments.PerksFragment;
import hk.com.novare.smart.infinitylifestyle.fragments.PremiumFragment;
import hk.com.novare.smart.infinitylifestyle.fragments.ServicesFragment;

/**
 * Created by Ado on 6/19/13.
 */
public class CategoryPagerAdapter extends FragmentStatePagerAdapter {
    public CategoryPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        Fragment fragment = null;

        switch(i){
            case 0: fragment = new LatestFragment(); break;
            case 1: fragment = new PremiumFragment(); break;
            case 2: fragment = new PerksFragment(); break;
            case 3: fragment = new MySmartFragment(); break;
            case 4: fragment = new ServicesFragment(); break;
        }

        Bundle args = new Bundle();
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
