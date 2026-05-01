package com.example.praktam2_2417051010.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {
    private  const val BASE_URL = "https://gist.githubusercontent.com/fenyadria/14b1f9225655d481da708a0197c15a15/raw/b2b90b5013eb244570f4f6ab4b97fbcbbf85b538/"

    val instance: ApiService by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiService::class.java)
    }
}