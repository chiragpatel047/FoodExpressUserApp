package com.foodapp.foodexpress

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
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.foodapp.foodexpress.Screens.EnableLoactionScreen
import com.foodapp.foodexpress.Screens.FullRestaurantScreen
import com.foodapp.foodexpress.Screens.LiveUpdateScreen
import com.foodapp.foodexpress.Screens.LoginScreen
import com.foodapp.foodexpress.Screens.MainScreen
import com.foodapp.foodexpress.Screens.OnBoardingScreen
import com.foodapp.foodexpress.Screens.OtpScreen
import com.foodapp.foodexpress.Screens.StarterScreen
import com.foodapp.foodexpress.ui.theme.FoodExpressTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FoodExpressTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    App()
                }
            }
        }
    }

    @Composable
    fun App() {
        val navController = rememberNavController()
        NavHost(navController = navController, startDestination = "main") {
            composable(route = "starter") {
                StarterScreen(navController)
            }
            composable(route = "onBoard") {
                OnBoardingScreen(navController)
            }
            composable(route = "login") {
                LoginScreen(navController)
            }
            composable(route = "otp") {
                OtpScreen(navController)
            }
            composable(route = "enableLocation") {
                EnableLoactionScreen(navController)
            }
            composable(route = "liveUpdate") {
                LiveUpdateScreen(navController)
            }
            composable(route = "main") {
                MainScreen(navController)
            }
            composable(route = "fullRestaurant") {
                FullRestaurantScreen(navController = navController)
            }
        }
    }
}

