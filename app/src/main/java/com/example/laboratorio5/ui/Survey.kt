package com.example.laboratorio5.ui

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.text.DateFormat

//tabla de las encuestas
@Entity(tableName= "Surveys")
data class Survey(

    @PrimaryKey(autoGenerate = true)
    var surveyId: Long =0L,

    @ColumnInfo(name = "date")
    var date: String = ""
)