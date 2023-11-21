package com.theberdakh.testcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import com.theberdakh.testcompose.ui.theme.TestComposeTheme
import com.theberdakh.testcompose.ui.theme.Typography

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            TestComposeTheme(
                darkTheme = false,
            ) {
                Column {
                    ShowName(text = "Berdakh")
                    ShowBoldText(text = "This is bold")
                }
            }

        }
    }
}

@Composable
fun ShowName(text: String) {
    Text(
        text = text,
        style = Typography.bodyLarge
    )
}

@Composable
fun ShowBoldText(text: String) {
    Text(
        text = text,
        style = TextStyle(
            fontWeight = FontWeight.Bold
        )
    )
}
