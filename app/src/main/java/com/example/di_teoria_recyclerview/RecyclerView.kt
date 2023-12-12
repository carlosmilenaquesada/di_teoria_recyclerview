package com.example.di_teoria_recyclerview

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

//RecyclerView (que en verad se llama LazyColumn ó LazyRow, en jetpackcompose)
@Composable
fun RecyclerView01() {
    LazyColumn {
        //item uno a uno
        item { Text(text = "Item 01") }
        item { Text(text = "Item 02") }
        item { Text(text = "Item 03") }
        item { Text(text = "Item 04") }
        item { Text(text = "Item 05") }

        //lista de item
        items(count = 10) {
            Text(text = "Item $it")
        }

        //header y footer
        item { Text(text = "Header") }

        item { Spacer(modifier = Modifier.height(10.dp)) }
        //lista vendia de un list
        val lista = listOf("a", "b", "c")
        items(lista){
            Text(text = it.toString())
            
        }
        items(count = 10) {
            Text(text = "Item $it")
        }
        item { Spacer(modifier = Modifier.height(10.dp)) }
        item { Text(text = "Footer") }


    }

}