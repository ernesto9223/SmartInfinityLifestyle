package hk.com.novare.smart.infinitylifestyle.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.ListFragment;
import android.support.v4.widget.SimpleCursorAdapter;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import hk.com.novare.smart.infinitylifestyle.PremiumActivity;
import hk.com.novare.smart.infinitylifestyle.R;
import hk.com.novare.smart.infinitylifestyle.fragments.privileges.IMOFragment;

/**
 * Created by Ado on 6/19/13.
 */
public class PremiumFragment extends ListFragment {
    private static final String TAG = "hk.com.novare.smart.infinitylifestyle";
    FragmentManager fm;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_premium, container, false);
        Bundle args = getArguments();
        ListView lv = (ListView) rootView.findViewById(android.R.id.list);
        String[] strs = new String[]{"Infinity Management Officer", "International Concierge", "Dedicated Hotline", "Priority at Smart Stores"};
        fm = getActivity().getSupportFragmentManager();

        ArrayAdapter<String> aa = new ArrayAdapter<String>(rootView.getContext(), android.R.layout.simple_list_item_1, strs);
        lv.setAdapter(aa);
        lv.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Log.i(TAG, "item selected");
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Log.i(TAG, "on nothing selected");
            }
        });
        return rootView;
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        Log.i(TAG, "item " + position + " onlistitemclick");
        Intent iPremium = new Intent(getActivity(), PremiumActivity.class);
        Bundle bPremium = new Bundle();
        bPremium.putInt("idx", position);
        iPremium.putExtra("premiumItems", bPremium);
        startActivity(iPremium);
    }
}
