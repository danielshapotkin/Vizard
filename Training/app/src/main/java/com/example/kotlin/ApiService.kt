package com.example.kotlin

import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET
    fun getToken(): retrofit2.Response<Unit>
}