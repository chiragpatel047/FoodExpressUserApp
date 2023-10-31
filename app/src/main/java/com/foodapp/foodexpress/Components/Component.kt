package com.foodapp.foodexpress.Components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.FilledIconButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonColors
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.foodapp.foodexpress.R

@Composable
fun OrangeRoundedButton(label: String, onClick: () -> Unit) {
    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(MaterialTheme.colorScheme.primary),
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp, 10.dp, 20.dp, 5.dp)
    ) {
        Text(
            text = label,
            fontSize = 16.sp,
            style = MaterialTheme.typography.titleLarge,
            modifier = Modifier
                .padding(5.dp)
        )
    }
}

@Composable
fun TransparentOrangeTextRoundedButton(label: String, onClick: () -> Unit) {
    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(Color.Transparent),
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp, 10.dp, 20.dp, 5.dp)
    ) {
        Text(
            text = label,
            fontSize = 16.sp,
            color = MaterialTheme.colorScheme.primary,
            style = MaterialTheme.typography.titleLarge,
            modifier = Modifier
                .padding(5.dp)
        )
    }
}

@Composable
fun HeadingText(text: String) {
    Text(
        text = text,
        textAlign = TextAlign.Center,
        fontSize = 22.sp,
        style = MaterialTheme.typography.titleLarge,
        modifier = Modifier
            .fillMaxWidth()
            .padding(30.dp, 10.dp, 30.dp, 10.dp)
    )
}

@Composable
fun ContentText(text: String) {
    Text(
        text = text,
        textAlign = TextAlign.Center,
        fontSize = 16.sp,
        style = MaterialTheme.typography.titleLarge,
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp, 5.dp)
    )
}

@Composable
fun Content2Text(text: String, textAlign: TextAlign) {
    Text(
        text = text,
        textAlign = textAlign,
        fontSize = 14.sp,
        style = MaterialTheme.typography.titleLarge,
        modifier = Modifier
            .padding(20.dp, 5.dp)
    )
}


@Composable
fun OutlinedCustomButton(imageIcon: Int, alpha: Float, onClick: () -> Unit) {
    OutlinedButton(
        onClick = onClick,
        modifier = Modifier
            .size(50.dp)
            .alpha(alpha = alpha),  //avoid the oval shape
        shape = CircleShape,
        border = BorderStroke(1.dp, MaterialTheme.colorScheme.primary),
        contentPadding = PaddingValues(15.dp),  //avoid the little icon
        colors = ButtonDefaults.outlinedButtonColors(contentColor = MaterialTheme.colorScheme.primary)
    ) {
        Icon(
            painterResource(id = imageIcon),
            contentDescription = "",
            tint = MaterialTheme.colorScheme.primary
        )
    }
}

@Composable
fun OutlinedCustomImageButton(imageIcon: Int, onClick: () -> Unit) {
    OutlinedButton(
        onClick = onClick,
        modifier = Modifier.size(50.dp),  //avoid the oval shape
        shape = CircleShape,
        border = BorderStroke(1.dp, Color.LightGray),
        contentPadding = PaddingValues(15.dp),
        colors = ButtonDefaults.outlinedButtonColors(containerColor = Color.White)

    ) {
        Icon(
            painterResource(id = imageIcon),
            contentDescription = "",
            tint = Color.Unspecified
        )
    }
}

@Composable
fun OutlinedSimpleImageButton(imageIcon: Int, onClick: () -> Unit) {
    OutlinedButton(
        onClick = onClick,
        modifier = Modifier.size(40.dp),  //avoid the oval shape
        shape = CircleShape,
        border = BorderStroke(1.dp, Color.LightGray),
        contentPadding = PaddingValues(12.dp)

    ) {
        Icon(
            painterResource(id = imageIcon),
            contentDescription = "",
            tint = Color.LightGray
        )
    }
}


@Composable
fun FilledCustomButton(imageIcon: Int, onClick: () -> Unit) {
    IconButton(
        onClick = onClick,
        modifier = Modifier
            .size(50.dp)
            .clip(RoundedCornerShape(50.dp)),  //avoid the oval shape
        colors = IconButtonDefaults.iconButtonColors(
            containerColor = MaterialTheme.colorScheme.primary
        )
    ) {
        Icon(
            painterResource(id = imageIcon),
            contentDescription = "",
            tint = Color.White,
            modifier = Modifier
                .size(50.dp)
                .padding(15.dp)
                .rotate(180F)
        )
    }
}

@Composable
fun subjectImage(image: Int) {
    Image(
        painter = painterResource(id = image),
        contentDescription = "",
        modifier = Modifier.padding(40.dp, 40.dp, 40.dp, 0.dp)
    )
}

@Composable
fun textBetweenTwoLines(text: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(25.dp, 10.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Spacer(
            modifier = Modifier
                .height(1.dp)
                .weight(1f)
                .background(Color.LightGray)
        )
        Text(
            text = text,
            textAlign = TextAlign.Center,
            fontSize = 12.sp,
            style = MaterialTheme.typography.titleLarge,
            modifier = Modifier
                .padding(20.dp, 5.dp)
        )
        Spacer(
            modifier = Modifier
                .height(1.dp)
                .weight(1f)
                .background(Color.LightGray)
        )
    }
}

@Composable
fun otpSingleBox(text : String) {
    Text(text = text, Modifier.border(1.dp, Color.LightGray, RoundedCornerShape(50.dp)).size(50.dp))
}