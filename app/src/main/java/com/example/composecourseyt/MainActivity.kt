package com.example.composecourseyt

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.composecourseyt.ui.theme.ComposeCourseYTTheme
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // States in compose
            val color = remember { mutableStateOf(Color.Blue) }
            Column(Modifier.fillMaxSize()) {
                ColorBox(
                    Modifier
                        .fillMaxSize()
                        .weight(1f)
                ) {
                    color.value = it
                }
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .weight(1f)
                        .background(color.value)
                )
            }
        }
    }
}

@Composable
fun ColorBox(
    modifier: Modifier = Modifier,
    updateColor: (Color) -> Unit
) {

//    var count = 0
//    val text = mutableStateOf("Clicked $count")
    Box(modifier = Modifier
        .clickable {
            updateColor(
                Color(
                    Random.nextFloat(),
                    Random.nextFloat(),
                    Random.nextFloat(),
                    1f
                )
            )

        })
}