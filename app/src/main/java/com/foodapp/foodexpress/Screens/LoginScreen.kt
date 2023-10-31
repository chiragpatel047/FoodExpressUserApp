package com.foodapp.foodexpress.Screens

import android.util.Size
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.Icon
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
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.foodapp.foodexpress.Components.Content2Text
import com.foodapp.foodexpress.Components.HeadingText
import com.foodapp.foodexpress.Components.OrangeRoundedButton
import com.foodapp.foodexpress.Components.OutlinedCustomImageButton
import com.foodapp.foodexpress.Components.subjectImage
import com.foodapp.foodexpress.Components.textBetweenTwoLines
import com.foodapp.foodexpress.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen(navController: NavController) {
    Box(modifier = Modifier.fillMaxSize()) {
        Column {
            subjectImage(image = R.drawable.loginimage)
            HeadingText(text = "Your Seamless Food Delivery App")

            textBetweenTwoLines(text = "Log in or Sign Up")

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp, 20.dp, 20.dp, 5.dp)
                    .border(1.dp, Color.LightGray, RoundedCornerShape(50.dp)),
                verticalAlignment = Alignment.CenterVertically
            ) {


                var expanded by remember { mutableStateOf(false) }

                val list = listOf(
                    "+91",
                    "+1",
                    "+44",
                    "+33",
                    "+49",
                    "+81",
                    "+86",
                    "+7",
                    "+61",
                    "+55",
                    "+52",
                    "+34",
                    "+39",
                    "+90",
                    "+65",
                    "+82",
                    "+63",
                    "+64",
                    "+41",
                    "+31",
                    "+46",
                    "+52",
                    "+62",
                    "+55",
                    "+60",
                    "+66",
                    "+44",
                    "+353",
                    "+27",
                    "+972",
                    "+971",
                    "+966",
                    "+501",
                    "+507",
                    "+52",
                    "+1",
                    "+53"
                )
                var selected by remember { mutableStateOf(list[0]) }

                Text(text = selected,
                    modifier = Modifier
                        .clickable {
                            expanded = !expanded
                        }
                        .padding(15.dp, 0.dp, 0.dp, 0.dp),
                    style = MaterialTheme.typography.titleLarge)

                Icon(
                    painter = painterResource(id = R.drawable.downarrow),
                    contentDescription = "",
                    modifier = Modifier
                        .size(15.dp)
                        .padding(5.dp, 0.dp, 0.dp, 0.dp),
                    tint = MaterialTheme.colorScheme.primary
                )

                DropdownMenu(expanded = expanded,
                    onDismissRequest = { expanded = false }) {
                    list.forEach {
                        DropdownMenuItem(text = { Text(text = it) }, onClick = {
                            selected = it.toString()
                            expanded = false
                        })
                    }
                }

                Spacer(
                    modifier = Modifier
                        .padding(8.dp)
                )

                Spacer(
                    modifier = Modifier
                        .width(1.dp)
                        .background(Color.LightGray)
                        .padding(10.dp)
                )

                var text by remember { mutableStateOf("") }

                TextField(
                    value = text,
                    onValueChange = {text = it},
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                    colors = TextFieldDefaults.textFieldColors(
                        containerColor = Color.Transparent,
                        focusedIndicatorColor = Color.Transparent,
                        unfocusedIndicatorColor = Color.Transparent
                    ),
                    placeholder = {
                        Text(
                            text = "Enter Phone Number",
                            style = MaterialTheme.typography.titleLarge
                        )
                    },

                    modifier = Modifier
                        .background(Color.Transparent)
                        .weight(1f)

                )
            }
            OrangeRoundedButton(label = "Continue") {
                navController.navigate("otp")
            }

            Spacer(modifier = Modifier.padding(10.dp))

            textBetweenTwoLines(text = "Or")

            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                OutlinedCustomImageButton(imageIcon = R.drawable.apple) {

                }

                Spacer(modifier = Modifier.padding(10.dp))

                OutlinedCustomImageButton(imageIcon = R.drawable.googlelogo) {

                }

                Spacer(modifier = Modifier.padding(10.dp))

                OutlinedCustomImageButton(imageIcon = R.drawable.facebook) {

                }
            }

        }
    }
}