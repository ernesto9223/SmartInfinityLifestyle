package hk.com.novare.smart.infinitylifestyle;

import android.app.ActionBar;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.Menu;

import hk.com.novare.smart.infinitylifestyle.adapter.CategoryPagerAdapter;
import hk.com.novare.smart.infinitylifestyle.adapter.PremiumPagerAdapter;

/**
 * Created by Ado on 6/22/13.
 */
public class PremiumActivity extends FragmentActivity {
    private static final String TAG = "hk.com.novare.smart.infinitylifestyle";
    PremiumPagerAdapter ppa;
    ViewPager vp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_premium);
        final ActionBar ab = getActionBar();
        ab.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        Bundle premiumItems = this.getIntent().getBundleExtra("premiumItems");

        Log.i(TAG, premiumItems != null ? "bundle idx=" + premiumItems.getInt("idx") + "" : "none");
        ppa = new PremiumPagerAdapter(getSupportFragmentManager());
        vp = (ViewPager) findViewById(R.id.imoPager);

        ActionBar.TabListener tabListener = new ActionBar.TabListener() {

            @Override
            public void onTabSelected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
                Log.i(TAG, "onTabSelected" + tab.getPosition());
                vp.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
                Log.i(TAG, "onTabUnselected" + tab.getPosition());

            }

            @Override
            public void onTabReselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
                Log.i(TAG, "onTabReselected" + tab.getPosition());
            }
        };

        // Add 3 tabs, specifying the tab's text and TabListener
        for (int i = 0; i < 4; i++) {
            ActionBar.Tab tab = ab.newTab();
            switch (i) {
                case 0:
                    tab.setText("Infinity Management Officer");
                    break;
                case 1:
                    tab.setText("International Concierge");
                    break;
                case 2:
                    tab.setText("Dedicated Hotline");
                    break;
                case 3:
                    tab.setText("Priority at Smart Stores");
                    break;
            }

            tab.setTabListener(tabListener);
            ab.addTab(tab);
        }

        vp.setAdapter(ppa);
        vp.setOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {
            @Override
            public void onPageSelected(int position) {
                Log.i(TAG, "onPageSelected " + position);
                ab.setSelectedNavigationItem(position);
            }
        });
        //getActionBar().setSelectedNavigationItem(premiumItems.getInt("idx"));
        ab.setSelectedNavigationItem(3);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

}
