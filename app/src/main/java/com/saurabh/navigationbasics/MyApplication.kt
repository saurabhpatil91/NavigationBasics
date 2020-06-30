package com.saurabh.navigationbasics

import android.app.Application
import com.saurabh.navigationbasics.listener.LogoutListener
import java.util.*
import kotlin.concurrent.timerTask


class MyApplication : Application() {
    private lateinit var listener : LogoutListener
    private var timer: Timer? = null

    fun startUserSession(){
        cancelTimer()
        timer = Timer()
        timer?.schedule(timerTask { listener.onSessionLogout() }, 5000)
    }

    fun cancelTimer(){
        if (timer != null)
        timer?.cancel()
    }

    fun registerSessionListener(listener: LogoutListener) {
        this.listener = listener
    }

    fun onUserInteracted() {
        startUserSession()
    }

}