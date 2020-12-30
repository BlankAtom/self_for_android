package com.example.myapplication.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is home Fragment"
    }
    var text: MutableLiveData<String> = _text

    fun setText(t: String){
        this.text = MutableLiveData<String>().apply {
            value = t
        }
    }
}