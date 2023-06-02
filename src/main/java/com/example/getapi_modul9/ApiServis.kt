package com.example.getapi_modul9

import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("datamahasiswa/")
    fun getdatamahasiswa(): Call<ApiResponse>
}