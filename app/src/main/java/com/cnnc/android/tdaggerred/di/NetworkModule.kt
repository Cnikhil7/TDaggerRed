package com.cnnc.android.tdaggerred.di

//
//import dagger.Module
//import dagger.Provides
//import retrofit2.Retrofit
//import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
//import retrofit2.converter.gson.GsonConverterFactory
//import javax.inject.Singleton
//
//@Module
//class NetworkModule(var baseUrl: String) {
//
//    @Provides
//    @Singleton
//    fun provideRetrofit(): Retrofit{
//        return Retrofit.Builder()
//                .baseUrl(baseUrl)
//                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
//                .addConverterFactory(GsonConverterFactory.create())
//                .build()
//    }
//}
