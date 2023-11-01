package com.example.fetchdataretrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerview = findViewById<RecyclerView>(R.id.recyclerView)

        // this creates a vertical layout Manager
        recyclerview.layoutManager = LinearLayoutManager(this)

        // ArrayList of class ItemsViewModel
        val data = ArrayList<CourseModel>()

        for (i in 1..20) {
            data.add(CourseModel(R.drawable.folder,"item" + i))
        }

        // This will pass the ArrayList to our Adapter
        val adapter = CourseAdapter(data)

        // Setting the Adapter with the recyclerview
        recyclerview.adapter = adapter
    }

}