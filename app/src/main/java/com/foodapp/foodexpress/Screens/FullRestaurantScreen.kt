package com.foodapp.foodexpress.Screens

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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.foodapp.foodexpress.Components.FilledWhiteCustomButton
import com.foodapp.foodexpress.Components.GrayFilledSimpleButton
import com.foodapp.foodexpress.Components.textWithSeeAllText
import com.foodapp.foodexpress.NavigationScreens.MenuSubScreen
import com.foodapp.foodexpress.NavigationScreens.ReviewSubScreen
import com.foodapp.foodexpress.R

@Composable
fun FullRestaurantScreen(navController: NavController) {
    Column {
        Box(modifier = Modifier.fillMaxWidth()) {

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.temp_res_1),
                    contentDescription = "",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxSize()
                )

                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color(0x66000000))
                ) {

                }

            }
            Column(modifier = Modifier.fillMaxWidth()) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(20.dp, 40.dp, 20.dp, 10.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    GrayFilledSimpleButton(R.drawable.arrowicon) {

                    }

                    Row {

                        GrayFilledSimpleButton(R.drawable.shareicon) {

                        }

                        Spacer(modifier = Modifier.padding(4.dp))
                        GrayFilledSimpleButton(R.drawable.outlinedfavicon) {

                        }

                    }
                }

                Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.TopCenter) {

                    Column(
                        Modifier
                            .fillMaxWidth()
                            .padding(20.dp, 25.dp, 20.dp, 20.dp)
                            .shadow(5.dp, RoundedCornerShape(20.dp))
                            .clip(RoundedCornerShape(20.dp))
                            .background(MaterialTheme.colorScheme.surfaceVariant)
                    ) {
                        Text(
                            text = "Green Jalapenzo",
                            style = MaterialTheme.typography.titleLarge,
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(15.dp, 25.dp, 15.dp, 0.dp)
                        )

                        Text(
                            text = "Chicken Burger, Pizza, Tanduri, Rayta...",
                            fontSize = 12.sp,
                            style = MaterialTheme.typography.titleLarge,
                            modifier = Modifier.padding(15.dp, 0.dp)
                        )

                        Spacer(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(10.5.dp)
                                .padding(15.dp, 5.dp)
                                .background(MaterialTheme.colorScheme.outline)
                        )

                        Spacer(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(5.dp)
                        )

                        Row(
                            modifier = Modifier.padding(15.dp, 0.dp, 10.dp, 0.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Icon(
                                painter = painterResource(id = R.drawable.locationicon),
                                contentDescription = "",
                                modifier = Modifier.size(15.dp),
                                tint = MaterialTheme.colorScheme.primary
                            )

                            Text(
                                text = "251 Ring Road Athwalines, Surat 395004",
                                fontSize = 12.sp,
                                style = MaterialTheme.typography.titleLarge,
                                modifier = Modifier.padding(10.dp, 2.dp, 10.dp, 0.dp)
                            )
                        }

                        Row(
                            modifier = Modifier.padding(15.dp, 0.dp, 10.dp, 15.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Icon(
                                painter = painterResource(id = R.drawable.timeicon),
                                contentDescription = "",
                                modifier = Modifier.size(15.dp),
                                tint = MaterialTheme.colorScheme.primary
                            )

                            Text(
                                text = "15 Min | 1.5KM | Free Delivery",
                                fontSize = 12.sp,
                                style = MaterialTheme.typography.titleLarge,
                                modifier = Modifier.padding(10.dp, 2.dp, 10.dp, 0.dp)
                            )
                        }
                    }

                    Row(
                        modifier = Modifier
                            .padding(10.dp)
                            .clip(RoundedCornerShape(50.dp))
                            .background(MaterialTheme.colorScheme.primary),
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
                            color = MaterialTheme.colorScheme.onPrimary,
                            style = MaterialTheme.typography.titleLarge,
                            modifier = Modifier.padding(2.dp, 5.dp, 8.dp, 2.dp)
                        )
                    }


                }

            }


        }

        val titles = listOf("Menu", "Reviews")
        var tabIndex by remember { mutableStateOf(0) }

        TabRow(selectedTabIndex = tabIndex, modifier = Modifier.padding(20.dp, 0.dp)) {
            titles.forEachIndexed { index, title ->
                Tab(
                    text = { Text(title, style = MaterialTheme.typography.titleLarge) },
                    selected = tabIndex == index,
                    onClick = { tabIndex = index }
                )
            }
        }

        when (tabIndex) {
            0 -> {
                MenuSubScreen()
            }

            1 -> {
                ReviewSubScreen()
            }
        }

    }
}