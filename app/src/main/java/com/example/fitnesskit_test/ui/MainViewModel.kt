package com.example.fitnesskit_test.ui

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.fitnesskit_test.api.ApiFactory
import com.example.fitnesskit_test.domain.lesson.InfoL
import com.example.fitnesskit_test.domain.trainers.InfoT
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers

class MainViewModel(application: Application): AndroidViewModel(application) {
    private val compositeDisposable = CompositeDisposable()

    private val _infoL = MutableLiveData<List<InfoL>>()
    val infoL: LiveData<List<InfoL>> = _infoL

    private val _infoT = MutableLiveData<List<InfoT>>()
    val infoT: LiveData<List<InfoT>> = _infoT

    private fun loadDataLessons() {
        val disposableL = ApiFactory.apiService.getDataLesson()
            .map { it.ListLesson }
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({ it ->
                _infoL.value = it?.sortedBy { it.date }
            }, {
            })
        compositeDisposable.add(disposableL)
    }

    private fun loadDataTrainers() {
        val disposableT = ApiFactory.apiService.getDataTrainers()
            .map { it.listTrainers }
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({ _infoT.value = it },
                {
                })
        compositeDisposable.add(disposableT)
    }

    override fun onCleared() {
        super.onCleared()
        compositeDisposable.clear()
    }

    init {
        loadDataLessons()
        loadDataTrainers()
    }
}
