package com.example.retrofitexample

import retrofit2.Call
import retrofit2.http.GET

interface Service {
    @GET("/user")
    fun user(): Call<List<userResponse>>
}