package com.example.myapplication.ui.plan

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import java.util.*
import kotlin.collections.ArrayList

class PlanFragment : Fragment() , View.OnClickListener {
    private lateinit var planViewModel: PlanViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        planViewModel = ViewModelProviders.of(this)
            .get(PlanViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_plan, container, false)

        val rvTrace = root.findViewById<RecyclerView>(R.id.recycler_view)
        val adapter = PlanAdapter(this.activity, planViewModel.plans)

        rvTrace.layoutManager = LinearLayoutManager(this.activity)
        rvTrace.adapter = adapter

        val button = root.findViewById<Button>(R.id.btn_plan_add)
        button.setOnClickListener {
            val intent = Intent(activity, AddPlanActivity::class.java)
//            intent.setClass(this.requireContext(), )
            startActivity(intent)
        }

        val buttonTest = root.findViewById<Button>(R.id.plan_add_test)
        buttonTest.setOnClickListener{
            planViewModel.plans.add(PlanItem("New"))
            updateList(adapter, rvTrace)
        }

        return root
    }

    fun updateList(adapter: PlanAdapter, view: RecyclerView) {
        adapter.setList(planViewModel.plans)
        view.adapter = adapter
    }

    override fun onClick(v: View?) {
        print(1232)
    }
}