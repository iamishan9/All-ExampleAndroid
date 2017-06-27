package com.bhagya.ceckdatabase;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Bhagya on 12/5/2016.
 */


public class DatabaseHelper extends SQLiteOpenHelper {

    static String dbname = "pass";
    String createTable = "CREATE TABLE if not exists `ansQsnLevel1` (\n" +
            "\t`SN`\tINTEGER PRIMARY KEY AUTOINCREMENT,\n" +
            "\t`question`\tTEXT,\n" +
            "\t`ansA`\tTEXT,\n" +
            "\t`ansB`\tTEXT,\n" +
            "\t`ansC`\tTEXT,\n" +
            "\t`ansD`\tTEXT,\n" +
            "\t`correctAns`\tTEXT\n" +
            ")";


    public DatabaseHelper(Context context) {
        super(context, dbname, null, 1);
        getWritableDatabase().execSQL(createTable);
       // getWritableDatabase().execSQL(createTalble2);
    }


    public void InsertQsnAns(ContentValues cv) {
        getWritableDatabase().insert("ansQsnLevel1", "", cv);
    }


    public qsn_ans_data getdata(int id) {

        String sql = "Select * from ansQsnLevel1 where SN=" + id;
        Cursor c = getWritableDatabase().rawQuery(sql, null);
        qsn_ans_data data = new qsn_ans_data();
        while (c.moveToNext()) {

            data.questions = c.getString(c.getColumnIndex("question"));
            data.ansA = c.getString(c.getColumnIndex("ansA"));
            data.ansB = c.getString(c.getColumnIndex("ansB"));
            data.ansC = c.getString(c.getColumnIndex("ansC"));
            data.ansD = c.getString(c.getColumnIndex("ansD"));
            data.correctAns = c.getString(c.getColumnIndex("correctAns"));


        }
        c.close();
        return data;

    }


    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
