package com.mpqm.practice.Glide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.mpqm.practice.R;

public class GlideActivity extends AppCompatActivity {
    ImageView iv_glideimage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glide);

        iv_glideimage = findViewById(R.id.iv_glideimage);

        findViewById(R.id.btn_download).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startLoadingImage();
            }
        });
    }

    private void startLoadingImage() {
        String url = "https://d2v80xjmx68n4w.cloudfront.net/gigs/yAyXp1625971493.jpg";
        Glide.with(this).load(url).into(iv_glideimage);
        //iv_glideimage.setImageBitmap();
    }
}