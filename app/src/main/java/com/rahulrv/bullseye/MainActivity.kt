package com.rahulrv.bullseye

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Slider
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.rahulrv.bullseye.ui.theme.BullseyeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BullseyeTheme {
                Surface {
                    GameScreen()
                }
            }
        }
    }
}

@Composable
fun GameScreen() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "PUT THE BULLSEYE AS CLOSE AS YOU CAN TO")
        Text(text = "89", fontSize = 32.sp, fontWeight = FontWeight.Bold)
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = "1")
            Slider(
                value = 0.5f,
                valueRange = 0.01f..1f,
                onValueChange = {}
            )
            Text(text = "100")
        }
        Button(onClick = {}) {
            Text(text = "HIT ME")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BullseyeTheme {
        GameScreen()
    }
}