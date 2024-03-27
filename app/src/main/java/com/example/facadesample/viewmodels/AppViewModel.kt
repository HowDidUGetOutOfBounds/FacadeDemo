package com.example.facadesample.viewmodels

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.facadesample.external_library_simulation.VeryCoolDeprecatedLibrary
import dagger.hilt.android.lifecycle.HiltViewModel
import java.time.Instant
import java.time.ZoneId
import java.time.format.DateTimeFormatter
import javax.inject.Inject

@HiltViewModel
class AppViewModel @Inject constructor(
    private val logger: VeryCoolDeprecatedLibrary,
) : ViewModel() {
    fun writeNonFatalLog(msg: String) {
       logger.writeNonFatalLog(msg)
    }

    fun writeFatalLog(msg: String) {
        logger.writeFatalLog(msg)
    }

    fun writeWarning(msg: String) {
        logger.writeWarning(msg)
    }

    fun writeDebugLog(msg: String) {
        logger.writeDebugLog(msg)
    }
}