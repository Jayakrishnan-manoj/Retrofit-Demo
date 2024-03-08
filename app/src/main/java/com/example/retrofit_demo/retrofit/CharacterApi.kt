package com.example.retrofit_demo.retrofit

import com.example.retrofit_demo.retrofit.Character
import retrofit2.http.GET

interface CharacterApi {
    @GET("characters")
    suspend fun getCharacters():List<Character>
}