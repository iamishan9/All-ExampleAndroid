package com.example.bhagya.contentcheck;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import com.androidquery.AQuery;

import java.util.ArrayList;

/**
 * Created by Bhagya on 12/15/2016.
 */

public class listAdapter extends ArrayAdapter <userinfo>{
    Context context;
    VideoView videoView;
    AQuery aQuery;
    ImageView imageView;
    public listAdapter(Context context, ArrayList<userinfo>list) {
        super(context,0,list);
        this.context=context;

    }
    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
       aQuery=new AQuery(context);
        View view= LayoutInflater.from(context).inflate(R.layout.item_showdata,null);
        TextView username,password;
       // String string="<font color=\"red\">Red</font><font color=\"blue\">Blue</font><font color=\"green\">green</font>";
        username= (TextView) view.findViewById(R.id.username);
        password= (TextView) view.findViewById(R.id.password);
        imageView= (ImageView) view.findViewById(R.id.image);
        videoView= (VideoView) view.findViewById(R.id.vedio);
        final userinfo info=getItem(position);
        username.setText(Html.fromHtml("id="+info.id+"\n"+"user name= "+info.username));
        String url=info.address;
        String vediourl=info.phone;
        aQuery.id(imageView).image(url,true,true);


       // String mUrl = "http://www.servername.com/projects/projectname/videos/1361439400.mp4";
        MediaController videoMediaController = new MediaController(context);
        videoView.setVideoPath(vediourl);
        videoMediaController.setMediaPlayer(videoView);
        videoView.setMediaController(videoMediaController);
        videoView.requestFocus();
        videoView.start();

       // aQuery.id(videoView)
       // password.setText("password= "+info.password);
       // container.addView(view);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context,DetailActivity.class);
                intent.putExtra("id",info.id);
               context.startActivity(intent);
            }
        });
        return view;
    }
}
