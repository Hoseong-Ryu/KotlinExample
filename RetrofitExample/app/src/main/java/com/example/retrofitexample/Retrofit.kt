package com.example.retrofitexample

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class Retrofit {
    private var retrofit = Retrofit.Builder()
        .baseUrl("https://hoseong12.loca.lt")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    fun getUserAPI() : Service{
        return retrofit.create(Service::class.java)
    }
}