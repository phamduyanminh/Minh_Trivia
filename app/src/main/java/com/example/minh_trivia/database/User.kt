package com.example.minh_trivia.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user_table")
data class User (
    @PrimaryKey val id: Int,
    @PrimaryKey val question: String,
    @PrimaryKey val optionOne: String,
    @PrimaryKey val optionTwo: String,
    @PrimaryKey val optionThree: String,
    @PrimaryKey val optionFour: String,
    @PrimaryKey val correctAnswer: Int
)
