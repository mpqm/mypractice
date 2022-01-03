package com.mpqm.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.mpqm.practice.Async.AsyncActivity;
import com.mpqm.practice.Fragment.FragmentActivity;
import com.mpqm.practice.Glide.GlideActivity;
import com.mpqm.practice.RecyclerView.RVActivity;
import com.mpqm.practice.SharedPreference.SfActivity;
import com.mpqm.practice.ViewPager.PagerActivity;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btn_fragment = findViewById(R.id.btn_fragment);
        btn_fragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(MainActivity.this, FragmentActivity.class);
                startActivity(intent2);
            }
        });

        Button btn_pager = findViewById(R.id.btn_pager);
        btn_pager.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(MainActivity.this, PagerActivity.class);
                startActivity(intent3);
            }
        });
        Button btn_sharedpreference = findViewById(R.id.btn_sharedpreference);
        btn_sharedpreference.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(MainActivity.this, SfActivity.class);
                startActivity(intent4);
            }
        });

        Button btn_post3 = findViewById(R.id.btn_post3);
        btn_post3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent6 = new Intent(MainActivity.this, RVActivity.class);
                startActivity(intent6);
            }
        });

        Button btn_async = findViewById(R.id.btn_async);
        btn_async.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent7 = new Intent(MainActivity.this, AsyncActivity.class);
                startActivity(intent7);
            }
        });

        Button btn_glide = findViewById(R.id.btn_glide);
        btn_glide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent8 = new Intent(MainActivity.this, GlideActivity.class);
                startActivity(intent8);
            }
        });

    }


}