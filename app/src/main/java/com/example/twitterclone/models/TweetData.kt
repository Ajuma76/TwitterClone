package com.example.twitterclone.models

import java.sql.Timestamp

data class TweetData (
    val tweetId:Int,
    val name:String,
    val username:String,
    val timestamp:String,
    val body:String,
    val views:Int,
    val comments:Int,
    val retweets:Int,
    val likes:Int,
        ){
}