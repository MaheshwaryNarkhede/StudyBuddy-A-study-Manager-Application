package com.example.studybuddy.presentation.task

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Delete
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.studybuddy.presentation.components.TaskCheckBox

@Composable
fun TaskScreen(
    taskViewModel: ViewModel = viewModel() // inject or pass as parameter if needed
) {
    val taskState by taskViewModel.state.collectAsState()

    var newTaskTitle by remember { mutableStateOf("") }

    Column(modifier = Modifier
        .fillMaxSize()
        .padding(16.dp)) {

        // Title
        Text(text = "My Tasks", style = MaterialTheme.typography.headlineMedium)

        Spacer(modifier = Modifier.height(16.dp))

        // Input Row for Adding Task
        Row(modifier = Modifier.fillMaxWidth()) {
            TextField(
                value = newTaskTitle,
                onValueChange = { newTaskTitle = it },
                placeholder = { Text("Enter task title") },
                modifier = Modifier.weight(1f)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Button(onClick = {
                if (newTaskTitle.isNotBlank()) {
                    taskViewModel.onEvent(TaskEvent.AddTask(newTaskTitle))
                    newTaskTitle = ""
                }
            }) {
                Text("Add")
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Task List
        LazyColumn {
            items(taskState.tasks) { task ->
                TaskItem(
                    task = task,
                    onCheckBoxClick = {
                        taskViewModel.onEvent(TaskEvent.ToggleTaskCompletion(task.id))
                    },
                    onDeleteClick = {
                        taskViewModel.onEvent(TaskEvent.DeleteTask(task.id))
                    }
                )
                Divider()
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Clear All Tasks Button
        Button(
            onClick = { taskViewModel.onEvent(TaskEvent.ClearTasks) },
            colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.error)
        ) {
            Text("Clear All Tasks")
        }
    }
}

@Composable
fun TaskItem(
    task: Int,
    onCheckBoxClick: () -> Unit,
    onDeleteClick: () -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Row(verticalAlignment = androidx.compose.ui.Alignment.CenterVertically) {
            TaskCheckBox(
                isComplete = task.isCompleted,
                borderColor = MaterialTheme.colorScheme.primary,
                onCheckBoxClick = onCheckBoxClick
            )
            Spacer(modifier = Modifier.width(8.dp))
            Column {
                Text(
                    text = task.title,
                    style = MaterialTheme.typography.bodyLarge,


                    color = if (task.isCompleted) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.onSurface
                )
                if (task.description.isNotEmpty()) {
                    Text(
                        text = task.description,
                        style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }
            }
        }

        IconButton(onClick = onDeleteClick) {
            Icon(
                imageVector = Icons.Rounded.Delete,
                contentDescription = "Delete Task"
            )
        }
    }
}
