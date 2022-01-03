package com.mpqm.practice.Fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.mpqm.practice.R;

public class FragmentActivity extends AppCompatActivity implements OncolorButtonListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);
    }
    //color 0: red, 1: blue, 2: green
    @Override
    public void onColorClick(int color) {
        Fragment fragment = null;
        switch (color){
            case 0:
                fragment = new RedFragment();
                break;
            case 1:
                fragment = new BlueFragment();
                break;
            case 2:
                fragment = new GreenFragment();
                break;
        }
        getSupportFragmentManager().beginTransaction().replace(R.id.fl_bottom, fragment).commit();
    }
}