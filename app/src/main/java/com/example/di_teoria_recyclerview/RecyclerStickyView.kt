package com.example.di_teoria_recyclerview

import android.widget.Toast
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun RecyclerStickyView() {
    val context = LocalContext.current
    val pollos = getPollos().groupBy { it.ciudad }

    LazyColumn(verticalArrangement = Arrangement.spacedBy(8.dp)) {
        pollos.forEach() { (ciudad, Pollo) ->
            stickyHeader {
                Text(
                    text = ciudad,
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color.Cyan),
                    fontSize = 17.sp
                )

            }
            items(Pollo) {
                ItemPollo(pollo = it) {
                    Toast.makeText(context, it.name, Toast.LENGTH_LONG).show()
                }
            }
        }

    }


}