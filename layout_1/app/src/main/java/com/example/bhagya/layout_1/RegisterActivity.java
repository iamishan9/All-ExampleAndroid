package com.example.bhagya.layout_1;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;

/**
 * Created by Bhagya on 11/23/2016.
 */
public class RegisterActivity extends AppCompatActivity {
    SharedPreferences preferences;
    EditText name, password, email, mobileno, adress;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);
        preferences = getSharedPreferences("userInfo", 0);
        name = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        email = (EditText) findViewById(R.id.emailid);

        mobileno = (EditText) findViewById(R.id.phoneno);
        adress = (EditText) findViewById(R.id.adress);
        findViewById(R.id.signup).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nameValue = name.getText().toString();
                String passwordvalue = password.getText().toString();
                String emailVlaue = email.getText().toString();
                String mobileNo = mobileno.getText().toString();
                String adresValue = adress.getText().toString();
                SharedPreferences.Editor editor = preferences.edit();
                editor.putString("name", nameValue);
                editor.putString("password", passwordvalue);
                editor.putString("email", emailVlaue);
                editor.putString("mobile", mobileNo);
                editor.putString("adress", adresValue);
                editor.commit();

            }
        });


    }
}
