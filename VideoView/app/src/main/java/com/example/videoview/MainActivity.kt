package com.example.videoview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.annotation.UiThread
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.gson.Gson
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread
import java.net.URL


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        //        ///////////////////////עובדדדדד

//        var lambdafunction = { str: String ->
//            // returns the expression below
//            Log.d("TAG", str)
//        }
//
//
//
//        val recycler = findViewById<RecyclerView>(R.id.recyclerView)
//
//        val adapter0 = MyAdapter(lambdafunction)
//        recycler.adapter = adapter0
//        recycler.layoutManager = LinearLayoutManager(application)
//
//        doAsync {
//        val streamUrl = URL("https://privetstream.tk/recordings/").readText()
//        val gson = Gson()
//        val data = gson.fromJson(streamUrl, Array<Model>::class.java).toList()
//            uiThread {
//                data.forEach{
//                   adapter0.add("${it.name}")
//                }
//            }
//        }
//        ///////////////////////עובדדדדד
//        val streamUrl = URL("https://privetstream.tk/recordings/").readText()
//        val gson = Gson()
//        val data = gson.fromJson(streamUrl, Array<Model>::class.java).asList()
//        Log.d("TAG", data.toString())
//        for (x in 0 until data.size)
//       // val fromSer =  (data[x].name)



//    }
        //adapter0.add((data[x].name))
//        val urt :String = "da-1604405827.flv"
//            //  var urlt1 :String = "da-1604405739"
//        adapter0.add(urt)



    }

}





//var url1 = "https://privetstream.tk/recordings/da-1604406767.flv"
//var url2 = "https://privetstream.tk/hls/da/index.m3u8"
//
//var videoView : VideoView = findViewById(R.id.videoview)
//var videoView2 : VideoView = findViewById(R.id.videoview2)
//var mediaController : MediaController
//
//
//mediaController = MediaController(this)
//mediaController.setAnchorView(videoView)
//videoView.setVideoPath(url1)
//videoView.start()
//videoView.setMediaController(mediaController)
//
////mediaController.setAnchorView(videoView2) old
//videoView2.setVideoPath(url1)
//videoView2.start()
////videoView2.setMediaController(mediaController)old