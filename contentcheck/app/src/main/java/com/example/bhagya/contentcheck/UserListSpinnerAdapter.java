package com.example.bhagya.contentcheck;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Bhagya on 12/15/2016.
 */

public class UserListSpinnerAdapter extends ArrayAdapter<userinfo> {

    Context context;
    public UserListSpinnerAdapter(Context context, ArrayList<userinfo>list) {
        super(context,0,list);
        this.context=context;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        TextView textView=new TextView(context);
       userinfo info=getItem(position);
        textView.setText(info.username);
        textView.setPadding(10,10,10,10);

        return textView;
    }

    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        TextView textView=new TextView(context);
        userinfo info=getItem(position);
        textView.setText(info.username);
        textView.setPadding(10,10,10,10);

        return textView;
    }
}
