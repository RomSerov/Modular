package com.example.tools

import android.content.Context
import android.widget.Toast
import com.example.core.tools.Toaster
import javax.inject.Inject

class ToasterImpl @Inject constructor(
    private val appContext: Context
) : Toaster {

    override fun show(msg: String) {
        Toast.makeText(appContext, msg, Toast.LENGTH_SHORT).show()
    }
}