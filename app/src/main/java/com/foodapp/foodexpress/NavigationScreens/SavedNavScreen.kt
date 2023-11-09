package com.foodapp.foodexpress.NavigationScreens

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.foodapp.foodexpress.Components.HeadingText

@Composable
fun SavedNavScreen(){
    Row(modifier =  Modifier.fillMaxSize()){
        HeadingText(text = "savedScreen")
    }
}