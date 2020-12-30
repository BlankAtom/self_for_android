package com.example.myapplication.ui.me

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R

class MeFragment : Fragment() {
    private lateinit var meViewModel: MeViewModel

    private lateinit var dateAdapter: MeDateAdapter
    private lateinit var thingAdapter: MeAdapter
    private lateinit var recyclerViewDate: RecyclerView
    private lateinit var recyclerViewThing: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ) : View {
        meViewModel = ViewModelProviders.of(this).get(MeViewModel
            ::class.java)
        val root = inflater.inflate(R.layout.fragment_me, container, false)

        recyclerViewDate = root.findViewById<RecyclerView>(R.id.me_recycler_date)
        recyclerViewThing = root.findViewById<RecyclerView>(R.id.me_recycler_thing)

        dateAdapter = MeDateAdapter(activity, meViewModel.getDates())
        thingAdapter = MeAdapter(activity, meViewModel.getThings())

        val manager = LinearLayoutManager(this.activity)
        manager.orientation = LinearLayout.HORIZONTAL
        recyclerViewDate.layoutManager = manager

        recyclerViewThing.layoutManager = LinearLayoutManager(this.activity)

        recyclerViewDate.adapter = dateAdapter
        recyclerViewThing.adapter = thingAdapter

        setButtonAction(root)
        return root
    }

    private fun setButtonAction(root: View) {
        val addButton = root.findViewById<Button>(R.id.me_btn_add)
        val testButton = root.findViewById<Button>(R.id.me_btn_test)

        addButton.setOnClickListener{
            onAddClick()
        }
        testButton.setOnClickListener{
            onTestClick()
        }
    }

    private fun onAddClick() {

    }
    private fun onTestClick() {
        meViewModel.getThings().add(MeThingItem("2020-12-12", "红红火火恍恍惚惚", "2020年12月12日"))

        updateUI()
    }
    private fun updateUI() {
        thingAdapter.list = meViewModel.getThings()
        recyclerViewDate.adapter = dateAdapter
        recyclerViewThing.adapter = thingAdapter
    }
}