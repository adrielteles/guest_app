package com.example.guest_app.view.viewholder

import androidx.recyclerview.widget.RecyclerView
import com.example.guest_app.databinding.RowGuestBinding
import com.example.guest_app.model.GuestModel
import com.example.guest_app.view.listener.OnGuestListener

class GuestViewHolder(private val bind: RowGuestBinding, private val listener: OnGuestListener) : RecyclerView.ViewHolder(bind.root) {


    fun bind(guest: GuestModel){
        bind.textName.text = guest.name

        bind.textName.setOnClickListener{
            listener.onClick()
        }

    }
}