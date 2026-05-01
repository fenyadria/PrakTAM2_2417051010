package com.example.praktam2_2417051010.model

import android.content.Context

object RajutSource {
    fun getResourceId(context: Context, imageName: String): Int {
        return context.resources.getIdentifier(imageName, "drawable", context.packageName)
    }
}