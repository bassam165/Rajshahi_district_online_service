package com.bassam.rajshahi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bassam.rajshahi.adapter.all_adapter
import com.bassam.rajshahi.model.all_model

class krisi : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView
    private lateinit var dataSource:ArrayList<all_model>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_krisi)
        recyclerView=findViewById(R.id.krisi_rec)
        LoadData()
        Recycler()
    }
    private fun LoadData(){
        dataSource= arrayListOf()
        dataSource.add(all_model("krisi help cneter","Phone 16123",R.drawable.krisi))
        dataSource.add(all_model("update","Phone: 0721-774134",R.drawable.krisi))
        dataSource.add(all_model("krisi","Phone: 0721-776080",R.drawable.krisi))
    }
    private fun Recycler(){
        recyclerView.layoutManager= LinearLayoutManager(this)
        recyclerView.adapter= all_adapter(dataSource)
    }
}