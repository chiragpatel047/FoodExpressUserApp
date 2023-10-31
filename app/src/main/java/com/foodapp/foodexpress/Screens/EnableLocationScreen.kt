package com.foodapp.foodexpress.Screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.foodapp.foodexpress.Components.Content2Text
import com.foodapp.foodexpress.Components.HeadingText
import com.foodapp.foodexpress.Components.OrangeRoundedButton
import com.foodapp.foodexpress.Components.TransparentOrangeTextRoundedButton
import com.foodapp.foodexpress.Components.subjectImage
import com.foodapp.foodexpress.R

@Composable
fun EnableLoactionScreen(navController: NavController) {
    Column(modifier = Modifier.fillMaxSize()) {
        Spacer(modifier = Modifier.padding(50.dp))
        subjectImage(image = R.drawable.locationimage)
        HeadingText(text = "What is Your Location?")

        Content2Text(
            text = "We need your location to show available restaurant & Products",
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.padding(20.dp))

        OrangeRoundedButton(label = "Allow Location Access") {
            navController.navigate("liveUpdate")
        }
        TransparentOrangeTextRoundedButton(label = "Now now") {
            navController.navigate("liveUpdate")
        }
    }
}