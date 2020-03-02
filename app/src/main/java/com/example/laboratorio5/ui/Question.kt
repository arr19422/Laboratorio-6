package com.example.laboratorio5.ui

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

//tabla de preguntas
@Entity(tableName = "Questions")
data class Question(

    @PrimaryKey(autoGenerate = true)
    var questionId: Long = 0L,

    @ColumnInfo(name = "question")
    var name: String = "",

    @ColumnInfo(name = "type")
    var type: String = "",

    @ColumnInfo(name = "default")
    var default: Boolean = false
)