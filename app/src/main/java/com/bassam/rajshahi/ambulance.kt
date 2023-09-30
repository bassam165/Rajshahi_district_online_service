package com.bassam.rajshahi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bassam.rajshahi.adapter.all_adapter
import com.bassam.rajshahi.model.all_model

class ambulance : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView
    private lateinit var dataSource:ArrayList<all_model>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ambulance)
        recyclerView=findViewById(R.id.ambulacne_rec)
        LoadData()
        Recycler()
    }
    private fun LoadData(){
        dataSource= arrayListOf()
        dataSource.add(all_model("Rajshahi Islami Bank Hospital","Hotline:  +880721770965, +8801719978197",R.drawable.ambul))
        dataSource.add(all_model("Rajshahi Police Hospital Ambulance","Phone: 0721-774134",R.drawable.ambul))
        dataSource.add(all_model("Ambulance","Phone: 0721-776080",R.drawable.ambul))
    }
    private fun Recycler(){
        recyclerView.layoutManager= LinearLayoutManager(this)
        recyclerView.adapter= all_adapter(dataSource)
    }
}