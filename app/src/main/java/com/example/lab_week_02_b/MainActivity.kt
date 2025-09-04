package com.example.lab_week_02_b

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    companion object { private const val TAG = "MainActivity" }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "onCreate")

        val input = findViewById<TextInputEditText>(R.id.color_code_input_field)
        val submit = findViewById<Button>(R.id.submit_button)

        submit.setOnClickListener {
            val code = input.text?.toString()?.trim().orEmpty()
            val intent = Intent(this, ResultActivity::class.java)
                .putExtra(ResultActivity.COLOR_KEY, code)
            startActivity(intent)
        }
    }
}
