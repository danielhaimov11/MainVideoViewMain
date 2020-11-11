package com.example.stream2
import android.util.Log
import com.example.stream2.Model
import com.google.gson.Gson
import java.net.URL


//
//import android.util.Log
//import com.google.gson.Gson
//import com.google.gson.JsonDeserializationContext
//import java.net.URL
//
//public fun main(context: JsonDeserializationContext) {
//    val streamUrl = URL("https://privetstream.tk/recordings/").readText()
//    val gson = Gson()
//    val data = gson.fromJson(streamUrl, Array<Model>::class.java)
//
//    for (x in 0 until data.size )
//       print(data[x].name)
//}

fun  main() {
   // synchronized(main()) {
        //synchronized(Model::class.java)

        val streamUrl = URL("https://privetstream.tk/recordings/").readText()
        val gson = Gson()
        val data = gson.fromJson(streamUrl, Array<Model>::class.java)


        for (x in 0 until data.size)
            println(data[x].name)

}