package com.example.bhagya.contentcheck.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.example.bhagya.contentcheck.R;

/**
 * Created by Bhagya on 12/16/2016.
 */

public class BottomFragment extends Fragment {
    @Nullable

    EditText username;
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.register,null);
        username= (EditText) view.findViewById(R.id.username);
        return  view;
    }
    public  void setUsername(String value){

        username.setText(value);
    }

}
