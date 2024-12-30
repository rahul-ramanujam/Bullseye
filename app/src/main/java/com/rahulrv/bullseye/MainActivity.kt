package com.rahulrv.bullseye

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Surface
import com.rahulrv.bullseye.screens.GameScreen
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