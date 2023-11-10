package com.foodapp.foodexpress.Screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.foodapp.foodexpress.Components.NavigationItem
import com.foodapp.foodexpress.NavigationScreens.CartNavScreen
import com.foodapp.foodexpress.NavigationScreens.HomeNavScreen
import com.foodapp.foodexpress.NavigationScreens.OrdersNavScreen
import com.foodapp.foodexpress.NavigationScreens.ProfileNavScreen
import com.foodapp.foodexpress.NavigationScreens.SavedNavScreen
import com.foodapp.foodexpress.R

@Composable
fun MainScreen(navController: NavController) {

    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        var currentNavScreen = remember { mutableStateOf(NavigationItem.HomeNav.route) }
        Column(
            modifier = Modifier.weight(1f)
        ) {
            when (currentNavScreen.value) {
                NavigationItem.HomeNav.route -> {
                    HomeNavScreen(navController)
                }

                NavigationItem.OrderNav.route -> {
                    OrdersNavScreen()
                }

                NavigationItem.SaveNav.route -> {
                    SavedNavScreen()
                }

                NavigationItem.CartNav.route -> {
                    CartNavScreen()
                }

                NavigationItem.ProfileNav.route -> {
                    ProfileNavScreen()
                }
            }
        }
//        val navNavHostController = rememberNavController()
//
//        NavHost(
//            navController = navNavHostController,
//            startDestination = NavigationItem.HomeNav.route
//        ) {
//            composable(route = NavigationItem.HomeNav.route) {
//                currentNavScreen.value = NavigationItem.HomeNav.route
//            }
//            composable(route = NavigationItem.OrderNav.route) {
//                currentNavScreen.value = NavigationItem.OrderNav.route
//            }
//            composable(route = NavigationItem.SaveNav.route) {
//                currentNavScreen.value = NavigationItem.SaveNav.route
//            }
//            composable(route = NavigationItem.CartNav.route) {
//                currentNavScreen.value = NavigationItem.CartNav.route
//            }
//            composable(route = NavigationItem.ProfileNav.route) {
//                currentNavScreen.value = NavigationItem.ProfileNav.route
//            }
//        }

        val list = listOf(
            NavigationItem.HomeNav,
            NavigationItem.OrderNav,
            NavigationItem.SaveNav,
            NavigationItem.CartNav,
            NavigationItem.ProfileNav
        )

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(15.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            list.forEach {
                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.clickable {
                        currentNavScreen.value = it.route
                    }
                ) {
                    Icon(
                        painter = painterResource(id = it.icon),
                        tint = if (currentNavScreen.value.equals(it.route)) MaterialTheme.colorScheme.primary else Color.LightGray,
                        contentDescription = "",
                        modifier = Modifier.size(20.dp)
                    )
                    Spacer(modifier = Modifier.padding(2.dp))
                    Text(
                        text = it.label,
                        color = if (currentNavScreen.value.equals(it.route)) MaterialTheme.colorScheme.primary else Color.LightGray,
                        fontSize = 12.sp,
                        style = MaterialTheme.typography.titleLarge
                    )
                }
            }
        }
    }
}


