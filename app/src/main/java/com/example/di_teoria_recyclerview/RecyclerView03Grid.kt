package com.example.di_teoria_recyclerview

import android.widget.Toast
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext

@Composable
fun Recyclerview03Grid() {
    val context = LocalContext.current

    LazyVerticalGrid(columns = GridCells.Fixed(3),
        content = {
            items(getPollos()) {
                ItemPollo(pollo = it) {
                    Toast.makeText(context, it.name, Toast.LENGTH_LONG).show()
                }

            }
        })

}