package com.eylem.kotlin_functions_work_sheet

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        //1) name argument / default argument
        println(carp())
        carp(2)
        carp(sayi2 = 8)
        carp(2, 6,)

        //2a) vararg
        // keyden önceki tüm parametreler vararg parametresidir..
        getUserInfo("eylem", "35", "çorlu", "Türkiye", "evli", key = 3)
        //2b) vararg parametre türü olarak Any örneği
        getUserInfo2("Eylem", 35, "Psikoloji", true, 'E', "Bilecik", 1.65)
    }


//1)--- fonksiyonlara name argument ya da default argument, fonksiyon overload---
// fonksiyon parametrelerine opsiyonel olarak başlangıç değeri vermektir.(name&default argument)
// bu yapıldığında fonksiyon parametresine değer vermeden kullanıldığı gibi yine yukarıda görüldüğü gibi
// en baştan  değer verilerek de kullanılabilir, 3 default parametre verildiyse mesela
// istediğimiz birine ya da bir kaçına değer verip kalanı default olarak da kullanabiliriz
// birden fazla kullanımı da olduğu için overload da olmuş olur.

    fun carp(sayi1: Int = 3, sayi2: Int = 5): Int {
        return 2 * sayi1
    }

    //2a) --- Variable Number Of Arguments (vararg)---
//eğer fonksiyon birden çok parametre alacaksa ve hangi parametlerin geleceğini bilemiyorsak
// vararg olarak tanımlanır. Burada kullanıcı bilgisi isteyeceğiz ve kullanıcı hangi bilgileri
// verecek bilmiyoruz. isim,yaş,ülke vs bir sürü parametre girebilir.
    fun getUserInfo(vararg userInfo: String, key: Int) {

    }

    //2b) Tür olarak da Any değeri verirsek tüm türlerden vararg parametlereleri girilebilir.
    fun getUserInfo2(vararg userInfo: Any) {
    }
}