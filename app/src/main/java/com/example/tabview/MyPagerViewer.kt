package com.example.tabview

import android.app.Activity
import android.text.Layout
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class MyPagerViewer(fm:FragmentManager):FragmentPagerAdapter(fm) {
    override fun getCount(): Int {
        return 2
    }

    override fun getItem(position: Int): Fragment {
        when(position){
            0 -> {return ListFragment()}
            1->{return GridFragment()}
            else -> {return ListFragment()}
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        when(position){
            0 ->(return "ListView")
            1->(return  "Grid")
        }
        return super.getPageTitle(position)
    }
}