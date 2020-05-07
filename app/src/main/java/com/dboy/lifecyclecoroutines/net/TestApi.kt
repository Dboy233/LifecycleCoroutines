package com.dboy.lifecyclecoroutines.net

import retrofit2.Response
import retrofit2.http.GET

interface TestApi {
    @GET("article/list/1/json")
    suspend fun test(): Response<WanBean>

}