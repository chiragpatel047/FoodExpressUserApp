package com.foodapp.foodexpress.Components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
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
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CategorySingle(backImage: Int, catName: String) {

    Box(
        modifier = Modifier
            .height(60.dp)
            .width(110.dp)
            .padding(5.dp, 0.dp, 10.dp, 5.dp)
            .shadow(5.dp, RoundedCornerShape(50.dp))
            .clip(RoundedCornerShape(50.dp)),
        contentAlignment = Alignment.Center
    ) {

        Image(
            painter = painterResource(id = backImage),
            contentDescription = "",
            contentScale = ContentScale.Crop
        )

        Box(
            modifier = Modifier
                .background(Color(0x99000000))
                .fillMaxSize()
        ) {

        }

        Text(
            text = catName,
            modifier = Modifier.wrapContentHeight(align = Alignment.CenterVertically),
            textAlign = TextAlign.Center,
            fontSize = 14.sp,
            color = Color.White,
            style = MaterialTheme.typography.titleLarge
        )

    }

}