package com.example.ege.fragments;


import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity implements LeftFragment.LeftFragmentListener {

    FrameLayout layoutLeft;
    FrameLayout layoutRight;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentTransaction  fragmentTransaction= getSupportFragmentManager().beginTransaction();
        LeftFragment leftFragment = new LeftFragment();
        fragmentTransaction.add(R.id.listview,leftFragment);

        fragmentTransaction.commit();
    }

    @Override
    public void leftFragmentItemClicked(int position,String header)
    {
        Bundle bundle = new Bundle();
        bundle.putInt("position",position);
        bundle.putString("HEADER", header);

        RightFragment rightFragment = new RightFragment();

        rightFragment.setArguments(bundle);

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

        transaction.replace(R.id.contentcontainer,rightFragment);

    }

}
