package com.example.tabview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.getSystemService

class MyGridViewAdapter(private val context:Context,
                        private val title:Array<String>,
                        private val images: Array<Int>):BaseAdapter() {

    private var layoutInflater:LayoutInflater?=null
    private lateinit var imageView:ImageView
    private lateinit var textView:TextView

    override fun getCount(): Int {
        return title.size
    }

    override fun getItem(p0: Int): Any? {
        return null
    }

    override fun getItemId(p0: Int): Long {
        return 0
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        var convertView = p1
        if (layoutInflater == null){
            layoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        }
        if (convertView == null){
            convertView = layoutInflater!!.inflate(R.layout.grid_cell,null)
        }

        imageView = convertView!!.findViewById(R.id.iv_view)
        textView = convertView!!.findViewById(R.id.tv_text)
        imageView.setImageResource(images[p0])
        textView.text = title[p0]
        return convertView
    }

}