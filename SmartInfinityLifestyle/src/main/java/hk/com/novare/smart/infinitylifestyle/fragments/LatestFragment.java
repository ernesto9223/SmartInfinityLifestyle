package hk.com.novare.smart.infinitylifestyle.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import hk.com.novare.smart.infinitylifestyle.R;

/**
 * Created by Ado on 6/19/13.
 */
public class LatestFragment extends Fragment {
    public static final String ARG_OBJECT = "object";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_latest, container, false);
        Bundle args = getArguments();
        ((TextView) rootView.findViewById(R.id.tvLatest)).setText(Integer.toString(args.getInt(ARG_OBJECT)));
        return rootView;
    }
}
