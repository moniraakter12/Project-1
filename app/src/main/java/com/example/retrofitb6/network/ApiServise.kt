package com.example.retrofitb6.network

import com.example.retrofitb6.Model.Product
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET("products")
    suspend fun getProducts(): Response<List<Product>>
}