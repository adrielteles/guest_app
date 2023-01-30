package com.example.guest_app.repository

import android.content.ContentValues
import android.content.Context
import com.example.guest_app.constants.DataBaseConstants
import com.example.guest_app.model.GuestModel

class GuestRepository private constructor(context: Context){

    private val guestDataBase = GuestDataBase(context)

    companion object {
        private lateinit var repository: GuestRepository

        fun getInstance(context: Context): GuestRepository {
            if (!::repository.isInitialized){
                repository = GuestRepository(context)
            }
            return repository
        }
    }

    fun insert(guest: GuestModel): Boolean {
        return try {
            val db = guestDataBase.writableDatabase

            val presence = if (guest.presence) 1 else 0

            val values = ContentValues()
            values.put(DataBaseConstants.GUEST.COLUMN.NAME, guest.name)
            values.put(DataBaseConstants.GUEST.COLUMN.PRESENCE,presence)

            db.insert("Guest",null,values)
            true
        } catch (e:Exception) {
            return false
        }
    }

    fun update() {
    }

}