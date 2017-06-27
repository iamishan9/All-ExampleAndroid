
package com.example.bhagya.contentcheck;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.bhagya.contentcheck.fragment.BottomFragment;
import com.example.bhagya.contentcheck.fragment.Fragment1;
import com.example.bhagya.contentcheck.fragment.TopFragment;

public class ChangeFragment_withTab extends AppCompatActivity {
    TextView tab1,tab2,tab3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_fragment_with_tab);
        tab1= (TextView) findViewById(R.id.tab1);
        tab2= (TextView) findViewById(R.id.tab2);
        tab3= (TextView) findViewById(R.id.tab3);
        tab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.mainfragment,new TopFragment()).commit();
            }
        });
        tab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.mainfragment,new BottomFragment()).commit();
            }
        });
        tab3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.mainfragment,new Fragment1()).commit();
            }
        });

    }
}
