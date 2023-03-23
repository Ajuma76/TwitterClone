package com.example.twitterclone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.twitterclone.components.Tweets
import com.example.twitterclone.components.TwitterAppBar
import com.example.twitterclone.components.TwitterBottomNavigation
import com.example.twitterclone.components.TwitterDrawerMenu
import com.example.twitterclone.ui.theme.TwitterCloneTheme
import kotlinx.coroutines.CoroutineScope

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TwitterCloneTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    TwitterClone()
                }
            }
        }
    }
}

@Composable
fun TwitterClone() {

    val scaffoldState = rememberScaffoldState()
    val coroutineScope = rememberCoroutineScope()



    Scaffold(scaffoldState = scaffoldState,
        topBar = {TwitterAppBar(scaffoldState, coroutineScope)},
        drawerContent = {
            TwitterDrawerMenu()
        },
        bottomBar = {TwitterBottomNavigation()}
    ) {
        Tweets(it)
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TwitterCloneTheme {
        TwitterClone()
    }
}