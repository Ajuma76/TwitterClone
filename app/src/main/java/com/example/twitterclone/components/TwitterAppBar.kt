package com.example.twitterclone.components

import android.widget.ImageButton
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.ScaffoldState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.outlined.AutoAwesome
import androidx.compose.material.icons.outlined.Star
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.twitterclone.R
import com.example.twitterclone.TwitterClone
import com.example.twitterclone.ui.theme.TwitterCloneTheme
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@Composable
fun TwitterAppBar(scaffoldState: ScaffoldState, scope: CoroutineScope){
    Box(modifier = Modifier.padding(1.dp)){
        Card(modifier = Modifier.requiredHeight(55.dp),
            shape = RectangleShape, elevation = 6.dp) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .padding(8.dp)
                    .fillMaxSize()
            ) {

                IconButton(onClick = {
                    scope.launch {
                        scaffoldState.drawerState.open()

                    }
                }) {
                    Image(painter = painterResource(id = R.drawable.download),
                        contentDescription = "Drawer",
                        modifier = Modifier
                            .size(25.dp)
                            .clip(CircleShape))
                }

                Image(
                    painter = painterResource(id = R.drawable.twitter_icon),
                    contentDescription = "Twitter Icon",
                    modifier = Modifier
                        .size(35.dp)
                        .weight(2.0f)
                )

                Icon(Icons.Outlined.AutoAwesome, "Timeline settings",
                    modifier = Modifier.size(30.dp))
            }
        }
    }
    
}

@Preview
@Composable
fun TwitterAppBarPreview(){
    TwitterCloneTheme{
        TwitterClone()
    }
}