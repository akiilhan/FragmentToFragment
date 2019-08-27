package com.example.fragmenttofragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity(),MyListener {

    //override lateinit var sonuc: TextView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun sayilariTopla(sayi1: Int, sayi2: Int) {

        var manager= supportFragmentManager
        var fragment_B=manager.findFragmentById(R.id.fragmentb) as FragmentB
        fragment_B.sayilariTopla(sayi1,sayi2)



    }
}
