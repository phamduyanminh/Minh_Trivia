package com.example.minh_trivia.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "question_table", primaryKeys = ["id"])
data class Question (
        @ColumnInfo(name = "id") val id: Int,
        @ColumnInfo(name = "question") val question: String,
        @ColumnInfo(name = "optionOne") val optionOne: String,
        @ColumnInfo(name = "optionTwo") val optionTwo: String,
        @ColumnInfo(name = "optionThree") val optionThree: String,
        @ColumnInfo(name = "optionFour") val optionFour: String,
        @ColumnInfo(name = "correct") val correctAnswer: Int
)