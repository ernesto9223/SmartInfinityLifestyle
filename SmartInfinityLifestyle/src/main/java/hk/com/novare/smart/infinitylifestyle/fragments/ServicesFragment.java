package hk.com.novare.smart.infinitylifestyle.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import hk.com.novare.smart.infinitylifestyle.R;

/**
 * Created by Ado on 6/19/13.
 */
public class ServicesFragment extends Fragment{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_services, container, false);
        Bundle args = getArguments();
        return rootView;
    }
}
