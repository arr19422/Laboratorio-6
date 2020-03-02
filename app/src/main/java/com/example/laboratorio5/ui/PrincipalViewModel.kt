package com.example.laboratorio5.ui

import androidx.lifecycle.MutableLiveData

class PrincipalViewModel {
    private val questions:  MutableList<String> = mutableListOf<String>()

    val _preguntas:MutableList<String>
        get() = questions


    private val word = MutableLiveData<String>()
    val _word: MutableLiveData<String>
        get() = word

    private val length = MutableLiveData<Int>()
    val _length: MutableLiveData<Int>
        get() = length

    init {
        _length.value = 0
    }

    fun getQuestions() : MutableList<String>{
        return questions
    }

    fun addQuestion(string: String) {
        questions.add(string)
        _length.value = (_length.value)?.plus(1)
    }

}