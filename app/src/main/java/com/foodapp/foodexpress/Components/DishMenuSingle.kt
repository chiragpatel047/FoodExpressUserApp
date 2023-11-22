package com.foodapp.foodexpress.Components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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

    Row(modifier = Modifier.fillMaxWidth().padding(10.dp)) {
        Column(modifier = Modifier
            .weight(0.3f)
            .height(100.dp)) {
            Image(
                painter = painterResource(id = R.drawable.temp_cat_1),
                contentDescription = "",
                contentScale = ContentScale.Crop,
                modifier = Modifier.clip(RoundedCornerShape(20.dp))
            )
        }
        Column(modifier = Modifier.weight(0.7f)) {
            Text(
                text = "Garlic Pizza",
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold,
                style = MaterialTheme.typography.titleLarge,
                modifier = Modifier.padding(15.dp, 10.dp, 15.dp, 0.dp)
            )
            Row(
                modifier = Modifier
                    .padding(15.dp, 2.dp, 15.dp, 0.dp),
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
                    modifier = Modifier.padding(2.dp, 5.dp, 8.dp, 2.dp)
                )
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(15.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Image(
                        painter = painterResource(id = R.drawable.vegicon),
                        contentDescription = "",
                        modifier = Modifier.size(15.dp)
                    )
                    Spacer(modifier = Modifier.padding(2.dp))
                    Text(
                        text = "Best seller",
                        textAlign = TextAlign.Center,
                        fontSize = 12.sp,
                        color = MaterialTheme.colorScheme.onBackground,
                        style = MaterialTheme.typography.titleLarge,
                        modifier = Modifier.padding(2.dp, 5.dp, 8.dp, 2.dp)
                    )
                }

                Text(
                    text = "179$",
                    textAlign = TextAlign.Center,
                    fontSize = 12.sp,
                    color = MaterialTheme.colorScheme.onBackground,
                    style = MaterialTheme.typography.titleLarge,
                    modifier = Modifier.padding(2.dp, 5.dp, 8.dp, 2.dp)
                )
            }

        }
    }

}