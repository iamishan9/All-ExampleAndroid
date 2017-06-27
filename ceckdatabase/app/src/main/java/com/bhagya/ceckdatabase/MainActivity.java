package com.bhagya.ceckdatabase;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        createDatabase();
    }
    private void createDatabase() {


        try {
            boolean dbExist = checkDataBaseExit();
            Log.i("check","createdatabse");
            if (!dbExist) {
                String mydbDir = "/data/data" + getPackageName() + "/databases";
                (new File(mydbDir)).mkdir();
                OutputStream dos = new FileOutputStream("/data/data/" + getPackageName() + "/databases/" + DatabaseHelper.dbname);
                InputStream dis = getResources().openRawResource(R.raw.test1);
                byte[] buffer = new byte[1024];
                int length;
                while ((length = dis.read(buffer)) > 0) {
                    dos.write(buffer);

                }
                dos.flush();
                dos.close();
                dis.close();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private boolean checkDataBaseExit() {
        SQLiteDatabase checkDB = null;
        Log.i("checkdatabase","database cheked");
        try {
            String mypath = "/data/data/" + getPackageName() + "/databases/" + DatabaseHelper.dbname;
            checkDB = SQLiteDatabase.openDatabase(mypath, null, SQLiteDatabase.OPEN_READONLY);

        } catch (SQLiteException e) {
            return false;

        }
        if (checkDB != null) {
            checkDB.close();
        }
        return checkDB != null ? true : false;
    }
}
