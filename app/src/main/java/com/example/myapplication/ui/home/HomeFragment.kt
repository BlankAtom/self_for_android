package com.example.myapplication.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.myapplication.R

class HomeFragment : Fragment(R.layout.fragment_home) {

    private lateinit var homeViewModel: HomeViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
            ViewModelProviders.of(this).get(HomeViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_home, container, false)

        val view = root.findViewById<View>(R.id.relativeLayout3)
        view.setOnClickListener{
            Toast.makeText(this.activity, "Toast", Toast.LENGTH_LONG).show()
        }

        val view2 = root.findViewById<View>(R.id.relativeLayout4)
        view2.setOnClickListener{
            Toast.makeText(this.activity, "Toast", Toast.LENGTH_LONG).show()
        }
        return root
    }
}