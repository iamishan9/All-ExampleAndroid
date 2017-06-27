package com.example.bhagya.contentcheck;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class customToast_dailogActivity extends AppCompatActivity {
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_toast_dailog);
        button= (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // Toast.makeText(customToast_dailogActivity.this,"toast Massage",Toast.LENGTH_SHORT).show();
               // toastMessage("Test message");
                customDialog();

            }
        });
    }
    public  void toastMessage(String msg){

Toast toast=new Toast(this);
        toast.setDuration(Toast.LENGTH_SHORT);
        View view= LayoutInflater.from(this).inflate(R.layout.customoast,null);

        TextView message = (TextView) view.findViewById(R.id.massage);
       message.setText(msg);
        toast.setView(view);
        toast.setGravity(Gravity.CENTER_VERTICAL,0,0);
        toast.show();

    }
    public  void customDialog()
    {
        final Dialog dialog=new Dialog(this);
        View view=LayoutInflater.from(this).inflate(R.layout.customdailogue,null);
        final EditText value= (EditText) view.findViewById(R.id.editable);
        Button ok,cancel;
        TextView message= (TextView) view.findViewById(R.id.massage);
        ok= (Button) view.findViewById(R.id.ok);
        cancel= (Button) view.findViewById(R.id.cancel);
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String finalValue=value.getText().toString();
                toastMessage(finalValue);
                dialog.dismiss();
            }
        });
        dialog.setContentView(view);
        dialog.setTitle("Dialog Title");
        dialog.show();


    }

}
