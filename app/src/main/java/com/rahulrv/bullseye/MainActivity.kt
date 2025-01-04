package com.rahulrv.bullseye

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.rahulrv.bullseye.screens.AboutScreen
import com.rahulrv.bullseye.screens.GameScreen
import com.rahulrv.bullseye.ui.theme.BullseyeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BullseyeTheme {
                Surface {
                    MainScreen()
                }
            }
        }
    }
}

@Composable
fun MainScreen() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = "gamescreen"
    ) {
        composable("gamescreen") {
            GameScreen(
                onNavigationToAbout = { navController.navigate("about")}
            )
        }
        composable("about") {
            AboutScreen(
                onBackPressed = {
                    navController.navigateUp()
                }
            )
        }
    }
}