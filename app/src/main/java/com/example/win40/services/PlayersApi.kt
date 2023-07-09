package com.example.win40.services

import com.example.win40.model.TopPlayerCs
import com.example.win40.model.TopPlayersModel
import retrofit2.Call
import retrofit2.http.GET

interface PlayersApi {
    @GET("topPlayers.json")
    fun getPlayers():Call<TopPlayersModel>
    @GET("topPlayersCs.json")
    fun getPlayersCs():Call<TopPlayerCs>
}