package com.odogwudev.enomaweather.Repository

import com.odogwudev.enomaweather.Model.City
import com.odogwudev.enomaweather.Network.ApiServiceImp
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.conflate
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject
class WeatherRepository @Inject constructor(private val apiServiceImp: ApiServiceImp) {

    fun getCityData(city:String): Flow<City> = flow {
        val response= apiServiceImp.getCity(city,"06790f70099b55ff58ee43233eff6f54")
        emit(response)
    }.flowOn(Dispatchers.IO)
        .conflate()
}