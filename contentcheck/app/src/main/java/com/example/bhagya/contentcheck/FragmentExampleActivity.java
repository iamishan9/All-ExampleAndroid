package com.example.bhagya.contentcheck;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.bhagya.contentcheck.fragment.BottomFragment;
import com.example.bhagya.contentcheck.fragment.Fragment1;
import com.example.bhagya.contentcheck.fragment.TopFragment;

public class FragmentExampleActivity extends AppCompatActivity {
TopFragment topFragment;
    BottomFragment bottomFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_example);
topFragment=new TopFragment();
        bottomFragment=new BottomFragment();
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction transaction=fragmentManager.beginTransaction();
        transaction.replace(R.id.topframe,topFragment);
        transaction.replace(R.id.botomframe,bottomFragment);
        transaction.commit();

    }
    public  void  changeFragment(){
        getSupportFragmentManager().beginTransaction().replace(R.id.botomframe,new Fragment1()).commit();


    }
    public  void setValue(String value){
        bottomFragment.setUsername(value);
    }

}
