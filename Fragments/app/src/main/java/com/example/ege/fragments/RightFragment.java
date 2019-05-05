package com.example.ege.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class RightFragment extends Fragment {

    TextView txtHeader;
    TextView txtContext;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v= inflater.inflate(R.layout.right_frg_layout,container,false);
        txtHeader= v.findViewById(R.id.txtHeader);
        txtContext = v.findViewById(R.id.txtContext);
        return v;
    }
}
