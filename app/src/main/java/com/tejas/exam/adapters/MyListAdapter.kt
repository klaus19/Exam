package com.tejas.exam.adapters

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.tejas.exam.R

class MyListAdapter(private val context: Activity, private val title: Array<String>):
    ArrayAdapter<String>(context,
    R.layout.custom_list, title) {

    override fun getView(position: Int, view: View?, parent: ViewGroup): View {
        val inflater = context.layoutInflater
        val rowView = inflater.inflate(R.layout.custom_list, null, true)

        val titleText = rowView.findViewById(R.id.title) as TextView


        titleText.text = title[position]


        return rowView
    }
}