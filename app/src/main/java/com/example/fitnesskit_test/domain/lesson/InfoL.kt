package com.example.fitnesskit_test.domain.lesson

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class InfoL(
    @SerializedName("name")
    @Expose
    val name: String? = null,

    @SerializedName("place")
    @Expose
    val place: String? = null,

    @SerializedName("startTime")
    @Expose
    val startTime: String? = null,

    @SerializedName("endTime")
    @Expose
    val endTime: String? = null,

    @SerializedName("coach_id")
    @Expose
    val coach_id: String? = null,

    @SerializedName("date")
    @Expose
    val date: String? = null,

    @SerializedName("color")
    @Expose
    val color: String? = null
//получаем данные по необходимым значениям
)