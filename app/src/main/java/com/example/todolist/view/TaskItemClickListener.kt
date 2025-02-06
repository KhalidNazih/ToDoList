package com.example.todolist.view

import com.example.todolist.model.TaskItem

interface TaskItemClickListener {

    fun editTaskItem(taskItem: TaskItem)
    fun completeTaskItem(taskItem: TaskItem)
}