package com.example.fitnesskit_test.domain.lesson

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Lesson(
    @SerializedName("lessons")
    @Expose
    val ListLesson: List<InfoL>? = null,
    //получаем лист тренировок
)