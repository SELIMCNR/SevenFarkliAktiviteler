package com.selimcinar.sevenfarklaktiviteler

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_ikinciactivity.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.textView

class Ikinciactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ikinciactivity)

        /*İntent ile farklı aktiviteden gelen veri buraya getirildi*/
        val intent = intent
        val alinanveri=intent.getStringExtra("yollananVeri")
        val isimalinan=intent.getStringExtra("isimverisi")
        val soyisimalinan=intent.getStringExtra("soyisimverisi")

        textView.text = alinanveri
        textView2.text=isimalinan
        textView3.text=soyisimalinan



    }

    fun geriDon(view: View){

        val intent = Intent (applicationContext,MainActivity::class.java)
        startActivity(intent)
        finish() //onDestroy çağrılır

    }
}