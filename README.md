# 📚 StudyBuddy

**StudyBuddy** is a modern Android application designed to streamline study planning and task management for students. It provides an intuitive and minimal interface for tracking subjects, organizing tasks, and improving productivity.

Developed entirely in **Kotlin**, the app leverages **Jetpack Compose** for its declarative UI, along with **Material 3 Design**, **Room Database**, **Dagger Hilt**, and **Compose Destinations** for seamless navigation and scalable architecture.

---

## ✨ Features

- ✅ **Add & Manage Subjects**  
  Create subjects and associate tasks or study sessions with them.
  
- ✅ **Task Management**  
  Add, update, and delete tasks with completion tracking.
  
- ✅ **Modern UI with Material 3**  
  Clean and responsive design using **Jetpack Compose** and **Material 3**.
  
- ✅ **Compose Destinations**  
  Type-safe navigation with easier route management.
  
- ✅ **Room Database**  
  Persistent local storage for tasks and subjects.
  
- ✅ **Dagger Hilt Integration**  
  Simplified dependency injection for scalable architecture.
  

---

## 🛠️ Built With

- **Kotlin**
- **Jetpack Compose**  
- **Material 3 Components**
- **Room Database**
- **Compose Destinations**
- **Dagger Hilt (DI)**

---

## File Structure  📂

<the code block above>
📦 StudyBuddy
├── 📂 data
│   ├── 📂 local
│   │   ├── AppDatabase.kt
│   │   ├── ColorListConverter.kt
│   │   ├── SessionDao.kt
│   │   ├── SubjectDao.kt
│   │   └── TaskDao.kt
│   └── 📂 repository
│       ├── SessionRepositoryImpl.kt
│       ├── SubjectRepositoryImpl.kt
│       └── TaskRepositoryImpl.kt
│
├── 📂 di
│   ├── DatabaseModule.kt
│   ├── NotificationModule.kt
│   └── RepositoryModule.kt
│
├── 📂 domain
│   ├── 📂 model
│   │   ├── Session.kt
│   │   ├── Subject.kt
│   │   ├── Task.kt
│   │   └── TypeConverters.kt
│   └── 📂 repository
│       ├── SessionRepository.kt
│       ├── SubjectRepository.kt
│       └── TaskRepository.kt
│
├── 📂 presentation
│   ├── 📂 components
│   │   └── TaskCheckBox.kt
│   ├── 📂 dashboard
│   │   └── DashboardScreen.kt
│   ├── 📂 session
│   │   ├── SessionScreen.kt
│   │   ├── SessionViewModel.kt
│   │   ├── SessionEvent.kt
│   │   └── SessionState.kt
│   ├── 📂 subject
│   │   ├── SubjectScreen.kt
│   │   ├── SubjectViewModel.kt
│   │   ├── SubjectEvent.kt
│   │   └── SubjectState.kt
│   ├── 📂 task
│   │   ├── TaskScreen.kt
│   │   ├── TaskViewModel.kt
│   │   ├── TaskEvent.kt
│   │   └── TaskState.kt
│   └── 📂 theme
│       ├── Color.kt
│       ├── Theme.kt
│       └── Typography.kt
│
├── 📂 util
│   ├── Common.kt
│   └── Constants.kt
│
├── MainActivity.kt
└── StudyBuddyApp.kt
