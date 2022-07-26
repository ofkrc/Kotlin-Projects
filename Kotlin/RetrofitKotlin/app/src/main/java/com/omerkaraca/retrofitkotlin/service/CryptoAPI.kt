package com.omerkaraca.retrofitkotlin.service

import com.omerkaraca.retrofitkotlin.model.CryptoModel
import retrofit2.Call
import retrofit2.http.GET
import java.util.*
import  io.reactivex.Observable

interface CryptoAPI {

    //GET,POST,UPDATE,DELETE

    //https://raw.githubusercontent.com/
    // atilsamancioglu/K21-JSONDataSet/master/crypto.json

    @GET("atilsamancioglu/K21-JSONDataSet/master/crypto.json")
    // fun getData(): Call<List<CryptoModel>>
    fun getData(): Observable<List<CryptoModel>>


}