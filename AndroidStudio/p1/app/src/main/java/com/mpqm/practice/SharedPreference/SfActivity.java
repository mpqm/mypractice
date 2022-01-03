package com.mpqm.practice.SharedPreference;

import androidx.appcompat.app.AppCompatActivity;
import com.mpqm.practice.R;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class SfActivity extends AppCompatActivity {

    public static final String KEY = "1000";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sf);
        TextView tv_hello = (TextView)findViewById(R.id.tv_hello);

        SharedPreferences sharedPreferences = getPreferences(Context.MODE_PRIVATE);
        int firstUser = sharedPreferences.getInt("KEY",-1);
        //나중 실행 - 감사합니다 호갱님  user = 1
        if (firstUser == 1){
            tv_hello.setText("감사합니다 호갱님");
        }
        //최초 실행 - 안녕하세요 고객님  default = -1 -> first user
        else if (firstUser == -1){
            tv_hello.setText("안녕하세요 고객님");
            saveUserIsNotFirst();
        }
    }
    public void saveUserIsNotFirst() {
        SharedPreferences sharedPreferences = getPreferences(Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt(KEY, 1);
        editor.commit();
    }


}