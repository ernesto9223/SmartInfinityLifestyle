package hk.com.novare.smart.infinitylifestyle.fragments;

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

import hk.com.novare.smart.infinitylifestyle.R;
import hk.com.novare.smart.infinitylifestyle.fragments.privileges.IMOFragment;

/**
 * Created by Ado on 6/19/13.
 */
public class PremiumFragment extends ListFragment {
    private static final String TAG = "hk.com.novare.smart.infinitylifestyle";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_premium, container, false);
        Bundle args = getArguments();
        ListView lv = (ListView) rootView.findViewById(android.R.id.list);
        String[] strs = new String[]{"Infinity Management Officer", "International Concierge", "Dedicated Hotline", "Priority at Smart Stores"};
        final FragmentManager fm = getFragmentManager();

        ArrayAdapter<String> aa = new ArrayAdapter<String>(rootView.getContext(), android.R.layout.simple_list_item_1, strs);
        lv.setAdapter(aa);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Log.i(TAG, "item " + i + " selected");
                if (i==0){
                    Fragment imoFragment = new IMOFragment();
                    FragmentTransaction ft = fm.beginTransaction();
                    ft.replace(R.layout.fragment_premium, imoFragment);
                    ft.commit();
                }
            }
        });
        return rootView;
    }
}
