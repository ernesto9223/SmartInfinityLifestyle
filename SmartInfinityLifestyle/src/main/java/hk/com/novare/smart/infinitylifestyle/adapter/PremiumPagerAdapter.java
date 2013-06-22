package hk.com.novare.smart.infinitylifestyle.adapter;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.util.Log;

import hk.com.novare.smart.infinitylifestyle.fragments.LatestFragment;
import hk.com.novare.smart.infinitylifestyle.fragments.MySmartFragment;
import hk.com.novare.smart.infinitylifestyle.fragments.PerksFragment;
import hk.com.novare.smart.infinitylifestyle.fragments.PremiumFragment;
import hk.com.novare.smart.infinitylifestyle.fragments.ServicesFragment;
import hk.com.novare.smart.infinitylifestyle.fragments.privileges.DedicatedHotlineFragment;
import hk.com.novare.smart.infinitylifestyle.fragments.privileges.IMOFragment;
import hk.com.novare.smart.infinitylifestyle.fragments.privileges.IntlConciergeFragment;
import hk.com.novare.smart.infinitylifestyle.fragments.privileges.PrioritySmartStoresFragment;

/**
 * Created by Ado on 6/19/13.
 */
public class PremiumPagerAdapter extends FragmentStatePagerAdapter {
    private static final String TAG = "hk.com.novare.smart.infinitylifestyle";
    public PremiumPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        Fragment fragment = null;

        Log.i(TAG, "int i=" + i);

        switch (i) {
            case 0: fragment = new IMOFragment(); break;
            case 1: fragment = new IntlConciergeFragment(); break;
            case 2: fragment = new DedicatedHotlineFragment(); break;
            case 3: fragment = new PrioritySmartStoresFragment(); break;
        }

        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return "OBJECT " + (position + 1);
    }
}
