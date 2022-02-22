package com.example.tabview

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import com.example.tabview.databinding.FragmentGridBinding
import com.example.tabview.databinding.FragmentListBinding
import kotlinx.android.synthetic.main.fragment_list.*


class ListFragment : Fragment() {

    private val title = arrayOf(
        "MS Dhoni",
        "Suresh Raina",
        "Moeen Ali",
        "Ravindra Jadeja",
        "Dwayne Bravo",
        "C Hari Nishaanth",
        "Sam Curran",
        "Robin Uthappa",
        "Ruturaj Gaikwad",
        "Ambati Rayudu",
        "Narayan Jagadeesan"
    )
    private val imageId = arrayOf(R.drawable.msdhoni,R.drawable.suresh,R.drawable.alic,R.drawable.jadc,
        R.drawable.cbravo,R.drawable.hari,R.drawable.samc,R.drawable.uthappa,R.drawable.rutuc,
        R.drawable.ambati,R.drawable.narayanac)
    override fun onCreate(savedInstanceState: Bundle?) {
//        val listAdapter = MyListAdapter(this,title,imageId)
        super.onCreate(savedInstanceState)

    }




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val gridAdapter = MyListAdapter(requireActivity(),title,imageId)
        f_list.adapter = gridAdapter

        f_list.setOnItemClickListener { parent, view, position, id ->
            val name = title[position]
            val image = imageId[position]
            val viewLay = LayoutInflater.from(requireContext()).inflate(R.layout.custom_activity,null)
            val button = viewLay.findViewById<Button>(R.id.btn)
            val textView = viewLay.findViewById<TextView>(R.id.tv_info)
            val alertDialog = AlertDialog.Builder(requireContext()).setView(viewLay)
            val alert = alertDialog.create()
            alert.show()

            textView.text = name

            button.setOnClickListener {
                val intent = Intent(requireContext(),MainActivity2::class.java)
                intent.putExtra("name",name)
                intent.putExtra("image",image)
                startActivity(intent)
            }
            viewLay.setOnClickListener {
                alert.dismiss()
            }        }
    }



}