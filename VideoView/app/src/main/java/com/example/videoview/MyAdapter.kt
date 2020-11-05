package com.example.videoview

import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.VideoView
import androidx.recyclerview.widget.RecyclerView
import java.io.File
import java.net.URL


class MyAdapter(val lambda: (String) -> Int): RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    val urls :List<String> = listOf(
        "https://privetstream.tk/recordings/da-1604406767.flv",
        "https://privetstream.tk/hls/da/index.m3u8"
    )
//    var url = "https://privetstream.tk/recordings"
//    var regex = """(.+)/(.+)\.(.+)""".toRegex()
//    var matchResult = regex.matchEntire(url)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.row, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

       //val url = URL("https://privetstream.tk/recordings/")
        val url = ("https://privetstream.tk/recordings/")
        val urL2 = url
        val uri = Uri.parse(url)
        val matchResult =  File(uri.path)

        val urlMain = urls[position]
        holder.video1.setVideoPath(urlMain)
        holder.video1.start()

        holder.parent.setOnClickListener(View.OnClickListener {
            lambda(matchResult)
            notifyDataSetChanged()
        })


   }

    override fun getItemCount(): Int {
        return urls.size
    }


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var video1: VideoView = itemView.findViewById(R.id.videoViewRow)
        //lateinit var mediaController : MediaController
       // val mainRow1: View = itemView.findViewById(R.id.row_parent)
        val parent: View = itemView.findViewById(R.id.row_parent)
    }

}