package com.example.studybuddy.presentation.task

sealed class TaskEvent {
    data class AddTask(val title: String, val description: String = "") : TaskEvent()
    data class DeleteTask(val taskId: Int) : TaskEvent()
    data class ToggleTaskCompletion(val taskId: Int) : TaskEvent()
    object ClearTasks : TaskEvent()
}
