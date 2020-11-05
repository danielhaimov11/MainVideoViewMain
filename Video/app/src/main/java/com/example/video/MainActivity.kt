package com.example.video

import android.Manifest
import android.content.pm.PackageManager
import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.*
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {

    private var playbackPosition = 0
    private val rtspUrl = "https://privetstream.tk/hls/da/index.m3u8"
    val videoView = findViewById(R.id.videoView) as VideoView
    //val videoMain = findViewById(R.id.videoMain)  = FrameLayout
    val progressBar = findViewById(R.id.progressBar) as ProgressBar
    private lateinit var  mediaController: MediaController




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setupPermissions()
//        setupPermissions2()


        setContentView(R.layout.activity_main)
        mediaController = MediaController(this)

        videoView.setOnPreparedListener(){
           // mediaController.setAnchorView(videoMain)
            videoView.setMediaController(mediaController)
            videoView.seekTo(playbackPosition)
            videoView.start()
        }



//        videoView.setOnInfoListener { player, what, extras ->
//            if (what == MediaPlayer.MEDIA_INFO_VIDEO_RENDERING_START)
//               progressBar.visibility = View.INVISIBLE
//            true
//        }
    }

//    private fun setupPermissions() {
//        val permission = ContextCompat.checkSelfPermission(
//            this,
//            Manifest.permission.INTERNET)
//            if (permission != PackageManager.PERMISSION_GRANTED) {
//                Log.i("TAG", "Permission to record denied")
//            }
//    }
//    private fun setupPermissions2() {
//        val permission = ContextCompat.checkSelfPermission(
//            this,
//            Manifest.permission.WAKE_LOCK)
//            if (permission != PackageManager.PERMISSION_GRANTED) {
//                Log.i("TAG", "Permission to record denied")
//            }
//    }
//////..........................
    override fun onStart() {
        super.onStart()

        val uri = Uri.parse(rtspUrl)
        videoView.setVideoURI(uri)
        progressBar.visibility = View.VISIBLE

    }
//.......................
    override fun onPause() {
        super.onPause()
        videoView.pause()
        playbackPosition = videoView.currentPosition
    }

    override fun onStop() {
        videoView.stopPlayback()

        super.onStop()

    }
}