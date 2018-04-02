package com.cnnc.android.tdaggerred.di

import com.cnnc.android.tdaggerred.HomeActivity
import com.cnnc.android.tdaggerred.MyApplication
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [(AppModule::class), (NetworkModule::class)])
interface NetComponent {

    fun inject(activity: HomeActivity)
    fun inject(application: MyApplication)

}