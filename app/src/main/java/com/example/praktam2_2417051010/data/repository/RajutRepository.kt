package com.example.praktam2_2417051010.data.repository
import com.example.praktam2_2417051010.data.api.RetrofitClient
import com.example.praktam2_2417051010.data.model.Rajut

class RajutRepository {
    suspend fun getRajut(): List<Rajut> {
        return try {
            RetrofitClient.instance.getRajut()
        } catch (e: Exception) {
            emptyList()
        }
    }
}