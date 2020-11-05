package com.example.newapp


import android.media.Image
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random


class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.KITKAT)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var imageView = findViewById(R.id.imageView) as ImageView
        val button1 = findViewById(R.id.button) as Button
        var nuberflags = 6
        //val imageView1 = findViewById<imageVeiw>(R.id.imageView)
//        val imgResId = R.drawable.flag_of_egypt
//        val photo1 = R.drawable.flag_of_germany
//        val photo2 = R.drawable.flag_of_thailand
//        val photo3 = R.drawable.flag_of_the_united_states
//        val photo4 = R.drawable.flag_of_laos
      //  var list1 = (!(photo1 || !photo2 || !photo3 || !photo4))

        //imageView.setImageDrawable(R.drawable.imag_5)
       // val imgResId  = finalphoto


        //val imageFlags = "R.drawable.Flag_of_*"

       // val imgResId = "https://upload.wikimedia.org/wikipedia/commons/thumb/8/84/Flag_of_Uzbekistan.svg/1920px-Flag_of_Uzbekistan.svg.png"

    //  var resId = imgResId
     var mainphoto=  imageView.setImageResource(R.drawable.imag_2)

        mainphoto

        button1.setOnClickListener {
           // resId = if (resId == R.drawable.imag_0) finalphoto else finalphoto
        //   imageView.setImageResource(resId)
          //  list1(R.drawable.flag_of_germany, R.drawable.flag_of_thailand, ) { Random.nextInt(0, 100) }

            //imageView.setImageResource(finalphoto)
            var finalphoto :String  = "R.drawable.img_" + Random.nextInt(nuberflags)

            Log.d("TAG", "$finalphoto")


            imageView.setImageResource(finalphoto)



        }
    }
}
