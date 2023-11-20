package com.theberdakh.testcompose

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.theberdakh.testcompose.ui.theme.TestComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            TestComposeTheme(
                darkTheme = false,
            ) {
                Greeting(name = "Berdakh",
                    Modifier
                        .fillMaxWidth(20f)
                        .padding(16.dp)
                        .background(Color.Cyan)
                        .padding(16.dp)
                        .clickable {
                            Toast
                                .makeText(this, "Clicked", Toast.LENGTH_LONG)
                                .show()
                        })
            }

        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier,
        style = TextStyle(
            textAlign = TextAlign.Center
        )
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TestComposeTheme {
        Greeting("Android")
    }
}