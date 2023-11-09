package com.foodapp.foodexpress.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
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
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.foodapp.foodexpress.Components.Content2Text
import com.foodapp.foodexpress.Components.ContentText
import com.foodapp.foodexpress.Components.OrangeRoundedButton
import com.foodapp.foodexpress.Components.OutlinedCustomImageButton
import com.foodapp.foodexpress.Components.OutlinedSimpleImageButton
import com.foodapp.foodexpress.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun OtpScreen(navController: NavController) {
    Box(modifier = Modifier.fillMaxSize()) {

        Column {
            Column(
                modifier = Modifier
                    .padding(0.dp, 0.dp, 0.dp, 30.dp)
                    .background(MaterialTheme.colorScheme.secondaryContainer)
            ) {
                Spacer(modifier = Modifier.padding(10.dp))
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(20.dp)
                ) {
                    OutlinedSimpleImageButton(imageIcon = R.drawable.arrowicon) {

                    }
                    Text(
                        text = "OTP",
                        textAlign = TextAlign.Center,
                        fontSize = 16.sp,
                        style = MaterialTheme.typography.titleLarge,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(8.dp)
                    )
                }
                Text(
                    text = "OTP Verification",
                    textAlign = TextAlign.Start,
                    fontSize = 18.sp,
                    style = MaterialTheme.typography.titleLarge,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(20.dp, 5.dp)
                )

                Text(
                    text = "Code has been sent to : ",
                    textAlign = TextAlign.Start,
                    fontSize = 14.sp,
                    style = MaterialTheme.typography.titleLarge,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(20.dp, 10.dp, 20.dp, 2.dp)
                )
                Text(
                    text = "+91 9510334101",
                    textAlign = TextAlign.Start,
                    fontSize = 14.sp,
                    style = MaterialTheme.typography.titleLarge,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(20.dp, 0.dp, 20.dp, 30.dp)
                )
            }

            Row(
                modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                var otpText by remember { mutableStateOf("") }
                val maxChar = 6
                BasicTextField(
                    value = otpText,
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.NumberPassword),
                    modifier = Modifier.fillMaxWidth(),
                    onValueChange = { if (it.length <= maxChar) otpText = it },
                    decorationBox = {
                        Row(
                            horizontalArrangement = Arrangement.Center,
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            repeat(6) { index ->
                                val char = when {
                                    index >= otpText.length -> ""
                                    else -> otpText[index].toString()
                                }
                                Text(
                                    text = char,
                                    modifier = Modifier
                                        .width(40.dp)
                                        .border(
                                            1.dp, Color.LightGray,
                                            RoundedCornerShape(40.dp)
                                        )
                                        .padding(8.dp),
                                    style = MaterialTheme.typography.titleLarge,
                                    textAlign = TextAlign.Center
                                )
                                Spacer(modifier = Modifier.padding(5.dp))
                            }

                        }
                    })

            }

            Spacer(modifier = Modifier.padding(16.dp))

            Text(
                text = "Didn't receive OTP?",
                textAlign = TextAlign.Center,
                fontSize = 14.sp,
                style = MaterialTheme.typography.titleLarge,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp, 10.dp, 20.dp, 2.dp)
            )
            Text(
                text = "Resend code",
                textAlign = TextAlign.Center,
                fontSize = 14.sp,
                color = MaterialTheme.colorScheme.primary,
                style = MaterialTheme.typography.titleLarge,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp, 2.dp, 20.dp, 2.dp)
                    .clickable {

                    }
            )
            Spacer(modifier = Modifier.padding(20.dp))
            OrangeRoundedButton(label = "Verify OTP") {
                navController.navigate("enableLocation")
            }
        }
    }
}