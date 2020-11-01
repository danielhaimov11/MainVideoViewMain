package com.example.myapplication

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdSize
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.AdView




class MainActivity : AppCompatActivity() {
    lateinit var mAdView : AdView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        MobileAds.initialize(this) {}

        mAdView = findViewById(R.id.adView)
        val adRequest = AdRequest.Builder().build()
        mAdView.loadAd(adRequest)
        //val adSize = AdSize(300, 300)

        val editTextPhone = findViewById(R.id.editTextPhone) as EditText

        val editText1 = findViewById(R.id.editText1) as EditText

        val buttonsend = findViewById(R.id.buttonsend) as Button

        val phonenumber = editTextPhone.text

        val code = editText1.text


        var wurl = "http://api.whatsapp.com/send?phone="



        buttonsend.setOnClickListener {

            startActivity(Intent(Intent.ACTION_VIEW).apply {
                data = Uri.parse(wurl+code+phonenumber)
            })

          //  Toast.makeText(this@MainActivity, "You clicked me.", Toast.LENGTH_SHORT).show()
          // Toast.makeText(this@MainActivity, wurl, Toast.LENGTH_SHORT).show()


        }




    }
    //1

}