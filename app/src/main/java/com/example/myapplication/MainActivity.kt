package com.example.myapplication

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.robertlevonyan.views.customfloatingactionbutton.FloatingActionButton
import com.robertlevonyan.views.customfloatingactionbutton.FloatingActionLayout
import com.robertlevonyan.views.customfloatingactionbutton.FloatingLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val floatingActionButton = findViewById<FloatingActionButton>(R.id.customFAB)
        val floatingActionLayout = findViewById<FloatingActionLayout>(R.id.customFABL)
        val floatingLayout = findViewById<FloatingLayout>(R.id.floating_layout)
        val fab2 = findViewById<FloatingActionButton>(R.id.fab2)

        val text = "Next"
        floatingActionButton.text = text
        floatingActionButton.setOnClickListener { view: View? ->
            floatingActionButton.text = "Clicked"
            Toast.makeText(this@MainActivity, "Clicked!", Toast.LENGTH_SHORT).show()
        }

        floatingActionLayout.setOnClickListener {
            Toast.makeText(this, "clicked", Toast.LENGTH_LONG).show()
        }

        fab2.setOnClickListener {
            Toast.makeText(this, "fab2 clicked", Toast.LENGTH_SHORT).show()
        }

        floatingLayout.onMenuExpandedListener = object : FloatingLayout.OnMenuExpandedListener {
            override fun onMenuCollapsed() {
                Toast.makeText(this@MainActivity, "Expanded", Toast.LENGTH_SHORT).show()
            }

            override fun onMenuExpanded() {
                Toast.makeText(this@MainActivity, "Collapsed", Toast.LENGTH_SHORT).show()
            }
        }

    }
}