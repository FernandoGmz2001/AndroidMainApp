package com.example.mainandroidapp

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class CourseViewModel: ViewModel() {
    var courses by mutableStateOf(listOf<Course>())

    init{
        courses = listOf(
            Course("ENE-AGO","ASC007","Desarrollo Android","100.00"),
            Course("ENE-AGO","ASC007","IOS","90.00"),
            Course("ENE-AGO","ASC007","Multiparadigma","85.00")
        )
    }
}