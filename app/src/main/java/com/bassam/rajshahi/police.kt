package com.bassam.rajshahi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bassam.rajshahi.adapter.all_adapter
import com.bassam.rajshahi.model.all_model

class police : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView
    private lateinit var dataSource:ArrayList<all_model>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_police)
        recyclerView=findViewById(R.id.police_rec)
        LoadData()
        Recycler()
    }
    private fun LoadData(){
        dataSource= arrayListOf()
        dataSource.add(all_model("Boalia Model Police Station","Phone: 0721-774134",R.drawable.boalia))
        dataSource.add(all_model("Motihar Police Station","Phone: 0721-774134",R.drawable.motihar))
        dataSource.add(all_model("Rajpara Police Station","Phone: 0721-776080",R.drawable.rajpara))
    }
    private fun Recycler(){
        recyclerView.layoutManager= LinearLayoutManager(this)
        recyclerView.adapter= all_adapter(dataSource)
    }
}