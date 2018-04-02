package com.cnnc.android.tdaggerred

import android.app.Application
import com.cnnc.android.tdaggerred.di.AppModule
import com.cnnc.android.tdaggerred.di.DaggerNetComponent
import com.cnnc.android.tdaggerred.di.NetComponent

class MyApplication : Application() {

    companion object {
        @JvmStatic
        lateinit var netComponent: NetComponent
    }

    override fun onCreate() {
        super.onCreate()
        netComponent = DaggerNetComponent
                .builder()
                .appModule(AppModule(this))
                .build()

    }
}
