package com.example.weather;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;


/**
 * A simple {@link Fragment} subclass.
 */
public class TodayInfoFragment extends Fragment {


    public TodayInfoFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_taday_info, container, false);
        TextView tv = (TextView) view.findViewById(R.id.tv_todayfragment);

        String text = getArguments().getString("text");
        tv.setText(text);
        return view;
    }

}
