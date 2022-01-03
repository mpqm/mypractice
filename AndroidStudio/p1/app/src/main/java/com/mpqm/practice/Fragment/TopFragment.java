package com.mpqm.practice.Fragment;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mpqm.practice.R;

public class TopFragment extends Fragment implements View.OnClickListener{

    public TopFragment() {
        // Required empty public constructor
    }

    private OncolorButtonListener oncolorButtonListener;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        oncolorButtonListener = (OncolorButtonListener) context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_top, container, false);
        view.findViewById(R.id.v_red).setOnClickListener(this);
        view.findViewById(R.id.v_blue).setOnClickListener(this);
        view.findViewById(R.id.v_green).setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.v_red:
                oncolorButtonListener.onColorClick(0);
                break;
            case R.id.v_blue:
                oncolorButtonListener.onColorClick(1);
                break;
            case R.id.v_green:
                oncolorButtonListener.onColorClick(2);
                break;
        }
    }
}