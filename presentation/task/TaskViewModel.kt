package com.example.studybuddy.presentation.task

data class TaskViewModel(
    val id: Int,
    val title: String,
    val description: String = "",
    val isCompleted: Boolean = false
)
