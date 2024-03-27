package com.example.facadesample.external_library_simulation

import android.util.Log
import java.time.Instant
import java.time.ZoneId
import java.time.format.DateTimeFormatter

// Let's pretend, it's library in your project, that you would like to remove
// You cannot change sources, as it is library added from Gradle

class VeryCoolDeprecatedLibrary {
    fun writeNonFatalLog(msg: String) { // pretend to have 50+ usages
        Log.d("Jilia", "Non Fatal: $msg")
    }

    fun writeFatalLog(msg: String) { // pretend to have 50+ usages
        Log.d("Jilia", "Fatal: $msg")
    }

    fun writeWarning(msg: String) { // pretend to have 50+ usages
        val currentTime = Instant.now()
        val formatter = DateTimeFormatter.ofPattern("HH:mm:ss").withZone(ZoneId.systemDefault())
        val formattedTime = formatter.format(currentTime)
        Log.d("Jilia", "Warning: $msg $formattedTime")
    }

    fun writeDebugLog(msg: String) { // pretend to have 50+ usages
        Log.d("Jilia", "Debug: $msg")
    }
}
