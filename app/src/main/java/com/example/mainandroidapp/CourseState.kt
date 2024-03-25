package com.example.mainandroidapp

data class CourseState(
    val courses: List<Course> = emptyList(),
    val isLoading: Boolean = false
)
