package com.example.myapplication

import android.app.Activity
import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import java.lang.Exception

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navView: BottomNavigationView = findViewById(R.id.nav_view)

        val navController = findNavController(R.id.nav_host_fragment)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_home, R.id.navigation_me, R.id.navigation_plan
            )
        )
//        setSta

//        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)

//        window.statusBarColor = R.color.colorWhite
//        window.navigationBarColor = R.color.colorSelf
//        window.
//        navView.setBackgroundColor(R.color.colorPrimaryDark)
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
        

//    actionBar
    }



    private fun setWindowStateBarColor(colorResId: Int ){
        try {
            if( Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
//                val window: Window = activity.window
                window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)

                window.statusBarColor = colorResId
                window.navigationBarColor = colorResId
            }

        }
        catch (e: Exception){
            e.printStackTrace()
        }

    }
}