package com.selimcinar.sevenfarklaktiviteler

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) { //açıldığında
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("onCreate çağırıldı")
        //Aktivite ilk açıldığında çağrılacak veya intent ile gelindiğinde çalışır.
    }
    fun aktiviteDegistir (view: View){
        //Dışardan girilen veriyi değişkene aktarma
        val kullaniciVerisi = editText.text.toString()
        val isimverisi=editText2.text.toString()
        val soyisimverisi=editText3.text.toString()




        /*İkinci aktiviteye geçiş işlemi için yazılan kodlar*/
        val intent = Intent(applicationContext,Ikinciactivity::class.java)
        /*Farklı aktiviteye veriyi yollama*/
        intent.putExtra("yollananVeri",kullaniciVerisi)
        intent.putExtra("isimverisi",isimverisi)
        intent.putExtra("soyisimverisi",soyisimverisi)
        startActivity(intent)

    }


    override fun onStart() { //Başlangıç
        super.onStart()
        println("onStart çağrıldı")
        //açılıp kapatıldığında onStart çağrılır.
    }

    override fun onResume() { //Devam edilidinde
        super.onResume()
        println("onResume çağrıldı")
    }

    override fun onPause() { //duraklatmak
        super.onPause()
        println("onPause çağrıldı")
    }

    override fun onStop() { //Durdurmak
        super.onStop()
        println("onStop çağrıldı")
    }

    override fun onDestroy() { //Yoketmek
        super.onDestroy()
        println("onDestroy çağrıldı")
    }


}