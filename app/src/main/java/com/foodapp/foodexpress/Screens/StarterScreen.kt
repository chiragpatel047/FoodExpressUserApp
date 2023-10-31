package com.foodapp.foodexpress.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.foodapp.foodexpress.Components.ContentText
import com.foodapp.foodexpress.Components.HeadingText
import com.foodapp.foodexpress.Components.OrangeRoundedButton
import com.foodapp.foodexpress.R


@Composable
fun StarterScreen(navController: NavController) {

    Box(Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxSize()
        ) {
            Box(

                modifier = Modifier
                    .weight(1f)
                    .clip(shape = RoundedCornerShape(0.dp, 0.dp, 180.dp, 180.dp))
                    .background(Color.White)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.minorlogoback),
                    contentDescription = "minorlogo",
                    modifier = Modifier
                        .fillMaxSize()
                        .scale(scale = 1.4F)
                        .alpha(alpha = 0.3F)
                )
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color(0x33FF6736))
                ) {
                }
                Image(
                    painter = painterResource(id = R.drawable.girleatingimage),
                    contentDescription = "girleatingimage",
                    modifier = Modifier
                        .padding(10.dp, 0.dp, 0.dp, 80.dp)
                        .align(alignment = Alignment.BottomCenter)
                        .scale(scale = 1.7F)
                )
            }

            Column(modifier = Modifier.padding(0.dp, 30.dp, 0.dp, 30.dp)) {

                HeadingText(text = "Food Express App")
                ContentText(text = "Enjoy your favourite food at home at just in minutes")

                OrangeRoundedButton(label = "Let's Go"){
                    navController.navigate("onBoard")
                }
            }
        }
    }
}