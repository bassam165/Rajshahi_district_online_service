package com.bassam.rajshahi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bassam.rajshahi.adapter.all_adapter
import com.bassam.rajshahi.model.all_model

class emergency : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView
    private lateinit var dataSource:ArrayList<all_model>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_emergency)
        recyclerView=findViewById(R.id.emergency_rec)
        LoadData()
        Recycler()
    }
    private fun LoadData(){
        dataSource= arrayListOf()
        dataSource.add(all_model("Bangladesh help line","999",R.drawable.hotline))
    }
    private fun Recycler(){
        recyclerView.layoutManager=LinearLayoutManager(this)
        recyclerView.adapter=all_adapter(dataSource)
    }
}