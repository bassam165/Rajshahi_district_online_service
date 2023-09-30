package com.bassam.rajshahi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bassam.rajshahi.adapter.all_adapter
import com.bassam.rajshahi.model.all_model

class hospital : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView
    private lateinit var dataSource:ArrayList<all_model>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hospital)
        recyclerView=findViewById(R.id.hospital_rec)
        LoadData()
        Recycler()
    }
    private fun LoadData(){
        dataSource= arrayListOf()
        dataSource.add(all_model("Rajshahi Medical College","Phone: 0721-774354",R.drawable.rmc))
        dataSource.add(all_model("Christian mission hospital Rajshahi Sadar","Phone: 0721776180",R.drawable.missionhos))
        dataSource.add(all_model("TB Hospital  ","Phone: 0721-779133",R.drawable.amanahos))
    }
    private fun Recycler(){
        recyclerView.layoutManager= LinearLayoutManager(this)
        recyclerView.adapter= all_adapter(dataSource)
    }
}