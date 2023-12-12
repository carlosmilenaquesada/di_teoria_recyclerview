package com.example.di_teoria_recyclerview

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.di_teoria_recyclerview.ui.theme.Di_teoria_recyclerviewTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Di_teoria_recyclerviewTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //RecyclerView01()
                    //RecyclerView02()
                    //Recyclerview03Grid()
                    //RecyclerViewWithControls()
                    RecyclerStickyView()
                }
            }
        }
    }
}

