package com.example.ege.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class LeftFragment extends Fragment {


    interface LeftFragmentListener
    {
        void leftFragmentItemClicked(int position,String header);
    }
        ListView listView;
        LeftFragmentListener listener;
        ArrayAdapter<String> adp;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = getActivity().getLayoutInflater().inflate(R.layout.left_frg_layout,container,false);
        listView= listView.findViewById(R.id.listview);

        adp = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1);

        adp.add("Page1");
        adp.add("Page2");
        adp.add("Page3");
        adp.add("Page4");
        listView.setAdapter(adp);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                listener.leftFragmentItemClicked(position,adp.getItem(position));
            }
        });


        return v;
    }

    @Override
    public void onAttach(Context context) {

        super.onAttach(context);
    }
}
