package com.bassam.rajshahi.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bassam.rajshahi.R
import com.bassam.rajshahi.model.Main_model
import com.bumptech.glide.Glide
import com.denzcoskun.imageslider.models.SlideModel

class Main_Adapter(private var data:ArrayList<Main_model>):RecyclerView.Adapter<Main_Adapter.Myviewholder>(){
    private var monclickListener:onclickListener?=null
    class Myviewholder(itemview:View):RecyclerView.ViewHolder(itemview) {
    val image=itemview.findViewById<ImageView>(R.id.sample_img)
        val name=itemview.findViewById<TextView>(R.id.sample_name)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Myviewholder {
        val myitem= LayoutInflater.from(parent.context).inflate(R.layout.custom_layout,parent,false)
        return Myviewholder(myitem)
    }

    override fun onBindViewHolder(holder: Myviewholder, position: Int) {
        val singledata=data[position]
        holder.name.text=singledata.name
        Glide.with(holder.image.context).load(singledata.image).into(holder.image)
        holder.itemView.setOnClickListener{
            if(monclickListener!=null){
                monclickListener!!.onclick(position,singledata)
            }
        }
    }

    override fun getItemCount(): Int {
        return data.size
    }
    fun setOnclidkListener(onclickListener: onclickListener){
    this.monclickListener=onclickListener
    }
    interface onclickListener{
        fun onclick(position: Int,model: Main_model)
    }
}