package com.example.quizbattle.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.lifecycle.ViewModelProvider
import com.example.quizbattle.ViewModel.MainActivityViewModel
import com.example.quizbattle.databinding.ActivityMainBinding



class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var username:EditText
    lateinit var password:EditText
    lateinit var loginButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        Thread.sleep(2000)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val viewModel2 = ViewModelProvider(this).get(MainActivityViewModel::class.java)
    }

    override fun onResume() {
        super.onResume()


        //val fragment: StartFragment = StartFragment()
        //supportFragmentManager.beginTransaction()
         //   .add(R.id.fragment_container_start, fragment)
         //   .commit()
    }
}