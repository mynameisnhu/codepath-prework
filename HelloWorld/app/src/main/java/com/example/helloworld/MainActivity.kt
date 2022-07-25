package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

// This Kotlin is where we're going to be handling user interaction
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // Show this layout file: activity_main
        
        // Display customized to show 'Hello from {name}'
        // User can tap a button to change the text color of the label
            // Add a button to layout
                // Get a reference to button
                findViewById<Button>(R.id.button).setOnClickListener{
                    // Handle button tap
                    // Change the color of the text
                    Log.i("Ivy", "Tapped on button")
                    // Get a reference to the text view
                    // Set the color of the text view
                    findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(R.color.purple_200))
                }
    }
}