package com.odinn.excahngerates.data.repository

import android.util.Log
import com.odinn.excahngerates.data.api.RetrofitInstance
import com.odinn.excahngerates.model.Curr
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.awaitResponse


class Repository {
    suspend fun getCurr(): Curr? {
        var curr: Curr? = null
        val response = RetrofitInstance.api.getCurrency().awaitResponse()
        if (response.isSuccessful){
            val data = response.body()!!
            Log.d("Repository", data.toString())
            curr = data

        }
        return curr
    }
}