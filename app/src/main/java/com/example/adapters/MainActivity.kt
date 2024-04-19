package com.example.adapters

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.CursorAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    lateinit var listView: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listView = findViewById(R.id.listView)

        // data source
        //the underlying set of that "ListView" displays
        val operatingSystem  = listOf(
            "Windows", "Linux", "IOs", "Android", "Mozilla", "OS1", "OS2", "OS3", "OS4","OS5", "OS6",
            "Windows", "Linux", "IOs", "Android", "Mozilla", "OS1", "OS2", "OS3", "OS4","OS5", "OS6"
        )

        //adapters
        //the listview doesn't directly hold the state, it displays
        //instead, it relies on a adapter to populate the data
        // The adapters is responsible for creating views for
        // each item in the data source and binding data to those views

//        val adapters = ArrayAdapter(
//            this,                               //Context
//            android.R.layout.simple_list_item_1,       //Template layout
//            operatingSystem                            // data source
//        )

//        listView.adapter = adapters

        val customAdapters = MyAdapters(this, operatingSystem)

        listView.adapter = customAdapters

    }
}