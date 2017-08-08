package com.originalix.lix.helloandroid;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

/**
 * Created by Lix on 2017/8/7.
 */

public class MyDatabaseHelper extends SQLiteOpenHelper {
    public static final String CREATE_BOOK = "CREATE TABLE book ("
            + "id INTEGER PRIMARY KEY AUTOINCREMENT, "
            + "author TEXT, "
            + "price REAL, "
            + "pages INTEGER, "
            + "name TEXT)";

    public static final String CREATE_CATEGORY = "CREATE TABLE category ("
            + "id INTEGER PRIMARY KEY AUTOINCREMENT, "
            + "category_name TEXT, "
            + "category_code INTEGER )";

    private Context mContext;

    public MyDatabaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
        mContext = context;
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(CREATE_BOOK);
        sqLiteDatabase.execSQL(CREATE_CATEGORY);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        switch (i) {
            case 1:
            case 2:
                sqLiteDatabase.execSQL("alter table book add column category_id integer");
            default:
        }
    }
}
