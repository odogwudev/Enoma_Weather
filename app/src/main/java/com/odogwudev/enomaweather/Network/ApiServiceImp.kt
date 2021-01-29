package com.odogwudev.enomaweather.Network

import com.odogwudev.enomaweather.Model.City
import javax.inject.Inject

class ApiServiceImp @Inject constructor(private val apiService: ApiService) {

    suspend fun getCity(city:String,appId:String): City = apiService.getCityData(city,appId)
}