package com.example.tabview

import android.app.Activity
import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class MyListAdapter(private val context: Activity,
                    private val title:Array<String>,
                    private val imgId: Array<Int>
): ArrayAdapter<String>(context,R.layout.list_cell,title) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val inflater = context.layoutInflater
        val listView = inflater.inflate(R.layout.list_cell, null, true)
        val titleText = listView.findViewById<TextView>(R.id.tv_title)
        val image = listView.findViewById(R.id.iv_icon) as ImageView

        titleText.text = title[position]
        image.setImageResource(imgId[position])
        return listView
    }
}
