package com.example.laboratorio5.ui

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.ForeignKey.CASCADE
import androidx.room.PrimaryKey

//tabla de rspuestas
@Entity(tableName = "Answers", foreignKeys = [ForeignKey(entity = Question::class,
    parentColumns = ["questionId"], childColumns = ["questionId"], onDelete = CASCADE) ,
    ForeignKey(entity = Survey::class, parentColumns = ["surveyId"],
        childColumns = ["surveyId"], onDelete = CASCADE)])
data class Answer(

    @PrimaryKey(autoGenerate = true)
    var answerId: Long = 0L,

    @ColumnInfo(name = "survey_id")
    var surveyId: Long = 0L,

    @ColumnInfo(name = "question_id")
    var questionId: Long = 0L,

    @ColumnInfo(name = "answer_text")
    var answerText: String = "",

    @ColumnInfo(name = "answer_number")
    var answerNumber: Int = 0


)