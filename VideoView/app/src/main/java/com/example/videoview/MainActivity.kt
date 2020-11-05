package com.example.videoview

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.MediaController
import android.widget.VideoView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var lambdafunction = { str: String ->
            // returns the expression below
            Log.d("TAG", str)
        }
        val recycler = findViewById<RecyclerView>(R.id.recyclerView)

        val adapter0 = MyAdapter(lambdafunction)
        recycler.adapter = adapter0
        recycler.layoutManager = LinearLayoutManager(application)

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