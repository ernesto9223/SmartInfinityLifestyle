package hk.com.novare.smart.infinitylifestyle.fragments.privileges;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import hk.com.novare.smart.infinitylifestyle.R;

/**
 * Created by Ado on 6/19/13.
 */
public class PrioritySmartStoresFragment extends Fragment {
    private static final String TAG = "hk.com.novare.smart.infinitylifestyle";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_premium_prioritystores, container, false);
        Log.i(TAG, "in PriorityStoresFragment");
        return rootView;
    }
}
