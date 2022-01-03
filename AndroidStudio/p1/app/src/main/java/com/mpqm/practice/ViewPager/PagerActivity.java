package com.mpqm.practice.ViewPager;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;
import com.mpqm.practice.R;
import android.os.Bundle;

public class PagerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pager);

        TabLayout tabLayout = findViewById(R.id.tl_tabs);
        ViewPager viewPager = findViewById(R.id.vp_pager);

        Fragment[] arrFragments = new Fragment[3];
        arrFragments[0] = new BlackFragment();
        arrFragments[1] = new YellowFragment();
        arrFragments[2] = new PinkFragment();

        MyPagerAdapter adapter = new MyPagerAdapter(getSupportFragmentManager(), arrFragments);
        viewPager.setAdapter(adapter);

        tabLayout.setupWithViewPager(viewPager);
    }
    private class MyPagerAdapter extends FragmentPagerAdapter{
        private Fragment[] arrFragments;
        public MyPagerAdapter(@NonNull FragmentManager fm, Fragment[] arrFragments) {
            super(fm);
            this.arrFragments = arrFragments;
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            return arrFragments[position];
        }

        @Override
        public int getCount() {
            return arrFragments.length;
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            switch (position){
                case 0:
                    return "BLACK";
                case 1:
                    return "YELLOW";
                case 2:
                    return "PINK";
                default:
                    return "";
            }
        }
    }
}