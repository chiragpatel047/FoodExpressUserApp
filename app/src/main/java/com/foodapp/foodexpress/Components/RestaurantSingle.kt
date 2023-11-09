package com.foodapp.foodexpress.Components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
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
fun RestaurantSingle(
    resImage: Int,
    resName: String,
    resTopItems: String,
    resRating: String,
    resAddress: String
) {

    Column(
        modifier = Modifier
            .padding(10.dp, 5.dp, 10.dp, 5.dp)
            .fillMaxWidth()
            .shadow(5.dp, RoundedCornerShape(20.dp))
            .clip(RoundedCornerShape(20.dp))
            .background(MaterialTheme.colorScheme.primaryContainer)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(130.dp)
        ) {
            Image(
                painter = painterResource(id = resImage),
                contentDescription = "",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(130.dp)
            )

            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.SpaceBetween,
                horizontalAlignment = Alignment.End
            ) {

                Icon(
                    painter = painterResource(id = R.drawable.favicon),
                    contentDescription = "",
                    tint = Color(0xFFFFCB25),
                    modifier = Modifier
                        .size(15.dp)
                        .padding(8.dp)
                )

                Row(
                    modifier = Modifier
                        .padding(10.dp)
                        .clip(RoundedCornerShape(15.dp, 15.dp, 0.dp, 15.dp))
                        .background(Color.White),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.staricon),
                        contentDescription = "",
                        tint = Color(0xFFFFCB25),
                        modifier = Modifier
                            .size(15.dp)
                            .padding(5.dp, 0.dp, 0.dp, 2.dp)
                    )
                    Text(
                        text = resRating,
                        textAlign = TextAlign.Center,
                        fontSize = 12.sp,
                        color = Color.DarkGray,
                        style = MaterialTheme.typography.titleLarge,
                        modifier = Modifier.padding(2.dp, 5.dp, 8.dp, 2.dp)
                    )
                }
            }

        }

        Spacer(modifier = Modifier.padding(4.dp))

        Text(
            text = resName,
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold,
            style = MaterialTheme.typography.titleLarge,
            modifier = Modifier.padding(10.dp, 0.dp)
        )

        Text(
            text = resTopItems,
            fontSize = 12.sp,
            style = MaterialTheme.typography.titleLarge,
            modifier = Modifier.padding(10.dp, 0.dp)
        )

        Row(
            modifier = Modifier.padding(10.dp, 0.dp, 10.dp, 15.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                painter = painterResource(id = R.drawable.locationicon),
                contentDescription = "",
                modifier = Modifier.size(15.dp),
                tint = MaterialTheme.colorScheme.primary
            )

            Text(
                text = resAddress,
                fontSize = 12.sp,
                style = MaterialTheme.typography.titleLarge,
                modifier = Modifier.padding(10.dp, 0.dp)
            )
        }

    }

}