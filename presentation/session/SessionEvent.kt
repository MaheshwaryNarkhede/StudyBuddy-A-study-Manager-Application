package com.example.studybuddy.presentation.session

import com.example.studybuddy.domain.model.Session
import com.example.studybuddy.domain.model.Subject

sealed class SessionEvent {
    data class OnRelatedSubjectChange(val subject: Subject) : SessionEvent()
    data class SaveSession(val duration: Long) : SessionEvent()
    data class OnDeleteSessionButtonClick(val session: Session) : SessionEvent()
    object DeleteSession : SessionEvent() // Use `object` for singleton types
    object NotifyToUpdateSubject : SessionEvent() // Use `object` for singleton types
    data class UpdateSubjectIdAndRelatedSubject(
        val subjectId: Int?,
        val relatedToSubject: String?
    ) : SessionEvent()
}
