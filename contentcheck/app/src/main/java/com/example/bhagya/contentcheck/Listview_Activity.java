package com.example.bhagya.contentcheck;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.ListView;

public class Listview_Activity extends AppCompatActivity {
ListView listView;
    GridView gridView;
 DatabaseHelper dbhelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview_);
        listView= (ListView) findViewById(R.id.listview);
        gridView= (GridView) findViewById(R.id.gridview);
        dbhelper=new DatabaseHelper(this);
        listView.setAdapter(new listAdapter(this,dbhelper.getUserData()));
        gridView.setAdapter(new listAdapter(this,dbhelper.getUserData()));
    }
}
