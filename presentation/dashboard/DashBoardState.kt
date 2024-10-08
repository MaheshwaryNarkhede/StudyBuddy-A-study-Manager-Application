package com.example.studybuddy.presentation.dashboard

import androidx.compose.ui.graphics.Color
import com.example.studybuddy.domain.model.Session
import com.example.studybuddy.domain.model.Subject

data class DashBoardState(
    val subjectName: String = "",
    val goalStudyHours: String = "",
    val subjectCardColors: List<Color> = listOf(),
    val totalSubjectCount: Int = 0,
    val totalGoalStudyHours: Float = 0f,
    val subjects: List<Subject> = listOf(),
    val totalStudiedHours: Float = 0f,
    val session: Session? = null // Make sure this is correctly defined
)

