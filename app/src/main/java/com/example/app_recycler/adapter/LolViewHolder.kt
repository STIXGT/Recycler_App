package com.example.app_recycler.adapter


import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.app_recycler.Lol
import com.example.app_recycler.R


class LolViewHolder(view: View):RecyclerView.ViewHolder(view) {


    val chacterName = view.findViewById<TextView>(R.id.tvCharacterName)
    val rol = view.findViewById<TextView>(R.id.tvRol)
    val carril = view.findViewById<TextView>(R.id.tvCarril)
    val photo = view.findViewById<ImageView>(R.id.ivCharacter)


    fun render(lolModel: Lol){

        chacterName.text = lolModel.Legend
        rol.text = lolModel.Rol
        carril.text = lolModel.Carril
        Glide.with(photo.context).load(lolModel.Photo).into(photo)
    }
}