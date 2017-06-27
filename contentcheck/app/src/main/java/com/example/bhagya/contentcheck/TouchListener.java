







package com.example.bhagya.contentcheck;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class TouchListener extends AppCompatActivity {

    Button button;
     float initialX,initialY;
    RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_touch_listener);
        button= (Button) findViewById(R.id.button);
        relativeLayout= (RelativeLayout) findViewById(R.id.container);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        button.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                return false;
            }
        });


        button.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if (event.getAction()==MotionEvent.ACTION_DOWN)//when press the the button
                {
                    initialX=event.getRawX();
                    initialY=event.getRawY();


                }
                if(event.getAction()==MotionEvent.ACTION_MOVE){//when move the butom from one poin to another point
                    float finalX=event.getRawX()-200;
                    float finalY=event.getRawY()-200;
                    RelativeLayout.LayoutParams params=new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,RelativeLayout.LayoutParams.WRAP_CONTENT);
                    params.setMargins((int)finalX,(int)finalY,0,0);
                    button.setLayoutParams(params);
                }
                if(event.getAction()==MotionEvent.ACTION_UP){
                    float finalX=event.getX();
                    float finalY=event.getY();
                     Button newButton=new Button(TouchListener.this);
                    RelativeLayout.LayoutParams params=new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,RelativeLayout.LayoutParams.WRAP_CONTENT);
                       params.setMargins((int)finalX,(int)finalY,0,0);

                       // newButton.setId();
                        newButton.setText("ok");

                    newButton.setLayoutParams(params);
                  //  relativeLayout.addView(newButton);

                    if(initialX<finalX){
                        Toast.makeText(TouchListener.this,"Right",Toast.LENGTH_SHORT).show();
                    }
                    if(initialX>finalX){
                        Toast.makeText(TouchListener.this,"Left",Toast.LENGTH_SHORT).show();
                    }
                    if(initialY<finalY){
                        Toast.makeText(TouchListener.this,"Down",Toast.LENGTH_SHORT).show();
                    }
                    if (initialY > finalY) {

                        Toast.makeText(TouchListener.this,"UP",Toast.LENGTH_SHORT).show();
                    }

                }
                return true;
            }
        });
    }
}
