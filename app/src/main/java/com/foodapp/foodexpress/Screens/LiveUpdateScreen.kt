package com.foodapp.foodexpress.Screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.foodapp.foodexpress.Components.Content2Text
import com.foodapp.foodexpress.Components.HeadingText
import com.foodapp.foodexpress.Components.OrangeRoundedButton
import com.foodapp.foodexpress.Components.TransparentOrangeTextRoundedButton
import com.foodapp.foodexpress.Components.subjectImage
import com.foodapp.foodexpress.R

@Composable
fun LiveUpdateScreen(navController: NavController) {
    Column(modifier = Modifier.fillMaxSize()) {
        Spacer(modifier = Modifier.padding(50.dp))
        subjectImage(image = R.drawable.liveupdateimage)
        HeadingText(text = "Get Live Update on Your Order Status")

        Content2Text(
            text = "Allow push notification to get real-time updates on your order status",
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.padding(20.dp))

        OrangeRoundedButton(label = "Turn on Notification") {
            navController.navigate("main")

        }
        TransparentOrangeTextRoundedButton(label = "Now now") {
            navController.navigate("main")
        }
    }
}