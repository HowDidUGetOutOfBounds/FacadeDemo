package com.example.facadesample.contracts

import android.util.Log

interface LibraryContract {
    fun writeFatalLog(msg: String)

    fun writeWarning(msg: String)

    fun writeDebugLog(msg: String)
}