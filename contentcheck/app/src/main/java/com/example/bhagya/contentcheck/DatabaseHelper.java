
package com.example.bhagya.contentcheck;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

/**
 * Created by Bhagya on 12/1/2016.
 */
public class DatabaseHelper extends SQLiteOpenHelper {
 static String name="myinfo";
    static int version=1;

    String createTable="CREATE TABLE if not exists `personal` (\n" +
            "\t`id`\tINTEGER PRIMARY KEY AUTOINCREMENT,\n" +
            "\t`username`\tTEXT,\n" +
            "\t`password`\tTEXT,\n" +
            "\t`phone`\tTEXT,\n" +
            "\t`address`\tTEXT\n" +
            ")";

    public DatabaseHelper(Context context) {
        super(context, name,null , version);
        getWritableDatabase().execSQL(createTable);


}
public  void insertUser(ContentValues cv)
{
    getWritableDatabase().insert("personal","",cv);
}


    public void  updateUserdata(ContentValues cv, String id){
        getWritableDatabase().update("personal",cv,"id="+id,null);
    }


    public  ArrayList<userinfo> getUserData()
    {
        String sql="Select * from personal";
       Cursor c = getWritableDatabase().rawQuery(sql,null);
        ArrayList<userinfo> list=new ArrayList<userinfo>();
        while (c.moveToNext()){
         userinfo info=new userinfo();
            info.id= c.getString(c.getColumnIndex("id"));
            info.username= c.getString(c.getColumnIndex("username"));
            info.password= c.getString(c.getColumnIndex("password"));
            info.address= c.getString(c.getColumnIndex("address"));
            info.phone= c.getString(c.getColumnIndex("phone"));
            list.add(info);

        }
        c.close();
        return  list;

    }

    public  userinfo getsingle_UserData(String id)
    {
        String sql="Select * from personal where id="+id;
        Cursor c = getWritableDatabase().rawQuery(sql,null);
        userinfo info=new userinfo();
               while (c.moveToNext()){

            info.id= c.getString(c.getColumnIndex("id"));
            info.username= c.getString(c.getColumnIndex("username"));
            info.password= c.getString(c.getColumnIndex("password"));
            info.address= c.getString(c.getColumnIndex("address"));
            info.phone= c.getString(c.getColumnIndex("phone"));



        }
        c.close();
        return info;

    }
    public void delteUser(String id){
        getWritableDatabase().delete("personal","id="+id,null);

    }





    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}