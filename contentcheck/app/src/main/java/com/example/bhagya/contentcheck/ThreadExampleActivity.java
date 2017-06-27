package com.example.bhagya.contentcheck;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ThreadExampleActivity extends AppCompatActivity {
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thread_example);
        button= (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                timeConsumingTask();
            }
        });

    }

    public void timeConsumingTask()  {
        for (int i=0;i<10;i++){
            Log.i("count","count "+i);
            try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
                e.printStackTrace();
            }


    }}}

