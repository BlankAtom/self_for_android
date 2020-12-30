package com.example.myapplication.ui.me

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MeViewModel : ViewModel() {
    private val dates: ArrayList<MeDateItem> = ArrayList()
    private val things: ArrayList<MeThingItem> = ArrayList()


    init {
        initDate()
        initThing()
    }

    fun getDates(): ArrayList<MeDateItem> {
        return dates
    }
    fun getThings(): ArrayList<MeThingItem> {
        return things
    }
    private fun initDate(){
        dates.add(MeDateItem("周日", "08"))
        dates.add(MeDateItem("周一", "09"))
        dates.add(MeDateItem("周二", "10"))
        dates.add(MeDateItem("周三", "11"))
        dates.add(MeDateItem("周四", "12"))
        dates.add(MeDateItem("周五", "13"))
        dates.add(MeDateItem("周六", "14"))
        dates.add(MeDateItem("周日", "15"))
        dates.add(MeDateItem("周一", "16"))
    }
    private fun initThing() {
        things.add(MeThingItem("2020-12-12", "红红火火恍恍惚惚", "2020年12月12日"))
        things.add(MeThingItem("2020-12-12", "红红火火恍恍惚惚", "2020年12月13日"))
        things.add(MeThingItem("2020-12-12", "红红火火恍恍惚惚", "2020年12月14日"))
    }
}
