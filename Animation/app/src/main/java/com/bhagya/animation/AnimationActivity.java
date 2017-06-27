package com.bhagya.animation;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class AnimationActivity extends AppCompatActivity {
    LinearLayout v1,v2,v3,v4,v5,v6,v7;
    TextView counter;
    int count=0;
    LinearLayout view,viewcustom;
    Animation rotate,scale,alpha,tranlate,translate1,translate2,
            translate3,translate4,th1,th2,th3,th4,th5,ta1,ta2,ta3,ta4,ta5,tg1,
            tg2,tg3,tg4,tg5,ty1,ty2,ty3,ty4,ty5,tya1,tya2,tya3,tya4,tya5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);
        viewcustom= (LinearLayout) findViewById(R.id.customdailogue);
        view= (LinearLayout) findViewById(R.id.activity_animation);
        v1= (LinearLayout) findViewById(R.id.v1);
        v2= (LinearLayout) findViewById(R.id.v2);
        v3= (LinearLayout) findViewById(R.id.v3);
        v4= (LinearLayout) findViewById(R.id.v4);
        v5= (LinearLayout) findViewById(R.id.v5);
        v6= (LinearLayout) findViewById(R.id.v6);
        // v7= (LinearLayout) findViewById(R.id.v7);
        //  counter= (TextView) findViewById(R.id.counter);
        rotate= AnimationUtils.loadAnimation(this,R.anim.rotate);
        scale=AnimationUtils.loadAnimation(this,R.anim.scale);
        alpha=AnimationUtils.loadAnimation(this,R.anim.alpha);
        tranlate=AnimationUtils.loadAnimation(this,R.anim.translate);
        translate1=AnimationUtils.loadAnimation(this, R.anim.translation1);
        translate2=AnimationUtils.loadAnimation(this,R.anim.translate2);
        translate3=AnimationUtils.loadAnimation(this,R.anim.translate3);
        translate4=AnimationUtils.loadAnimation(this,R.anim.translate4);
        th1=AnimationUtils.loadAnimation(this,R.anim.translateh1);
        th2=AnimationUtils.loadAnimation(this,R.anim.translateh2);
        th3=AnimationUtils.loadAnimation(this,R.anim.translateh3);
        th4=AnimationUtils.loadAnimation(this,R.anim.translateh4);
        th5=AnimationUtils.loadAnimation(this,R.anim.translateh5);
        ta1=AnimationUtils.loadAnimation(this,R.anim.ta1);
        ta2=AnimationUtils.loadAnimation(this,R.anim.ta2);
        ta3=AnimationUtils.loadAnimation(this,R.anim.ta3);
        ta4=AnimationUtils.loadAnimation(this,R.anim.ta4);
        ta5=AnimationUtils.loadAnimation(this,R.anim.ta5);
        tg1=AnimationUtils.loadAnimation(this,R.anim.tg1);
        tg2=AnimationUtils.loadAnimation(this,R.anim.tg2);
        tg3=AnimationUtils.loadAnimation(this,R.anim.tg3);
        tg4=AnimationUtils.loadAnimation(this,R.anim.tg4);
        tg5=AnimationUtils.loadAnimation(this,R.anim.tg5);
        ty1=AnimationUtils.loadAnimation(this,R.anim.ty1);
        ty2=AnimationUtils.loadAnimation(this,R.anim.ty2);
        ty3=AnimationUtils.loadAnimation(this,R.anim.ty3);
        ty4=AnimationUtils.loadAnimation(this,R.anim.ty4);
        ty5=AnimationUtils.loadAnimation(this,R.anim.ty5);
        tya1=AnimationUtils.loadAnimation(this,R.anim.tya1);
//         tya2=AnimationUtils.loadAnimation(this,R.anim.tya2);
//         tya3=AnimationUtils.loadAnimation(this,R.anim.tya3);
//         tya4=AnimationUtils.loadAnimation(this,R.anim.tya4);
//        tya5=AnimationUtils.loadAnimation(this,R.anim.tya5);
        view.startAnimation(scale);

//        view.postDelayed(new Runnable() {
//            @Override
//            public void run() {
//
//                // viewcustom.startAnimation(rotate);
//                customDialog();
//
//            }
//        },1000) ;
        /**   v1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
        count++;
        counter.setText(count);

        }
        }); **/

        /**   v1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
        v1.startAnimation(rotate);
        }
        });
         **/
        rotate.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                v1.startAnimation(tranlate);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
                //  v1.startAnimation(rotate);

            }
        });
        tranlate.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                v1.startAnimation(translate1);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        translate1.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                v1.startAnimation(translate2);

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        translate2.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                v1.startAnimation(translate3);

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        translate3.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                v1.startAnimation(translate4);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
                // v1.startAnimation(tranlate);

            }
        });
        translate4.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                v2.startAnimation(scale);
                v2.startAnimation(th1);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        th1.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                v2.startAnimation(th2);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        th2.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                v2.startAnimation(th3);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        th3.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                v2.startAnimation(th4);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        th4.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                v2.startAnimation(th5);

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        th5.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                v3.startAnimation(ta1);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        ta1.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                v3.startAnimation(ta2);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        ta2.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                v3.startAnimation(ta3);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        ta3.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                v3.startAnimation(ta4);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        ta4.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                v3.startAnimation(ta5);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        ta5.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                //v4.startAnimation(scale);
                // v5.startAnimation(scale);
                //  v6.startAnimation(scale);
                //  v1.startAnimation(rotate);
                v4.startAnimation(tg1);


            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        tg1.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                v4.startAnimation(tg2);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        tg2.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                v4.startAnimation(tg3);

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        tg3.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                v4.startAnimation(tg4);

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        tg4.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                v4.startAnimation(tg5);

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        tg5.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                v5.startAnimation(ty1);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        ty1.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                v5.startAnimation(ty2);

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        ty2.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                v5.startAnimation(ty3);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        ty3.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                v5.startAnimation(ty4);

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        ty4.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {

                v5.startAnimation(ty5);
                v6.startAnimation(rotate);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });










    }
    public  void customDialog()
    {
        final Dialog dialog=new Dialog(this);
        View view=LayoutInflater.from(this).inflate(R.layout.customdailogue,null);

        //  final EditText value= (EditText) view.findViewById(R.id.editable);
        Button ok,cancel;
        // TextView message= (TextView) view.findViewById(R.id.massage);
        ok= (Button) view.findViewById(R.id.ok);
        cancel= (Button) view.findViewById(R.id.cancel);
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // String finalValue=value.getText().toString();
                // toastMessage(finalValue);
                dialog.dismiss();
            }
        });
        dialog.setContentView(view);
        dialog.setTitle("Dialog Title");
        dialog.show();


    }

}
