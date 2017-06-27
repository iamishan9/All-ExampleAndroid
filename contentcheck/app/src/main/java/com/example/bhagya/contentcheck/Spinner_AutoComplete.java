package com.example.bhagya.contentcheck;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.AutoCompleteTextView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class Spinner_AutoComplete extends AppCompatActivity {
Spinner spinner;
    AutoCompleteTextView autoCompleteTextView;
    DatabaseHelper databaseHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        databaseHelper=new DatabaseHelper(this);
        setContentView(R.layout.activity_spinner__auto_complete);
        spinner= (Spinner) findViewById(R.id.spinner);
        autoCompleteTextView= (AutoCompleteTextView) findViewById(R.id.autotext);
        spinner.setAdapter(new UserListSpinnerAdapter(this,databaseHelper.getUserData()));
        autoCompleteTextView.setAdapter(new AutocompleteAdapter(this,getUserArraylist()));
       userinfo info= (userinfo) spinner.getSelectedItem();
        Toast.makeText(Spinner_AutoComplete.this,info.password,Toast.LENGTH_SHORT).show();
    }

    public  ArrayList<String> getUserArraylist()
    {

        ArrayList<String> list=new ArrayList<String>();
        ArrayList<userinfo>userinfolist=databaseHelper.getUserData();
        for(int i=0;i<userinfolist.size();i++){
            userinfo info=userinfolist.get(i);
            list.add(info.username);
        }

return list;
    }

}
