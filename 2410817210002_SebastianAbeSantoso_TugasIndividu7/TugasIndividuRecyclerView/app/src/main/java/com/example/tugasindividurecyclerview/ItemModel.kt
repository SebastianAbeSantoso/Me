package com.example.tugasindividurecyclerview

data class ItemModel(
    val number: Int,
    val title: String,
    val description: String,
    val image: Int,
    var isSwitchOn: Boolean = false
)