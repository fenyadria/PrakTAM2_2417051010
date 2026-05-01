package com.example.praktam2_2417051010.network

import com.example.praktam2_2417051010.model.Rajut
import retrofit2.http.GET

interface ApiService {
    @GET("katalog_rajut.json")
    suspend fun  getRajut(): List<Rajut>
}