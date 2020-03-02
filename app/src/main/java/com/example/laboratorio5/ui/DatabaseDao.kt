package com.example.laboratorio5.ui

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface DatabaseDao {


    @Insert
    fun insert(respuesta: Answer)

    @Update
    fun update(respuesta: Answer)

    //selecciona los datos de la tabla
    @Query("SELECT * FROM Answers ORDER BY answerId DESC")
    fun getTonight(): Answer?

    //elimina registros
    @Query("DELETE FROM Answers")
    fun clear()

    //elimina registros
    @Query("DELETE  FROM Surveys")
    fun clearSurvey()

    //eliminar preguntas
    @Query("DELETE FROM Questions")
    fun clearQuestions()

    //jala las preguntas guardadas
    @Query("SELECT question FROM Questions")
    fun questions()




}