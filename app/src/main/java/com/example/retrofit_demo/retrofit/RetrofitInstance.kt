package com.example.retrofit_demo.retrofit

import retrofit2.Retrofit
import retrofit2.Retrofit.Builder
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.create

object RetrofitInstance {

    fun provideApi(builder: Retrofit.Builder): CharacterApi {
        return builder.build().create(CharacterApi::class.java)
    }

    fun provideRetrofit(): Retrofit.Builder {
        return Retrofit.Builder().baseUrl("https://hp-api.onrender.com/api/")
            .addConverterFactory(MoshiConverterFactory.create())
    }

}