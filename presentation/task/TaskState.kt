package com.example.studybuddy.presentation.task

import com.example.studybuddy.domain.model.Task

data class TaskState(
    val tasks: List<Task> = emptyList()
)
