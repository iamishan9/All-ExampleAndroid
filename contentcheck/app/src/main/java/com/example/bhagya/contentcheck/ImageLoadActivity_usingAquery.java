package com.example.bhagya.contentcheck;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.androidquery.AQuery;

public class ImageLoadActivity_usingAquery extends AppCompatActivity {
ImageView imageView;
    AQuery aQuery;
    String url="http://im.rediff.com/movies/2016/jan/08worst-performance-heroine-tamil-cinema3.jpg";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_load_using_aquery);
        imageView= (ImageView) findViewById(R.id.image);
        aQuery=new AQuery(this);
        aQuery.id(imageView).image(url,true,true);

    }
}
