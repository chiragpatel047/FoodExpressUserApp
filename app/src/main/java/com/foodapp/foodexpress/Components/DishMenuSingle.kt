package com.foodapp.foodexpress.Components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.foodapp.foodexpress.R

@Composable
fun DishMenuSingle() {

    Row() {
        Column() {
            Image(
                painter = painterResource(id = R.drawable.temp_cat_1),
                contentDescription = "",
                contentScale = ContentScale.Crop
            )

        }
        Column() {
            Row {

            }
        }
    }

}