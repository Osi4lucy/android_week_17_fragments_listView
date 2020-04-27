package com.solomon.listviewfragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentTwo extends Fragment {
TextView textView;


    public FragmentTwo() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_fragment_two, container, false);

        textView = rootView.findViewById(R.id.textView);
        Bundle bundle = getArguments();
        if(bundle != null){
            String item = bundle.getString("key");
            textView.setText(item);
        }
        return rootView;
    }

}
