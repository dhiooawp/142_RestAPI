package com.example.kontakrestapi

import android.app.Application
import com.example.kontakrestapi.repository.AppContainer
import com.example.kontakrestapi.repository.KontakContainer

class KontakApplikation : Application(){
    /** AppContainer instance used by the rest of classes to obtain depefencies */
    lateinit var container: AppContainer

    override fun onCreate() {
        super.onCreate()
        container = KontakContainer()
    }
}