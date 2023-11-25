package com.foodapp.foodexpress.Components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.foodapp.foodexpress.R

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun DishMenuSingle() {

    var isAddedToCart = remember { mutableStateOf(false) }

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(130.dp)
            .padding(15.dp, 8.dp)
            .clip(RoundedCornerShape(20.dp))
            .background(MaterialTheme.colorScheme.secondaryContainer)
    ) {
        Column(
            modifier = Modifier
                .weight(0.3f)
                .fillMaxHeight()
                .padding(15.dp, 15.dp, 0.dp, 15.dp)
                .align(Alignment.CenterVertically)
        ) {
            Image(
                painter = painterResource(id = R.drawable.temp_cat_1),
                contentDescription = "",
                contentScale = ContentScale.Crop,
                modifier = Modifier.clip(RoundedCornerShape(20.dp))
            )
        }
        Column(modifier = Modifier.weight(0.7f)) {

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(15.dp, 10.dp, 15.dp, 0.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "Garlic Pizza",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    style = MaterialTheme.typography.titleLarge,
                )

                Text(
                    text = "179$",
                    textAlign = TextAlign.Center,
                    fontSize = 12.sp,
                    color = MaterialTheme.colorScheme.primary,
                    style = MaterialTheme.typography.titleLarge
                )
            }

            Row(
                modifier = Modifier
                    .padding(15.dp, 0.dp, 15.dp, 0.dp),
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
                    text = "4.8 (1k+ Review)",
                    textAlign = TextAlign.Center,
                    fontSize = 12.sp,
                    color = MaterialTheme.colorScheme.onBackground,
                    style = MaterialTheme.typography.titleLarge,
                    modifier = Modifier.padding(2.dp)
                )
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(15.dp, 0.dp, 15.dp, 15.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {

                Row(modifier = Modifier.clip(RoundedCornerShape(50.dp))
                    .border(
                        0.5.dp, MaterialTheme.colorScheme.outline,
                        RoundedCornerShape(50.dp)
                    ),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.vegicon),
                        contentDescription = "",
                        modifier = Modifier.size(20.dp).padding(5.dp,2.dp,2.dp,2.dp)
                    )
                    Text(
                        text = "Best seller",
                        textAlign = TextAlign.Center,
                        fontSize = 10.sp,
                        color = MaterialTheme.colorScheme.onBackground,
                        style = MaterialTheme.typography.titleLarge,
                        modifier = Modifier.padding(2.dp, 5.dp, 8.dp, 2.dp)
                    )
                }

                CartButton(isAddedToCart.value) {
                    isAddedToCart.value = !isAddedToCart.value
                }
            }
        }
    }
}

