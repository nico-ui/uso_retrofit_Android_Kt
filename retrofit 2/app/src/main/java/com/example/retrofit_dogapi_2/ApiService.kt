package com.example.retrofit_dogapi_2

import retrofit2.http.GET
import retrofit2.http.Url
import retrofit2.Response

interface ApiService {
    @GET
    suspend fun getDogsByBreeds(@Url url:String):Response<DogsResponse>
}