package com.example.composecourseyt

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composecourseyt.ui.theme.ComposeCourseYTTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val scrollState = rememberScrollState()
            LazyColumn(
//                modifier = Modifier.verticalScroll(scrollState)
            ) {
                itemsIndexed(listOf("This","is","Jetpack","Compose")) { index, string ->
                   Text(
                       text = "Item: $string", // lazy load - load on scrolling item
                       fontSize = 24.sp,
                       fontWeight = FontWeight.Bold,
                       textAlign = TextAlign.Center,
                       modifier = Modifier
                           .fillMaxWidth()
                           .padding(vertical = 24.dp)
                   )
               }
            }
        }
    }
}
