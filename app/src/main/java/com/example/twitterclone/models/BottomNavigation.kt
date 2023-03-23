package com.example.twitterclone.models

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import androidx.compose.material.icons.rounded.*
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomNavigationMenu (
    val icon:ImageVector,
    val title:String){

    object Home:BottomNavigationMenu(Icons.Outlined.Home, "Home")
    object Search:BottomNavigationMenu(Icons.Outlined.Search, "Search")
    object Spaces: BottomNavigationMenu(Icons.Outlined.WaterDrop, "Spaces")
    object Notifications: BottomNavigationMenu(Icons.Outlined.Notifications, "Notifications")
    object Inbox: BottomNavigationMenu(Icons.Outlined.Mail, "Inbox")
}