package com.bassam.rajshahi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bassam.rajshahi.adapter.all_adapter
import com.bassam.rajshahi.model.all_model

class resturant : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView
    private lateinit var dataSource:ArrayList<all_model>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resturant)
        recyclerView=findViewById(R.id.resturent_rec)
        LoadData()
        Recycler()
    }
    private fun LoadData(){
        dataSource= arrayListOf()
        dataSource.add(all_model("Hungry Heroes","Hotline: 01733-354730",R.drawable.res))
        dataSource.add(all_model("Nanking Chinese Restaurant","Phone: 0721-774120",R.drawable.res))
        dataSource.add(all_model("Backyard Kitchen","Phone: 0721-776080",R.drawable.res))
    }
    private fun Recycler(){
        recyclerView.layoutManager= LinearLayoutManager(this)
        recyclerView.adapter= all_adapter(dataSource)
    }
}