package com.example.taskmaster

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.taskmaster.ui.theme.Inter
import com.example.taskmaster.ui.theme.TaskMasterTheme
import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TaskMasterTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Header("Today", )
                }
            }
        }
    }
}

@Composable
fun Header(day: String) {
    //var date : Calendar = Calendar.getInstance(Calendar.DAY_OF_MONTH)

    val dateFormatter = SimpleDateFormat("yyyy-MM-dd", Locale.US)

// Get the current date and time
    val calendar = Calendar.getInstance()
    val currentDate = calendar.time

// Format the date and store it in a string variable
    val formattedDate = dateFormatter.format(currentDate)

    Column {
        Text(text = day,
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            style= MaterialTheme.typography.h1
            )
        Text(text = formattedDate)
    }


    
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TaskMasterTheme {
        Header(day = "Today")
    }
}