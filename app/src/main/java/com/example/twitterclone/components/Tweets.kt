package com.example.twitterclone.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.twitterclone.models.TweetData

@Composable
fun Tweets(paddingValues: PaddingValues){
    Box(modifier = Modifier.padding(paddingValues)){
        LazyColumn(modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)){
            items(tweetList){
                tweetData ->
                TweetItem(tweetData = tweetData)
            }
        }
    }
}

@Composable
fun TweetItem(tweetData: TweetData, modifier: Modifier = Modifier){
    Row(modifier = Modifier
        .fillMaxWidth()
        .padding(bottom = 8.dp)) {
        Card(modifier = Modifier
            .padding(end = 8.dp)
            .size(40.dp)
            .clip(CircleShape),
            backgroundColor = Color.LightGray) {
            Text(text = tweetData.name[0].toString(),
                textAlign = TextAlign.Center,
            modifier = Modifier.padding(8.dp)
                )
        }
        Column(modifier.weight(2.0f)) {
            Row {
                Text(text = tweetData.name,
                    fontSize = 18.sp)
                Text(text = tweetData.username,
                    fontWeight = FontWeight.Light,
                    fontSize = 15.sp, modifier = Modifier.padding(start = 6.dp))
                Text(text = tweetData.timestamp)
            }
            Text(text = tweetData.body, fontSize = 15.sp)
            
            Row(modifier = Modifier.padding(top = 6.dp, bottom = 5.dp)) {
                IconButton(onClick = { /*TODO*/ },
                    modifier = Modifier.size(20.dp)) {
                    Icon(imageVector = Icons.Outlined.Equalizer, contentDescription = "views")
                }

                IconButton(onClick = { /*TODO*/ },
                    modifier = Modifier
                        .size(20.dp)
                        .weight(0.5f)) {
                    Icon(imageVector = Icons.Outlined.Pending, contentDescription = "Comments")
                }

                IconButton(onClick = { /*TODO*/ },
                    modifier = Modifier
                        .size(20.dp)
                        .weight(0.4f)) {
                    Icon(imageVector = Icons.Outlined.Repeat, contentDescription = "Retweet")
                }

                IconButton(onClick = { /*TODO*/ },
                    modifier = Modifier
                        .size(20.dp)
                        .weight(0.4f)) {
                    Icon(imageVector = Icons.Outlined.Favorite, contentDescription = "Likes")
                }

                IconButton(onClick = { /*TODO*/ },
                    modifier = Modifier
                        .size(20.dp)
                        .weight(0.4f)) {
                    Icon(imageVector = Icons.Outlined.Share, contentDescription = "Likes")
                }
                
//                Icon(Icons.Outlined.Equalizer, "Views",
//                    modifier = Modifier.size(20.dp))
//                Icon(Icons.Outlined.Pending, "Comments",
//                    modifier = Modifier
//                        .size(20.dp)
//                        .weight(0.5f))
//                Icon(Icons.Outlined.Repeat, "Retweet",
//                    modifier = Modifier
//                        .size(20.dp)
//                        .weight(0.4f))
//                Icon(Icons.Outlined.Favorite, "Likes",
//                    modifier = Modifier
//                        .size(20.dp)
//                        .weight(0.4f))
//                Icon(Icons.Outlined.Share, "Share",
//                    modifier = Modifier
//                        .size(20.dp)
//                        .weight(0.4f))
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TweetsPreview(){
    TweetItem(
        tweetData = TweetData(
            tweetId = 1,
            name = "DevBroski",
            username = "@DevBroski  ",
            timestamp = "· 1h",
            body = "Real Madrid is the ultimate kryptonite of Liverpool",
            views = 1344,
            comments = 23,
            retweets = 89,
            likes = 909
        ))
}
