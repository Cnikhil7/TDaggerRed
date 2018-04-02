package com.cnnc.android.tdaggerred

import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface RedditApiInterface {

    @GET("/r/{listings}/.json")
    fun getListFromListing(@Path("listing") listing: String
                           , @Query("limit") limit: Int = 10): Single<String>

}