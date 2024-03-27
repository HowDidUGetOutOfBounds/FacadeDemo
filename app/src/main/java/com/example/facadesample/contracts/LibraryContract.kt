package com.example.facadesample.contracts

import android.util.Log

interface LibraryContract {
    fun writeNonFatalLog(msg: String)

    fun writeFatalLog(msg: String)

    fun writeWarning(msg: String)

    fun writeDebugLog(msg: String)
}