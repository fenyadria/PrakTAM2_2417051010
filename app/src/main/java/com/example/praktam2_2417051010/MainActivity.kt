package com.example.praktam2_2417051010

import Model.RajutSource
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.example.praktam2_2417051010.ui.theme.PrakTAM2_2417051010Theme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PrakTAM2_2417051010Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                }
            }
        }
    }
}

@Composable
fun Greeting() {
    val Rajut = RajutSource.dummyRajut[0]

    Column(modifier = Modifier.fillMaxSize().padding(all = 60.dp)) {
        Image(
            painter = painterResource(id = Rajut.ImageRes),
            contentDescription = Rajut.nama,
            modifier = Modifier.size(200.dp),
            contentScale = ContentScale.Crop
        )
        Text(text = "Nama : ${Rajut.nama}")
        Text(text = "Deskripsi : ${Rajut.deskripsi}")
        Text(text = "Harga : ${Rajut.harga}")
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PrakTAM2_2417051010Theme {
        Greeting()
    }
}