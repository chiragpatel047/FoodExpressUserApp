package com.foodapp.foodexpress.Components

import com.foodapp.foodexpress.R

sealed class NavigationItem(val route: String,val label: String,val icon: Int) {
    object HomeNav : NavigationItem("homeNav", "Home", R.drawable.homeicon)
    object OrderNav : NavigationItem("orderNav", "Orders", R.drawable.ordericon)
    object SaveNav : NavigationItem( "savedNav", "Saved", R.drawable.favicon)
    object CartNav : NavigationItem( "cartNav", "Cart", R.drawable.carticon)
    object ProfileNav : NavigationItem("profileNav", "Profile", R.drawable.usericon)

}
