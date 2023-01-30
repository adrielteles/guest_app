package com.example.guest_app.repository

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.provider.ContactsContract.Data
import com.example.guest_app.constants.DataBaseConstants

class GuestDataBase(context: Context) : SQLiteOpenHelper(context, NAME, null, VERSION) {
    companion object {
        private const val NAME = "guestdb"
        private const val VERSION = 1
    }

    override fun onCreate(db: SQLiteDatabase) {
        db.execSQL(
            "CREATE TABLE "+DataBaseConstants.GUEST.TABLE_NAME+" (" +
                    DataBaseConstants.GUEST.COLUMN.ID + "integer PRIMARY KEY AUTOINCREMENT, " +
                    DataBaseConstants.GUEST.COLUMN.NAME+ "text, " +
                    DataBaseConstants.GUEST.COLUMN.PRESENCE+"integer);")
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {

    }
}