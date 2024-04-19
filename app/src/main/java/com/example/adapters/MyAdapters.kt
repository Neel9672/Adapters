package com.example.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class MyAdapters(private val context: Context, private val items: List<String>): BaseAdapter() {
    override fun getCount(): Int {
        // return the number of items
        return  items.size
    }

    override fun getItem(position: Int): Any {
        // return the data item associated with the specified position in the data set
        return items[position]
    }

    override fun getItemId(position: Int): Long {
        // return a unique position identifer for the item at the specified position
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        // return a view that displays the data at the specified position in data set
        // convertView: recycled view that can be reused to optimize performance

        // layout inflater: instantiated layout XML file into its correspponding "View" objects to
        // be used in user interface

        val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

        val view: View

        if(convertView == null){
            // inflate a new view using layout inflater
            view = inflater.inflate(
                R.layout.my_custom_layout,
                parent,
                false
            )

        }else{
            // If convertView is not null
            view = convertView
        }

        // Bind data to view
        val items = getItem(position) as String

        val titleTextView = view.findViewById<TextView>(R.id.textViewCustom)

        titleTextView.text = items

        return view
    }

}