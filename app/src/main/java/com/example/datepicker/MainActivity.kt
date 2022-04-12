package com.example.datepicker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CalendarView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val calender = findViewById<View>(R.id.calendarView1) as CalendarView
        val textview = findViewById<View>(R.id.textView2) as TextView

        calender.setOnDateChangeListener { view, year, month, day ->
            textview.text = "Date is : " + (month + 1) + " / " + day + " / " + year
        }
    }
}