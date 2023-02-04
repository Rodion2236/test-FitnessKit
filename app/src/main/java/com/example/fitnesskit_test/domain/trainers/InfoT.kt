package com.example.fitnesskit_test.domain.trainers

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class InfoT(
    @SerializedName("id")
    @Expose
    val id: String? = null,

    @SerializedName("full_name")
    @Expose
    val full_name: String? = null
//получаем данные по необходимым значениям
)