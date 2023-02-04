package com.example.fitnesskit_test.api

import com.example.fitnesskit_test.domain.lesson.Lesson
import com.example.fitnesskit_test.domain.trainers.Trainers
import io.reactivex.Single
import retrofit2.http.GET

interface ApiSrevice {
    @GET("schedule/get_v3/?club_id=2")
    fun getDataTrainers(): Single<Trainers>

    @GET("schedule/get_v3/?club_id=2")
    fun getDataLesson(): Single<Lesson>
    //делаем запрос на необходимые данные
}

