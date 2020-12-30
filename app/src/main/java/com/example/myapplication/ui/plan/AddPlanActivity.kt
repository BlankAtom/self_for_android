package com.example.myapplication.ui.plan

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.util.AttributeSet
import android.view.View
import android.view.Window
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R

class AddPlanActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.activity_add_plan)

//        setFeatureDrawableResource(Window.FEATURE_CUSTOM_TITLE, R.layout.title_add_plan)
//        window.setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.title_add_plan)

        val button = findViewById<Button>(R.id.add_task_back)
        button.setOnClickListener{
            startActivity(Intent(this, PlanFragment::class.java))
        }
    }

}