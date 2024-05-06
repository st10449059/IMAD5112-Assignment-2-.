package za.ac.iie.assignment2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Switch

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val switch1 = findViewById<Switch>(R.id.switch1)
        val switch2 = findViewById<Switch>(R.id.switch2)
        val switch3 = findViewById<Switch>(R.id.switch3)

        val btn1 = findViewById<Button>(R.id.btn1)
        btn1.setOnClickListener {
            val Intent = Intent(this,MainActivity3::class.java)
        }
        val btn2 = findViewById<Button>(R.id.btn2)
        btn2.setOnClickListener {
            val Intent = Intent(this,MainActivity3::class.java)
        }
        val btn3 = findViewById<Button>(R.id.btn3)
        btn3.setOnClickListener {
            val Intent = Intent(this,MainActivity3::class.java)
        }



    }
}