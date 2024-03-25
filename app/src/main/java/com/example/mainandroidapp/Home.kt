package com.example.mainandroidapp

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Home(courseViewModel: CourseViewModel) {
    LazyColumn(
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp, 20.dp)
    ) {
        items(courseViewModel.courses) {
            Row(
                modifier = Modifier
                    .clip(RoundedCornerShape(10.dp))
                    .background(Color(0xFF8EEBF9))
                    .fillMaxWidth()
                    .padding(20.dp, 20.dp)
            ) {
                Column {
                    Row {
                        Text(text = it.period)
                    }
                    Divider(modifier = Modifier.height(8.dp), color = Color.Transparent)
                    Row() {
                        Text(
                            text = it.course,
                            fontWeight = FontWeight.Bold,
                            fontSize = 24.sp
                        )
                    }
                }
            }
            Divider(modifier = Modifier.height(8.dp), color = Color.Transparent)
        }
    }
}
