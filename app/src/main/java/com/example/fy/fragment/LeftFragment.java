package com.example.fy.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class LeftFragment extends Fragment {


    public View onCreateView(LayoutInflater inflater , ViewGroup container, Bundle savedInstanceState) {
       View view =inflater.inflate(R.layout.left_frangment,container,false);
        return view;

    }
}
