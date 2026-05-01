package com.example.praktam2_2417051010.model
import com.google.gson.annotations.SerializedName

data class Rajut(
    @SerializedName("nama")
    val nama: String,

    @SerializedName("deskripsi")
    val deskripsi: String,

    @SerializedName("harga")
    val harga: Int,

    @SerializedName("image_url")
    val imageUrl: String
)