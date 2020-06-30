package com.saurabh.navigationbasics

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.saurabh.navigationbasics.listener.LogoutListener
import com.saurabh.navigationbasics.ui.login.LoginActivity

open class BaseActivity : AppCompatActivity(),LogoutListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        (application as? MyApplication)?.registerSessionListener(this)
        (application as? MyApplication)?.startUserSession()
    }

    override fun onSessionLogout() {
        finish()
        startActivity(Intent(this,LoginActivity::class.java))
    }

    override fun onUserInteraction() {
        super.onUserInteraction()
        (application as? MyApplication)?.onUserInteracted()
    }
}