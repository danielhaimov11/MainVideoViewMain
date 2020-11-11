package com.example.videoview

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.gson.Gson
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread
import java.net.URL

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Main0.newInstance] factory method to
 * create an instance of this fragment.
 */
class Main0 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main0, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var lambdafunction = { str: String ->
            // returns the expression below
            Log.d("TAG", str)
        }



        val recycler = view.findViewById<RecyclerView>(R.id.recyclerView1)

        val adapter0 = MyAdapter(lambdafunction)
        recycler.adapter = adapter0
        recycler.layoutManager = LinearLayoutManager(context)

        doAsync {
            val streamUrl = URL("https://privetstream.tk/recordings/").readText()
            val gson = Gson()
            val data = gson.fromJson(streamUrl, Array<Model>::class.java).toList()
            uiThread {
                data.forEach{
                    adapter0.add("${it.name}")
                }
            }
        }
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         * @return A new instance of fragment Main0.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance() = Main0()
    }
}