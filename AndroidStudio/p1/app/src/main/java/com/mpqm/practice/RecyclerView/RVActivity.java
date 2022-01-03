package com.mpqm.practice.RecyclerView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.mpqm.practice.R;

import java.util.ArrayList;

public class RVActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rvactivity);

        ArrayList<PostItem> listItem = new ArrayList<>();
        RecyclerView rv_list = (RecyclerView) findViewById(R.id.rv_list);

        //데이터입력력
        for (int i = 0; i < 30; i++){
            PostItem item = new PostItem(true, 125, "https://d2v80xjmx68n4w.cloudfront.net/gigs/yAyXp1625971493.jpg", "irean","wow!");

            listItem.add(i, item);
        }

        PostAdapter adapter = new PostAdapter(this, listItem);
        rv_list.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        rv_list.setAdapter(adapter);
        }
    }