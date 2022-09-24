package me.fatec.informetqapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        entraConta.setOnClickListener{
            btentraConta()
        }
    }

    private fun btentraConta(){
        val login = Intent(this,login::class.java)
        startActivity(login)
    }
}