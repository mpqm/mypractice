package com.mpqm.practice.Async;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.mpqm.practice.R;

public class AsyncActivity extends AppCompatActivity {
    private TextView tv_display;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_async);
        tv_display = (TextView)findViewById(R.id.tv_display);
        findViewById(R.id.btn_start).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startAsyncCalculation();
            }
        });
    }

    private void startAsyncCalculation() {
        //execute(1, 100_000_000)
        AsyncCalculateTask task = new AsyncCalculateTask();
        task.execute(1, Integer.MAX_VALUE);
    }
    class AsyncCalculateTask extends AsyncTask<Integer, Integer, Integer>{
        //Async Thread Method
        @Override
        protected Integer doInBackground(Integer... integers) {
            int number = integers[0];
            int count = integers[1];
            int result = 0;

            int percentunit = count /100;

            for(int i = 0; i < count; i ++){
                result += number;
                if(result % percentunit == 0){
                    publishProgress(result/percentunit);
                }
            }
            return result;
        }

        @Override
        protected void onProgressUpdate(Integer... values) {
            super.onProgressUpdate(values);
            tv_display.setText(values[0] + "percent");
        }

        //UI Thread
        @Override
        protected void onPostExecute(Integer integer) {
            super.onPostExecute(integer);
            tv_display.setText("Result : "+integer);
        }
    }
}