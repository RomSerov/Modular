package com.example.tools

import android.util.Log
import com.example.core.tools.Logger

class LoggerImpl: Logger {

    override fun d(msg: String) {
        Log.d("APP", msg)
    }
}