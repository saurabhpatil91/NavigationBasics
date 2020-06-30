package com.saurabh.navigationbasics.ui.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.saurabh.navigationbasics.R
import com.saurabh.navigationbasics.ui.MainActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        var button = findViewById<Button>(R.id.button)
        button.setOnClickListener(View.OnClickListener {
            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent) })
    }
}