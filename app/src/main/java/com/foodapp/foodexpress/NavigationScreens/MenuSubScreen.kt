package com.foodapp.foodexpress.NavigationScreens

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.sp

@Composable
fun MenuSubScreen() {

    Column {
        Text("Menu", style = MaterialTheme.typography.titleLarge, fontSize = 24.sp)
    }
}