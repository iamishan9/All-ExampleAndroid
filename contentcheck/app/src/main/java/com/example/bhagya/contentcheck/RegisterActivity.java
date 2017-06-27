package com.example.bhagya.contentcheck;
import android.content.ContentValues;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Bhagya on 11/23/2016.
 */
public class RegisterActivity extends AppCompatActivity {
    SharedPreferences preferences;
    EditText name, password, email, mobileno, adress;
    DatePicker dob;
int id;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final DatabaseHelper dbhelper=new DatabaseHelper(this);
        setContentView(R.layout.register);
        preferences = getSharedPreferences("userInfo", 0);
        name = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        email = (EditText) findViewById(R.id.emailid);
         dob=(DatePicker) findViewById(R.id.dob);
        mobileno = (EditText) findViewById(R.id.phoneno);
        adress = (EditText) findViewById(R.id.adress);
        id=getIntent().getIntExtra("id",0);


        if(id!=0){
            userinfo info=dbhelper.getsingle_UserData(id+"");
            name.setText(info.username);
            password.setText(info.password);

        }



        findViewById(R.id.signup).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String dobValue=dob.getYear()+"-"+(dob.getMonth())+1+"-"+dob.getDayOfMonth();
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
                editor.putString("dob",dobValue);
                editor.commit();  //for writing the all data in the sharepreference file or in content




                ContentValues cv=new ContentValues();
             cv.put("username",nameValue);
                cv.put("password",passwordvalue);
                cv.put("phone",adresValue);
                if(id==0) {
                    dbhelper.insertUser(cv);
                    Toast.makeText(RegisterActivity.this,"Data Succesfully inserted",Toast.LENGTH_SHORT);
                }
                else {
                    dbhelper.updateUserdata(cv,id+"");
                    finish();
                }

            }
        });


    }
}
