package com.example.bhagya.contentcheck;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button sinup,login1,showdatabt;
    SharedPreferences preferences;
    EditText username,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loginpage);
        preferences=getSharedPreferences("userInfo",0);
       login1=(Button)findViewById(R.id.login);
        username=(EditText) findViewById(R.id.name);
        password=(EditText)findViewById(R.id.password);
        sinup = (Button) findViewById(R.id.sinupbutton);
        showdatabt=(Button) findViewById(R.id.showdata);
        showdatabt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,ShowData.class);
                startActivity(intent);
            }
        });
        sinup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,RegisterActivity.class);
                startActivity(intent);
            }
        });

login1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        String registerusernameVlaue=preferences.getString("name","");
        String registerPassworvalue=preferences.getString("password","");
       // username.setText(preferences.getString("name",""));
        String usernameVlaue=username.getText().toString();
        String passwordVlaue=password.getText().toString();
        //Toast.makeText(MainActivity.this,"testok",Toast.LENGTH_LONG).show();
        if(passwordVlaue.equals(registerPassworvalue) && usernameVlaue.equals(registerusernameVlaue)){

            Toast.makeText(MainActivity.this,"login sucessful",Toast.LENGTH_LONG).show();

        }
        else{
            Toast.makeText(MainActivity.this,"login failer",Toast.LENGTH_LONG).show();
        }

    }
});


    }
}



