package com.example.bhagya.contentcheck;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class DetailActivity extends AppCompatActivity {
String id;
    DatabaseHelper dbhelpher;
    Button update,delet;
    TextView username;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        id=getIntent().getStringExtra("id");
      //  Toast toast = Toast.makeText(DetailActivity.this, "hlw ", Toast.LENGTH_LONG);
        dbhelpher=new DatabaseHelper(this);
        update= (Button) findViewById(R.id.update);
        delet= (Button) findViewById(R.id.delet);

        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(DetailActivity.this,RegisterActivity.class);
                intent.putExtra("id",Integer.parseInt(id));
                startActivity(intent);
            }
        });

        showdata();
        delet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDoilouge();
            }
        });



    }
    public  void AlertDoilouge(){
        AlertDialog.Builder dialog= new AlertDialog.Builder(this);
        dialog.setTitle("Delet Item");
        dialog.setMessage("Are You Sure want to delet");
        dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dbhelpher.delteUser(id);
                finish();
            }
        });
        dialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        dialog.show();
    }






    public  void showdata()
    {
        userinfo userinfo=dbhelpher.getsingle_UserData(id);
       username= (TextView) findViewById(R.id.username);
        username.setText(userinfo.id+"\n"+userinfo.username+"\n "+userinfo.password+"\n "+userinfo.address);

    }



public void onResume()
{
    super.onResume();
    showdata();
}
}
