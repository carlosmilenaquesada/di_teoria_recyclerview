package com.example.di_teoria_recyclerview

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun ItemPollo(pollo: Pollo, onItemSelected: (Pollo) -> Unit) {
    Card(border = BorderStroke(2.dp, Color.Cyan),
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onItemSelected(pollo) }) {
        Column {
            Image(
                painter = painterResource(id = pollo.foto),
                contentDescription = null,
                modifier = Modifier.fillMaxWidth(),
                contentScale = ContentScale.Crop
            )
            Text(
                text = pollo.name,
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )

        }
    }
}