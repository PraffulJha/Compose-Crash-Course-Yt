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
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.ConstraintSet
import androidx.constraintlayout.compose.Dimension
import com.example.composecourseyt.ui.theme.ComposeCourseYTTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val constraintsSet = ConstraintSet{
                val greenBox = createRefFor("greenbox")
                val blueBox = createRefFor("blueBox")
                constrain(greenBox) {
                    top.linkTo(parent.top)
                    start.linkTo(parent.start)
                    width = Dimension.matchParent
                    height = Dimension.value(100.dp)
                }
                constrain(blueBox) {
                    top.linkTo(greenBox.bottom)
                    start.linkTo(parent.start)
                    width = Dimension.matchParent
                    height = Dimension.value(100.dp)
                }
            }
            ConstraintLayout(constraintsSet, modifier = Modifier.fillMaxSize()) {
                Box(
                    modifier = Modifier
                        .background(Color.Green)
                        .layoutId("greenbox")
                ){
                    Text(text = "This is Green Box")
                }
                Box(
                    modifier = Modifier
                        .background(Color.Blue)
                        .layoutId("blueBox")
                ){
                    Text(text = "This is Blue Box")
                }
            }
        }
    }
}
