package com.rashmi.brodway_android_rashmi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public void example(){

        }

public int example(int a){
        return a;
        }

public void example(int a,int b){
        return (a+b);

        }


public class MainActivity extends AppCompatActivity {

    Button sign_up;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up);

        sign_up = (Button) findViewById(R.id.submit);
        sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, HomeActivity.class);

                Bundle bundle = new Bundle();
                bundle.putString("key_value", "This is value");
                intent.putExtra("bundle", bundle);
                intent.putExtra("key", "value");
                startActivity(intent);
            }

        });
        example();

        Log.i("lifecycle","oncreate");
    }

    private void example() {

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("lifecycle","OnStart");
        example();
    }


    protected void onResume() {
        super.onResume();
        Log.i("lifecycle","OnResume");

    }

    protected void onPause(){
        super.onPause();
        Log.i("lifecycle","OnPause");
    }

    protected void onStop(){
        super.onStop();
        Log.i("lifecycle","OnStop");

    }

    protected void onRestart(){
        super.onRestart();
        Log.i("lifecycle","OnRestart");
    }

    protected void onDestroy(){
        super.onDestroy();
        Log.i("lifecycle","OnDestroy");
    }
}
