package com.example.twitterclone.components

import androidx.compose.foundation.layout.size
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.twitterclone.models.BottomNavigationMenu

@Composable
fun TwitterBottomNavigation(){
    val item = listOf(
        BottomNavigationMenu.Home,
        BottomNavigationMenu.Search,
        BottomNavigationMenu.Spaces,
        BottomNavigationMenu.Notifications,
        BottomNavigationMenu.Inbox
    )

    BottomNavigation(backgroundColor = Color.White,
        contentColor = Color.Black) {
        item.forEach {
            BottomNavigationItem(
                alwaysShowLabel = false,
                selected = false,
                onClick = { /*TODO*/ },
                icon = { Icon(imageVector = it.icon, contentDescription = it.title,
                    modifier = Modifier.size(27.dp))})
        }
    }
}