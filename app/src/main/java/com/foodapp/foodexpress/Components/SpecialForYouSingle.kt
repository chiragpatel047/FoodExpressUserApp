package com.foodapp.foodexpress.Components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.foodapp.foodexpress.R

@Composable
fun SpecialForYouSingle(backImage: Int, discount: String, currentPage: String) {

    val gradientVerticalBrush = Brush.verticalGradient(
        colors = listOf(Color.Transparent, Color(0x73000000)), // Gradient colors
        //startY = 0f, // Starting Y position of the gradient
        //endY = 500f ,// Ending Y position of the gradient
    )

    val gradientHorizontalBrush = Brush.horizontalGradient(
        colors = listOf(Color(0x99000000), Color.Transparent), // Gradient colors
        startX = 100f, // Starting Y position of the gradient
        endX = 500f,// Ending Y position of the gradient
    )

    Box(
        modifier = Modifier
            .height(160.dp)
            .fillMaxWidth()
            .padding(20.dp, 10.dp, 20.dp, 0.dp)
            .background(MaterialTheme.colorScheme.background)
            .shadow(10.dp, shape = RoundedCornerShape(25.dp))

    ) {
        Image(
            painter = painterResource(id = backImage),
            contentDescription = "",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxSize()
                .clip(RoundedCornerShape(25.dp))
                .background(Color.Transparent)

        )

        Box(
            modifier = Modifier
                .fillMaxSize()
                .clip(RoundedCornerShape(25.dp))
                .background(gradientVerticalBrush)
        ) {

        }

        Box(
            modifier = Modifier
                .fillMaxSize()
                .clip(RoundedCornerShape(25.dp))
                .background(gradientHorizontalBrush)
        ) {

        }

        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.SpaceBetween
        ) {

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {

                Row(
                    modifier = Modifier
                        .padding(10.dp)
                        .clip(RoundedCornerShape(50.dp))
                        .background(Color.White)
                        .clickable {

                        }
                ) {
                    Text(
                        text = "Limited time!",
                        fontSize = 10.sp,
                        color = Color.DarkGray,
                        style = MaterialTheme.typography.titleLarge,
                        modifier = Modifier
                            .padding(15.dp, 8.dp, 15.dp, 5.dp)

                    )
                }

                Row(
                    modifier = Modifier
                        .padding(10.dp)
                        .clip(RoundedCornerShape(50.dp))
                        .background(Color(0x99000000))

                ) {
                    Text(
                        text = currentPage + "/3",
                        fontSize = 10.sp,
                        color = Color.White,
                        style = MaterialTheme.typography.titleLarge,
                        modifier = Modifier
                            .padding(15.dp, 8.dp, 15.dp, 5.dp)

                    )
                }
            }

            Text(
                text = "Get Special Discount\nUp to " + discount + "%",
                textAlign = TextAlign.Start,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White,
                style = MaterialTheme.typography.titleLarge,
                modifier = Modifier.padding(10.dp, 0.dp)
            )

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp, 0.dp, 10.dp, 10.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.Bottom
            ) {

                Text(
                    text = "All restros available | T&C Applied",
                    textAlign = TextAlign.Start,
                    fontSize = 10.sp,
                    color = Color.White,
                    style = MaterialTheme.typography.titleLarge
                )

                Row(
                    modifier = Modifier
                        .clip(RoundedCornerShape(50.dp))
                        .background(MaterialTheme.colorScheme.primary)
                        .clickable {

                        }
                ) {
                    Text(
                        text = "Claim",
                        fontSize = 10.sp,
                        color = MaterialTheme.colorScheme.onPrimary,
                        style = MaterialTheme.typography.titleLarge,
                        modifier = Modifier
                            .padding(15.dp, 7.dp, 15.dp, 5.dp)

                    )
                }

            }

        }

    }
}