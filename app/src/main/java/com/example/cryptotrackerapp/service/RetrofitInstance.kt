package com.example.cryptotrackerapp.service

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object RetrofitInstance {
    private val BASE_URL = "https://a7dde09f-aa61-443a-b9ff-ff9c0048eb40.mock.pstmn.io/v2/"

    private val retrofit:Retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val assetsService:AssetsService by lazy {
        retrofit.create(AssetsService::class.java)
    }
}