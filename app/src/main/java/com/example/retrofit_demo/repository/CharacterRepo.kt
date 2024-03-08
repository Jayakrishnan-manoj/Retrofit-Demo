package com.example.retrofit_demo.repository

import com.example.retrofit_demo.retrofit.Character
import com.example.retrofit_demo.retrofit.CharacterApi

class CharacterRepo(private val characterApi : CharacterApi){
    suspend fun getCharacters() : List<Character>{
        return characterApi.getCharacters()
    }
}