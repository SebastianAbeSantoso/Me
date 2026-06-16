package com.example.myapplication.models

data class ApiResponse<T>(
    val message: String,
    val code: String,
    val data: T
)