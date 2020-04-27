package com.solomon.listviewfragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentOne extends Fragment {

ListView listViewOne;
ArrayList<String> arrayList;
ArrayAdapter<String> adapter;
    public FragmentOne() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_fragment_one, container, false);
        listViewOne = rootView.findViewById(R.id.listView1);
        arrayList = new ArrayList<String>();
        adapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_list_item_activated_1,arrayList);
        listViewOne.setAdapter(adapter);
            arrayList.add("Node js");
        arrayList.add("Node js");
        arrayList.add("Java");
        arrayList.add("HTML & CSS");
        arrayList.add("React");
        arrayList.add("JavaScript");
        arrayList.add("C++");
        arrayList.add("Angular Js");
        arrayList.add("Android Development");
        arrayList.add("Python");
        arrayList.add("IOS Development");
        arrayList.add("AWS and Apache");

        listViewOne.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item = arrayList.get(position);
                MainActivity mainActivity = (MainActivity) getActivity();
                mainActivity.data(item);
            }
        });
        return rootView;
}

}
