package com.bassam.rajshahi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bassam.rajshahi.adapter.Main_Adapter
import com.bassam.rajshahi.model.Main_model
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.models.SlideModel

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView
    private lateinit var data:ArrayList<Main_model>
    val imageList = ArrayList<SlideModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView=findViewById(R.id.main_reycaler)
        loadData()
        initRecycaler()


        imageList.add(SlideModel("https://upload.wikimedia.org/wikipedia/commons/thumb/6/66/Rajshahi_city_%283%29.jpg/800px-Rajshahi_city_%283%29.jpg", "Rajshahi City"))
        imageList.add(SlideModel("https://www.daily-sun.com/assets/news_images/2023/01/25/Rajshahi_city-ds-1.jpg","Foot Path"))
        imageList.add(SlideModel("https://www.ru.ac.bd/wp-content/uploads/2022/05/slider-img-3.jpg","Rajshahi University"))
        val imageSlider = findViewById<ImageSlider>(R.id.slider)
        imageSlider.setImageList(imageList)
    }
    private fun loadData(){
        data= arrayListOf()
        data.add(Main_model("ইতিহাস",R.drawable.history))
        data.add(Main_model("দর্শনীয় স্থান",R.drawable.img))
        data.add(Main_model("জরুরি",R.drawable.emergency))
        data.add(Main_model("পুলিশ",R.drawable.police))
        data.add(Main_model("হাসপাতাল",R.drawable.hospital))
        data.add(Main_model("অ্যাম্বুলেন্স",R.drawable.ambulance))
        data.add(Main_model("হোটেল",R.drawable.hotel))
        data.add(Main_model("রেস্টুরেন্ট",R.drawable.resturent))
        data.add(Main_model("কৃষি সাহায্য ",R.drawable.agriculture))

    }
    private fun initRecycaler(){
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager=GridLayoutManager(this,3)
        val adapter=Main_Adapter(data)
        recyclerView.adapter=adapter
        adapter.setOnclidkListener(object :Main_Adapter.onclickListener {
            override fun onclick(position: Int, model: Main_model) {
                if(position==0){
                    val intent = Intent(this@MainActivity, history::class.java)
                    startActivity(intent)
                }
                else if(position==1){
                    val intent = Intent(this@MainActivity, place::class.java)
                    startActivity(intent)
                }
                else if(position==2){
                    val intent = Intent(this@MainActivity, emergency::class.java)
                    startActivity(intent)
                }
                else if(position==3){
                    val intent = Intent(this@MainActivity, police::class.java)
                    startActivity(intent)
                }
                else if(position==4){
                    val intent = Intent(this@MainActivity, hospital::class.java)
                    startActivity(intent)
                }
                else if(position==5){
                    val intent = Intent(this@MainActivity, ambulance::class.java)
                    startActivity(intent)
                }
                else if(position==6){
                    val intent = Intent(this@MainActivity, hotel::class.java)
                    startActivity(intent)
                }
                else if(position==7){
                    val intent = Intent(this@MainActivity, resturant::class.java)
                    startActivity(intent)
                }
                else if(position==8){
                    val intent = Intent(this@MainActivity, krisi::class.java)
                    startActivity(intent)
                }
            }
        })
    }
}