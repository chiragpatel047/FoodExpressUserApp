package com.foodapp.foodexpress.Components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.foodapp.foodexpress.R

@Composable
fun OnBoard(image : Int,heading : String,content : String) {
    Column {
        Image(painter = painterResource(id = image),
            contentDescription = "",
            modifier = Modifier.padding(30.dp))
        HeadingText(text = heading)
        ContentText(text = content)

    }
}