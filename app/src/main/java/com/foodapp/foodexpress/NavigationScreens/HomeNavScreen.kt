package com.foodapp.foodexpress.NavigationScreens

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.rememberTextMeasurer
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.foodapp.foodexpress.Components.CategorySingle
import com.foodapp.foodexpress.Components.GrayFilledSimpleButton
import com.foodapp.foodexpress.Components.HeadingText
import com.foodapp.foodexpress.Components.OnBoard
import com.foodapp.foodexpress.Components.SpecialForYouSingle
import com.foodapp.foodexpress.Components.boldText
import com.foodapp.foodexpress.Components.normalText
import com.foodapp.foodexpress.Components.textWithSeeAllText
import com.foodapp.foodexpress.Models.CatModel
import com.foodapp.foodexpress.R

@OptIn(ExperimentalMaterial3Api::class, ExperimentalFoundationApi::class)
@Composable
fun HomeNavScreen() {

    var catList: ArrayList<CatModel> = ArrayList()

    catList.add(CatModel("Pizza", R.drawable.temp_cat_1))
    catList.add(CatModel("Burger", R.drawable.temp_cat_2))
    catList.add(CatModel("Noodle", R.drawable.temp_cat_3))
    catList.add(CatModel("Momos", R.drawable.temp_cat_4))
    catList.add(CatModel("Frankie", R.drawable.temp_cat_5))

    Column(modifier = Modifier.fillMaxSize()) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {

            Column {
                normalText(text = "Location", textAlign = TextAlign.Center, fontSize = 12.sp)

                Row(verticalAlignment = Alignment.CenterVertically) {

                    Icon(
                        painter = painterResource(id = R.drawable.locationicon),
                        contentDescription = "",
                        modifier = Modifier.size(15.dp),
                        tint = MaterialTheme.colorScheme.onBackground
                    )
                    Spacer(modifier = Modifier.padding(2.dp))
                    boldText(
                        text = "Surat City, India",
                        textAlign = TextAlign.Center,
                        fontSize = 14.sp
                    )
                    Spacer(modifier = Modifier.padding(2.dp))
                    Icon(
                        painter = painterResource(id = R.drawable.downarrow),
                        contentDescription = "",
                        modifier = Modifier.size(12.dp),
                        tint = MaterialTheme.colorScheme.onBackground
                    )
                }
            }
            GrayFilledSimpleButton(imageIcon = R.drawable.bellicon) {

            }
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp, 0.dp, 20.dp, 5.dp)
                .border(
                    width = 1.dp,
                    color = MaterialTheme.colorScheme.outlineVariant,
                    shape = RoundedCornerShape(50.dp)
                ),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Spacer(modifier = Modifier.padding(4.dp))
            Icon(
                painter = painterResource(id = R.drawable.searchicon),
                contentDescription = "",
                modifier = Modifier
                    .size(40.dp)
                    .padding(10.dp, 10.dp, 0.dp, 10.dp),
                tint = MaterialTheme.colorScheme.primary
            )

            var text by remember { mutableStateOf("") }

            TextField(
                value = text,
                onValueChange = { text = it },
                colors = TextFieldDefaults.textFieldColors(
                    containerColor = Color.Transparent,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent
                ),
                placeholder = {
                    Text(
                        text = "Search by Restaurants and Dishes...",
                        style = MaterialTheme.typography.titleLarge,
                        fontSize = 14.sp
                    )
                },

                modifier = Modifier
                    .background(Color.Transparent)
                    .weight(1f)
                    .height(50.dp)
            )

        }

        Text(
            text = "#SpecialForYou",
            textAlign = TextAlign.Start,
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            style = MaterialTheme.typography.titleLarge,
            modifier = Modifier.padding(20.dp, 20.dp, 20.dp, 5.dp)
        )

        val pagerState = rememberPagerState(
            initialPage = 0,
            initialPageOffsetFraction = 0f
        ) {
            3
        }


        HorizontalPager(state = pagerState) {
            when (it) {
                0 -> {
                    SpecialForYouSingle(R.drawable.temp_food_banner_1, "40", "1")

                }

                1 -> {
                    SpecialForYouSingle(R.drawable.temp_food_banner_2, "20", "2")

                }

                2 -> {
                    SpecialForYouSingle(R.drawable.temp_food_banner_3, "65", "3")

                }
            }
        }

        textWithSeeAllText("Categories")

        LazyRow() {
            items(items = catList) {
                CategorySingle(backImage = it.catImage, catName = it.catName)
            }
        }

        textWithSeeAllText("Popular Dishes")



    }
}