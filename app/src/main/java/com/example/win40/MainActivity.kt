package com.example.win40

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.win40.ui.theme.Win40Theme
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.ui.Alignment
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberAsyncImagePainter

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Image(
                painter = rememberAsyncImagePainter("http://49.12.202.175/win40/gradient.png"),
                contentDescription = null,
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.FillBounds
            )
            val contextCurrent = LocalContext.current
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Button(onClick = {
                    contextCurrent.startActivity(
                        Intent(
                            this@MainActivity,
                            TopMmrActivity::class.java
                        )
                    )
                }) {
                    Text(
                        text = resources.getString(R.string.topmmr),
                        fontSize = 18.sp
                    )
                }
                Button(onClick = {
                    contextCurrent.startActivity(
                        Intent(
                            this@MainActivity,
                            TopCsActivity::class.java
                        )
                    )
                }) {
                    Text(
                        text = resources.getString(R.string.topCs),
                        fontSize = 18.sp
                    )
                }
            }
        }
    }
}

