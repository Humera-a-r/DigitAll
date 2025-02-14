package com.example.digitall.UI.Authentication;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "authentication.db";
    private static final int DATABASE_VERSION = 1;
    private static final String TABLE_USERS = "users";
    private static final String COLUMN_ID = "id";
    private static final String COLUMN_FULLNAME = "fullname";
    private static final String COLUMN_EMAIL = "email";
    private static final String COLUMN_PASSWORD = "password";

    // Create table SQL query
    private static final String CREATE_TABLE_USERS = "CREATE TABLE " + TABLE_USERS + "("
            + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + COLUMN_FULLNAME + " TEXT,"
            + COLUMN_EMAIL + " TEXT,"
            + COLUMN_PASSWORD + " TEXT"
            + ")";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE_USERS);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_USERS);
        onCreate(db);
    }

    // Method to add new user
    public void addUser(String fullname, String email, String password) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(COLUMN_FULLNAME, fullname);
        values.put(COLUMN_EMAIL, email);
        values.put(COLUMN_PASSWORD, password);
        db.insert(TABLE_USERS, null, values);
        db.close();
    }

    // Method to check if email exists
    public boolean checkEmail(String email) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.query(TABLE_USERS, new String[]{COLUMN_ID},
                COLUMN_EMAIL + "=?", new String[]{email}, null, null, null);
        int count = cursor.getCount();
        cursor.close();
        return count > 0;
    }

    // Method to authenticate user
    public boolean authenticateUser(String email, String password) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.query(TABLE_USERS, new String[]{COLUMN_ID},
                COLUMN_EMAIL + "=? AND " + COLUMN_PASSWORD + "=?",
                new String[]{email, password}, null, null, null);
        int count = cursor.getCount();
        cursor.close();
        return count > 0;
    }

    public String getFullName(String email) {
        SQLiteDatabase db = this.getReadableDatabase();
        String fullName = null;
        Cursor cursor = db.query(TABLE_USERS, new String[]{COLUMN_FULLNAME},
                COLUMN_EMAIL + "=?", new String[]{email}, null, null, null);
        if (cursor != null) {
            if (cursor.moveToFirst()) {
                fullName = cursor.getString(cursor.getColumnIndexOrThrow(COLUMN_FULLNAME));
            }
            cursor.close();
        }
        return fullName;
    }
}
