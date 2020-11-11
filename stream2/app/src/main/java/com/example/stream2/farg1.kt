package com.example.stream2

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.google.gson.Gson
import java.net.URL

class farg1 : Fragment() {

    companion object {
        fun newInstance() = farg1()
    }

    private lateinit var viewModel: Farg1ViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.farg1_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(Farg1ViewModel::class.java)
        val addButton = view?.findViewById<View>(R.id.button)







    }
    fun  main()  {
        val streamUrl = URL("https://privetstream.tk/recordings/").readText()
        val gson = Gson()
        val data = gson.fromJson(streamUrl, Array<Model>::class.java)

        for (x in 0 until data.size)
            Log.d("TAG", data[x].name).toString()

        //Log.d("TAG", "Test")
    }

}