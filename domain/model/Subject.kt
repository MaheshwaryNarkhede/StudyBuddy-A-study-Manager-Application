package com.example.studybuddy.domain.model

data class Subject(
    val id: Int,
    val name: String,
    val description: String = "",
    val colorHex: String = "#FFFFFF" // optional: for UI display purposes
)
