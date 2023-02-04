package com.example.fitnesskit_test.domain.trainers

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Trainers(
    @SerializedName("trainers")
    @Expose
    val listTrainers: List<InfoT>? = null
//получаем лист тренеров
)