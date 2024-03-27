package com.example.facadesample.contracts

import android.util.Log

class NewLogger: LibraryContract {
    override fun writeNonFatalLog(msg: String) {
        Log.d("Jilia", "Warning: $msg")
    }

    override fun writeFatalLog(msg: String) {
        Log.d("Jilia", "Fatal: $msg")
    }

    override fun writeWarning(msg: String) {
        Log.d("Jilia", "Warning: $msg")
    }

    override fun writeDebugLog(msg: String) {
        Log.d("Jilia", "Debug: $msg")
    }
}