package com.example.videoview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.VideoView
import androidx.recyclerview.widget.RecyclerView
import java.net.URL


class MyAdapter(val lambda: (String) -> Int): RecyclerView.Adapter<MyAdapter.ViewHolder>() {

     val urls  = mutableListOf<String>(
//         "da-1604405365.flv"
//        "https://privetstream.tk/recordings/da-1604405396.flv",
//        "https://privetstream.tk/hls/da/index.m3u8",
//        "https://privetstream.tk/hls/da/index.m3u8",
//        "https://privetstream.tk/hls/da/index.m3u8",
//        "https://privetstream.tk/recordings/da-1604405739.flv",
//        "https://privetstream.tk/recordings/da-1604405827.flv",
//        "https://privetstream.tk/hls/da/index.m3u8",
     )

    val serverUrl :String = "https://privetstream.tk/recordings/"
        //val finlUrl : String = "$serverUrl$urls"
//    var url = "https://privetstream.tk/recordings"
//    var regex = """(.+)/(.+)\.(.+)""".toRegex()
//    var matchResult = regex.matchEntire(url)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.row, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {


        val urlMain :String = urls[position].toString()
//        val  urlMainStrin :String = urlMain.toString()

//        val formattedString: String = urlMain.toString()
//            .replace("[", "")
//            .replace("]", "")
        holder.video1.setVideoPath(serverUrl + urlMain)
        holder.video1.start()


/////////////////////////////////////////////////////////////
//            var url = "https://privetstream.tk/recordings/"
//        var matchResult = URI(url).querys
///////////////////////////////////////////////////////////
//        holder.parent.setOnClickListener(View.OnClickListener {
//            lambda("$matchResult")
//            notifyDataSetChanged()
//        })
        //holder.addButton.setOnClickListener(View.OnClickListener { this.main() })


   }

    override fun getItemCount(): Int {
        return urls.size
    }

    fun add(url1: String) {
        urls.add(url1.toString())
        notifyDataSetChanged()
    }


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var video1: VideoView = itemView.findViewById(R.id.videoViewRow)
        //lateinit var mediaController : MediaController
       // val mainRow1: View = itemView.findViewById(R.id.row_parent)
        val parent: View = itemView.findViewById(R.id.row_parent)
     //   val addButton :Button = itemView.findViewById(R.id.button1)


    }

//    fun  main()  {
//        val streamUrl = URL("https://privetstream.tk/recordings/").readText()
//        val gson = Gson()
//        val data = gson.fromJson(streamUrl, Array<Model>::class.java)
//
//        for (x in 0 until data.size) {
//            urls.add(data[x].name)
//        }
//    }

}

