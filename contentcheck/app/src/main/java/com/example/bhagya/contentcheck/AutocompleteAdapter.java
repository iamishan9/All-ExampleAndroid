package com.example.bhagya.contentcheck;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Bhagya on 12/17/2016.
 */

public class AutocompleteAdapter extends ArrayAdapter<String> {
    Context context;
    public AutocompleteAdapter(Context context,ArrayList<String>list) {
        super(context,0,list);
       this.context=context;

    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        TextView textView=new TextView(context);
        String info=getItem(position);
        textView.setText(info);
        textView.setPadding(10,10,10,10);

        return textView;
    }


}
