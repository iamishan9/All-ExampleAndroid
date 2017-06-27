package com.example.bhagya.contentcheck;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.bhagya.contentcheck.fragment.BottomFragment;
import com.example.bhagya.contentcheck.fragment.Fragment1;
import com.example.bhagya.contentcheck.fragment.TopFragment;

public class ViewPager extends AppCompatActivity {
android.support.v4.view.ViewPager pager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);
     pager= (android.support.v4.view.ViewPager) findViewById(R.id.pager1);

        pager.setAdapter(new ViewPagerAdapter(getSupportFragmentManager()));
    }

    public  class ViewPagerAdapter extends FragmentPagerAdapter{

        public ViewPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            if(position==0){
                   return new TopFragment();
            }
            else if(position==1){

                return  new BottomFragment();

            }else if(position==2){
                return  new Fragment1();

            }

            return new Fragment1();
        }

        @Override
        public int getCount() {
            return 10;
        }
    }
}
