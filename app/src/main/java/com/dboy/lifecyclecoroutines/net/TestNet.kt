package com.dboy.lifecyclecoroutines.net

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

object TestNet {
    val netClient: OkHttpClient by lazy {
        OkHttpClient.Builder()
            .readTimeout(15, TimeUnit.SECONDS)
            .connectTimeout(0xf, TimeUnit.SECONDS).build()
    }


    open val retrofit: Retrofit by lazy {
        Retrofit.Builder()
            .client(netClient)
            .baseUrl("https://www.wanandroid.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }


}