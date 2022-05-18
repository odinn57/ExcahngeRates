package com.odinn.excahngerates.data.api

import com.odinn.excahngerates.model.Curr
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("/daily_json.js")   //EndPoint
    fun getCurrency(): Call<Curr>
}