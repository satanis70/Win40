package com.example.win40.model

import androidx.annotation.Keep

@Keep
data class TopPlayer(
    val img: String,
    val name: String,
    val region: String
)