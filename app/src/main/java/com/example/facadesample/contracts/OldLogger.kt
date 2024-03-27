package com.example.facadesample.contracts

import com.example.facadesample.external_library_simulation.VeryCoolDeprecatedLibrary

class OldLogger(private val libraryInstance: VeryCoolDeprecatedLibrary) : LibraryContract {
//    override fun writeNonFatalLog(msg: String) {
//        libraryInstance.writeNonFatalLog(msg)
//    }

    override fun writeFatalLog(msg: String) {
        libraryInstance.writeFatalLog(msg)
    }

    override fun writeWarning(msg: String) {
        libraryInstance.writeWarning(msg)
    }

    override fun writeDebugLog(msg: String) {
        libraryInstance.writeDebugLog(msg)
    }
}