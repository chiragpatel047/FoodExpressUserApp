package com.foodapp.foodexpress.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import com.foodapp.foodexpress.R

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun StarterScreen() {

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

                Text(
                    text = "Food Express App",
                    textAlign = TextAlign.Center,
                    fontSize = 24.sp,
                    style = MaterialTheme.typography.titleLarge,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(20.dp)
                )
                Text(
                    text = "Enjoy your favourite food at home at just in minutes",
                    textAlign = TextAlign.Center,
                    fontSize = 16.sp,
                    style = MaterialTheme.typography.titleLarge,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(20.dp, 5.dp)
                )

                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(Color(0xFFFF6736)),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(20.dp)
                ) {
                    Text(
                        text = "Let's Go",
                        fontSize = 16.sp,
                        style = MaterialTheme.typography.titleLarge,
                        modifier = Modifier.padding(5.dp)
                    )
                }
            }
        }
    }
}