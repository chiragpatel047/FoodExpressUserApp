package com.foodapp.foodexpress.NavigationScreens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import com.foodapp.foodexpress.Components.DishMenuSingle

@Composable
fun MenuSubScreen() {

    val scrollState = rememberScrollState()

    Column(Modifier.verticalScroll(scrollState)) {
        val menuItems = listOf("panner", "chicken", "tickka", "pizza", "burger", "rolls")

        menuItems.forEach {
            DishMenuSingle()
        }
    }
}