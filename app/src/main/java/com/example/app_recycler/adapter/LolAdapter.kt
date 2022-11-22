package com.example.app_recycler.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.app_recycler.Lol
import com.example.app_recycler.R


class LolAdapter(private var ChacterList: List<Lol>): RecyclerView.Adapter<LolViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LolViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return LolViewHolder(layoutInflater.inflate(R.layout.item_lol, parent, false))
    }

    override fun onBindViewHolder(holder: LolViewHolder, position: Int) {
        val item = ChacterList[position]
        holder.render(item)
    }

    override fun getItemCount(): Int= ChacterList.size

}