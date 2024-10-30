package com.example.testtesttest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.testtesttest.ui.theme.TestTestTestTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TestTestTestTheme {
                // A surface container using the 'background' color from the theme
                SecondScreen()
            }
        }
    }
}

@Composable
fun SecondScreen() {
    Box(
        modifier = Modifier
            .background(Color.Gray)
            .size(50.dp, 100.dp),
        contentAlignment = Alignment.Center
    ) {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .size(30.dp, 80.dp)
                .clip(RoundedCornerShape(50))
                .background(Color.Blue)
        ) {
            Box(
                modifier = Modifier
                    .size(15.dp, 40.dp)
                    .clip(RoundedCornerShape(50))
                    .background(Color.Gray)
            )
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TestTestTestTheme {
        Greeting("Android")
    }
}