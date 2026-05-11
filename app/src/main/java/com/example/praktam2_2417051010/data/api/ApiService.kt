package com.example.praktam2_2417051010.data.api

import com.example.praktam2_2417051010.data.model.Rajut
import retrofit2.http.GET

interface ApiService {
    @GET("katalog_rajut.json")
    suspend fun  getRajut(): List<Rajut>
}