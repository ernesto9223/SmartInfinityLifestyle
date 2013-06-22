package hk.com.novare.smart.infinitylifestyle.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import hk.com.novare.smart.infinitylifestyle.R;

/**
 * Created by Ado on 6/21/13.
 */
public class BlankFragment extends Fragment {
    private static final String TAG = "hk.com.novare.smart.infinitylifestyle";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_blank, container, false);
        Log.i(TAG, "in blank fragment");
        return rootView;
    }
}
