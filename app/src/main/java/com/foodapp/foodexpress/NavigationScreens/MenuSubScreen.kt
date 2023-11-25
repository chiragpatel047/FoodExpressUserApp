package com.foodapp.foodexpress.NavigationScreens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.foodapp.foodexpress.Components.DishMenuSingle
import com.foodapp.foodexpress.Components.textWithSeeAllText

@Composable
fun MenuSubScreen() {

    val scrollState = rememberScrollState()

    Column(Modifier.verticalScroll(scrollState)) {

        Spacer(modifier = Modifier.padding(4.dp))

        textWithSeeAllText(title = "Recommended")

        val menuItems = listOf("panner", "chicken", "tickka", "pizza", "burger", "rolls")

        menuItems.forEach {
            DishMenuSingle()
        }
    }
}