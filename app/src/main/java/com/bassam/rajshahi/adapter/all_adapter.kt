package com.bassam.rajshahi.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bassam.rajshahi.R
import com.bassam.rajshahi.model.all_model
import com.bumptech.glide.Glide

class all_adapter(private var datas:ArrayList<all_model>):RecyclerView.Adapter<all_adapter.MyViewHolder>() {
    class MyViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
        val profile=itemView.findViewById<ImageView>(R.id.layout_img)
        val location=itemView.findViewById<TextView>(R.id.layout_location)
        val phone=itemView.findViewById<TextView>(R.id.layout_phone)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val mitem= LayoutInflater.from(parent.context).inflate(R.layout.all_layout,parent,false)
        return MyViewHolder(mitem)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val singldata=datas[position]
        holder.location.text=singldata.location
        holder.phone.text=singldata.phone
        Glide.with(holder.profile.context).load(singldata.profile).into(holder.profile)
    }

    override fun getItemCount(): Int {
        return datas.size
    }
}