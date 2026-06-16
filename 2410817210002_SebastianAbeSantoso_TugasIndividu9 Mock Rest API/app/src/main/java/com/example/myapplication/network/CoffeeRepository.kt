package com.example.myapplication.network

import com.example.myapplication.models.ApiResponse
import com.example.myapplication.models.Coffee
import com.squareup.moshi.Moshi
import com.squareup.moshi.Types
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import io.ktor.client.HttpClient
import io.ktor.client.engine.okhttp.OkHttp
import io.ktor.client.request.get
import io.ktor.client.statement.bodyAsText

class CoffeeRepository {

    private val client = HttpClient(OkHttp)

    private val moshi = Moshi.Builder()
        .add(KotlinJsonAdapterFactory())
        .build()

    private val coffeeApiUrl = "https://my-mbg-gw.free.beeceptor.com/coffee"

    suspend fun getCoffeeMenu(): ApiResponse<List<Coffee>> {
        val json = client.get(coffeeApiUrl).bodyAsText()

        val listType = Types.newParameterizedType(
            List::class.java,
            Coffee::class.java
        )

        val responseType = Types.newParameterizedType(
            ApiResponse::class.java,
            listType
        )

        val adapter = moshi.adapter<ApiResponse<List<Coffee>>>(responseType)

        return adapter.fromJson(json)
            ?: throw Exception("Failed to parse coffee data")
    }

    fun close() {
        client.close()
    }
}