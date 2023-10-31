package com.foodapp.foodexpress.Screens

import android.view.MenuItem.OnActionExpandListener
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.FilledIconButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedIconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.foodapp.foodexpress.Components.Content2Text
import com.foodapp.foodexpress.Components.ContentText
import com.foodapp.foodexpress.Components.FilledCustomButton
import com.foodapp.foodexpress.Components.OnBoard
import com.foodapp.foodexpress.Components.OutlinedCustomButton
import com.foodapp.foodexpress.R
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun OnBoardingScreen(navController: NavController) {
    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.SpaceBetween) {
        val pagerState = rememberPagerState(
            initialPage = 0,
            initialPageOffsetFraction = 0f
        ) {
            3
        }
        Column {

            Spacer(modifier = Modifier.padding(2.dp))
            Text(
                text = "Skip",
                textAlign = TextAlign.End,
                fontSize = 14.sp,
                style = MaterialTheme.typography.titleLarge,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp, 5.dp)
                    .clickable {
                        navController.navigate("login")
                    }
            )
            Spacer(modifier = Modifier.padding(16.dp))

            HorizontalPager(state = pagerState) {
                when (it) {
                    0 -> {
                        OnBoard(
                            image = R.drawable.findfood,
                            heading = "Find Food You Love",
                            content = "Discover the flavors that delight your taste buds with our intuitive food discovery platform."
                        )
                    }

                    1 -> {
                        OnBoard(
                            image = R.drawable.fastdelivery,
                            heading = "Get Fastest Delivery",
                            content = "Experience lightning-fast delivery with our express service, ensuring your packages arrive swiftly and securely."
                        )
                    }

                    2 -> {
                        OnBoard(
                            image = R.drawable.livetrack,
                            heading = "Live Track Your Delivery",
                            content = "Providing real-time updates on your package's journey, ensuring you're always in control of its arrival."
                        )
                    }
                }
            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(30.dp, 0.dp, 30.dp, 50.dp),
            Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {

            val pageText = pagerState.currentPage + 1
            val coroutineScope = rememberCoroutineScope()

            if (!pageText.equals(1)) {
                OutlinedCustomButton(imageIcon = R.drawable.arrowicon, alpha = 1F) {
                    coroutineScope.launch {
                        pagerState.scrollToPage(pagerState.currentPage - 1)
                    }
                }

            } else {
                OutlinedCustomButton(imageIcon = R.drawable.arrowicon, alpha = 0F) {

                }
            }

            Content2Text(text = pageText.toString() + " / 3", textAlign = TextAlign.Center)

            FilledCustomButton(imageIcon = R.drawable.arrowicon) {
                if (pagerState.currentPage.equals(2)) {
                    navController.navigate("login")
                } else {
                    coroutineScope.launch {
                        pagerState.scrollToPage(pagerState.currentPage + 1)
                    }
                }
            }
        }
    }
}