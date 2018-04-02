package com.cnnc.android.tdaggerred

//import com.cnnc.android.tdaggerred.di.NetworkModule
import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {

//    @Inject
//    lateinit var networkModule: NetworkModule

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        MyApplication.netComponent.inject(this)

        initialiseLateINITs()

    }

    private fun initialiseLateINITs() {


//
//
//        val retrofit: Retrofit = networkModule.provideRetrofit()
//        var service: RedditApiInterface = retrofit.create(RedditApiInterface::class.java)
//
//        service.getListFromListing(listing = "top")


    }
}
