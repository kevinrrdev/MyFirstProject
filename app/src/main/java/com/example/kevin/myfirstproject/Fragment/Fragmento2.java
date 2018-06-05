package com.example.kevin.myfirstproject.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TabHost;

import com.example.kevin.myfirstproject.R;

public class Fragmento2 extends Fragment {

    private static final String ARG_PARAM1 = "param1";
    private View vPrincipal;
    private String mParam1;

    public static Fragmento2 newInstance(String param1) {
        Fragmento2 fragment = new Fragmento2();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView( LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        vPrincipal= inflater.inflate(R.layout.fragment_2,container,false);

        return vPrincipal;
    }


}
