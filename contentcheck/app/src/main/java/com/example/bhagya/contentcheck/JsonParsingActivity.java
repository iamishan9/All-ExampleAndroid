package com.example.bhagya.contentcheck;
import android.content.ContentValues;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.androidquery.AQuery;
import com.androidquery.callback.AjaxCallback;
import com.androidquery.callback.AjaxStatus;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Array;
import java.util.ArrayList;
public class JsonParsingActivity extends AppCompatActivity {
    Button button;
    ListView listView;
    userinfo userinfo=new userinfo();
    AQuery aQuery;
    String url="http://192.168.0.107/PanchviPass/select.php";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_json_parsing2);
        aQuery=new AQuery(this);
        button= (Button) findViewById(R.id.fetch);
        listView= (ListView) findViewById(R.id.listview);
        final DatabaseHelper databaseHelper=new DatabaseHelper(this);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FetchData();
                ContentValues cv=new ContentValues();
                cv.put("username",userinfo.username);
                cv.put("password",userinfo.phone);
                cv.put("phone",userinfo.address);
                    databaseHelper.insertUser(cv);
            }
        });
       // parsData(jsonArray);

    }
    public  void FetchData()
    {
        aQuery.ajax(url, JSONArray.class,new AjaxCallback<JSONArray>(){

            @Override
            public void callback(String url, JSONArray array, AjaxStatus status) {
                super.callback(url, array, status);
                Log.i("data:","response:"+array);
                try {
                    parsData(array);
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        });

    }
    public void parsData(JSONArray jsonArray) throws JSONException {
        ArrayList<userinfo> list=new ArrayList<userinfo>();
        for (int i=0;i<jsonArray.length();i++){
            JSONObject object=jsonArray.getJSONObject(i);
          userinfo.id= object.getString("id");
           userinfo.username=object.getString("questions") ;
            userinfo.address=object.getString("ansB");
            userinfo.phone=object.getString("ansA");
            list.add(userinfo);
        }
        populatedata(list);
    }
    public void populatedata(ArrayList<userinfo>list)
    {
        listAdapter listAdapter=new listAdapter(this,list);
        listView.setAdapter(listAdapter);
    }
    }


