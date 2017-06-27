package com.example.bhagya.contentcheck;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class ShowData extends AppCompatActivity {
    DatabaseHelper dbhelper;
LinearLayout container;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_showdata);
        dbhelper =new DatabaseHelper(this);
        container =  (LinearLayout) findViewById(R.id.display);
        showdata();

    }

    @Override
    protected void onResume() {
        super.onResume();
        showdata();

    }

    public  void showdata(){

        ArrayList<userinfo> list=dbhelper.getUserData();
        container.removeAllViews();
        for (int i=1;i<list.size();i++){
            View view= LayoutInflater.from(this).inflate(R.layout.item_showdata,null);
            TextView username,password;
            String string="<font color=\"red\">Red</font><font color=\"blue\">Blue</font><font color=\"green\">green</font>";
            username= (TextView) view.findViewById(R.id.username);
            password= (TextView) view.findViewById(R.id.password);
            final userinfo info=list.get(i);
            username.setText(Html.fromHtml(string+"\n"+" user name= "+info.username));
            password.setText("password= "+info.password);
            container.addView(view);
            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(ShowData.this,DetailActivity.class);
                    intent.putExtra("id",info.id);
                    startActivity(intent);
                }
            });
        }

    }

}
