package com.example.twitterclone.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.CircleNotifications
import androidx.compose.material.icons.outlined.LightMode
import androidx.compose.material.icons.outlined.Snowmobile
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.twitterclone.R
import com.example.twitterclone.models.TwitterDrawerMenuIcons

@Composable
fun TwitterDrawerMenu(){

    val menuList = listOf(
        TwitterDrawerMenuIcons.Divider,
        TwitterDrawerMenuIcons.Profile,
        TwitterDrawerMenuIcons.Topics,
        TwitterDrawerMenuIcons.Bookmarks,
        TwitterDrawerMenuIcons.Lists,
        TwitterDrawerMenuIcons.TwitterCircle,
        TwitterDrawerMenuIcons.Divider,
        TwitterDrawerMenuIcons.HeaderOne,
        TwitterDrawerMenuIcons.HeaderTwo,

    )
    Column() {
        Row() {
            Image(
                painter = painterResource(id = R.drawable.download),
                contentDescription = "Profile Pic",
                modifier = Modifier
                    .clip(CircleShape)
                    .size(55.dp).padding(start = 20.dp, top=10.dp)
            )
            Icon(
                Icons.Outlined.CircleNotifications, "Account Switch",
                modifier = Modifier
                    .clip(CircleShape)
                    .size(30.dp)
                    .weight(1.5f)
            )
        }
        Text(
            text = "#DevBroski",
            fontWeight = FontWeight.Bold,
            fontSize = 15.sp, modifier = Modifier.padding(start = 20.dp, top = 20.dp)
        )
        Text(text = "@__allanjuma", fontSize = 12.sp, modifier = Modifier.padding(start = 20.dp))

        Row(modifier = Modifier.padding(bottom = 20.dp, top = 15.dp)) {
            Text(
                text = "390 Following", fontSize = 14.sp,
                modifier = Modifier.padding(start = 20.dp, end = 8.dp)
            )
            Text(
                text = "319 Followers", fontSize = 14.sp,
                modifier = Modifier.padding(start = 8.dp))

        }
        menuList.forEach {
                item->

            when{
                item.isDivider->{
                    Divider(modifier = Modifier.padding(top = 10.dp, bottom = 24.dp))
                }
                item.isHeader->{
                    Text(text = item.title!!, fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(top = 10.dp, start = 20.dp, end = 20.dp, bottom = 12.dp))
                }else ->{
                TwitterCloneItemIcon(item = item)
            }

            }
        }

        Icon(Icons.Outlined.LightMode, "Light Mode",
            modifier = Modifier.size(55.dp).padding(top = 30.dp))
    }
}

@Composable
fun TwitterCloneItemIcon(item: TwitterDrawerMenuIcons){
    Row(modifier = Modifier
        .fillMaxWidth()
        .size(60.dp)
        .padding(5.dp)) {
        Image(imageVector = item.icon!!,
            contentDescription = item.title!!,
            Modifier.weight(0.5f))

        Text(text = item.title,
            Modifier.weight(2.0f))
    }
}