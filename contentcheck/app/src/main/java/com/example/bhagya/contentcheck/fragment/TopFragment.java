package com.example.bhagya.contentcheck.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.bhagya.contentcheck.FragmentExampleActivity;
import com.example.bhagya.contentcheck.R;

/**
 * Created by Bhagya on 12/16/2016.
 */

public class TopFragment extends Fragment {

    Button signup;
    EditText name;
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

View view=inflater.inflate(R.layout.loginpage,null);
        signup= (Button) view.findViewById(R.id.sinupbutton);
name= (EditText) view.findViewById(R.id.name);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((FragmentExampleActivity)getActivity()).setValue(name.getText().toString());

            }
        });
        return view;
    }
}
