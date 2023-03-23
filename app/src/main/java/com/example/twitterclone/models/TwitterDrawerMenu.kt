package com.example.twitterclone.models

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import androidx.compose.ui.graphics.vector.ImageVector

sealed class TwitterDrawerMenuIcons (
    val icon:ImageVector? = null,
    val title:String? = null,
    val isDivider:Boolean = false,
    val isHeader: Boolean = false
){

    object Profile:TwitterDrawerMenuIcons(
        icon = Icons.Outlined.Person,
        title = "Profile"
    )

    object Topics:TwitterDrawerMenuIcons (
        icon = Icons.Outlined.PhoneInTalk,
        title = "Topics"
    )

    object Bookmarks:TwitterDrawerMenuIcons (
        icon = Icons.Outlined.Bookmarks,
        title = "Bookmarks"
    )

    object Lists:TwitterDrawerMenuIcons (
        icon = Icons.Outlined.List,
        title = "Lists"
    )

    object TwitterCircle:TwitterDrawerMenuIcons (
        icon = Icons.Outlined.PersonSearch,
        title = "Twitter Circle"
    )

    object Divider:TwitterDrawerMenuIcons (
        isDivider = true
    )

    object HeaderOne:TwitterDrawerMenuIcons (
        isHeader = true,
        title = "Professional Tools"
    )

    object HeaderTwo:TwitterDrawerMenuIcons (
        isHeader = true,
        title = "Settings & Support"
    )
}