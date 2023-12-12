package com.example.di_teoria_recyclerview

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp

@Composable
fun RecyclerView02() {
    val context = LocalContext.current
    //se puede hacer LazyRow
    LazyColumn(verticalArrangement = Arrangement.spacedBy(8.dp)) {
        items(getPollos()) { pollo ->
            ItemPollo(
                pollo = pollo
            ) {
                Toast.makeText(context, it.name, Toast.LENGTH_LONG).show()
            }

        }
    }


}