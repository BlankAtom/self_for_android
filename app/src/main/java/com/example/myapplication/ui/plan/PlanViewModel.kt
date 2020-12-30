package com.example.myapplication.ui.plan

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PlanViewModel(application: Application) : AndroidViewModel(application) {
    private val _text = MutableLiveData<String>().apply {
        value = "This is Plan Fragment"
    }
    val text: LiveData<String> = _text
    val plans: ArrayList<PlanItem> = ArrayList()

    init {
        plans.add(PlanItem("开会"))
        plans.add(PlanItem("开会"))
    }

    fun addPlan(planItem: PlanItem){
        plans.add(planItem)
    }
}