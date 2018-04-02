package com.cnnc.android.tdaggerred

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.cnnc.android.tdaggerred.di.NetworkModule
import retrofit2.Retrofit
import javax.inject.Inject

class HomeActivity : AppCompatActivity() {

    @Inject
    lateinit var networkModule: NetworkModule

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        MyApplication.netComponent.inject(this)

        initialiseLateINITs()

    }

    private fun initialiseLateINITs() {
        val retrofit : Retrofit = networkModule.provideRetrofit()
        retrofit.create(RedditApiInterface::class.java)
    }
}
