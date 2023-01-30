package com.example.guest_app.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.guest_app.model.GuestModel
import com.example.guest_app.repository.GuestRepository

class GuestFormViewModel(application: Application) : AndroidViewModel(application){

    private val repository = GuestRepository.getInstance(application)

    fun insert(guest: GuestModel){
        repository.insert(guest)
    }


}