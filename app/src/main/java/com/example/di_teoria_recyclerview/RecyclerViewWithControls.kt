package com.example.di_teoria_recyclerview

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch

@Composable
fun RecyclerViewWithControls() {
    val context = LocalContext.current
    val rvState = rememberLazyListState()
    val coroutineScope = rememberCoroutineScope()
    Column {
        LazyColumn(
            state = rvState,
            verticalArrangement = Arrangement.spacedBy(8.dp),
            modifier = Modifier.weight(1f)
        ) {
            items(getPollos()) { pollo ->
                ItemPollo(pollo = pollo, onItemSelected = {
                    Toast.makeText(context, it.name, Toast.LENGTH_LONG).show()
                })
            }
        }
        val showButton by remember {
            derivedStateOf {
                rvState.firstVisibleItemIndex > 0
            }
        }
        if (showButton) {
            Button(
                onClick = {
                    coroutineScope.launch {
                        rvState.animateScrollToItem(0)
                    }
                }, modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(15.dp)
            ) {
                Text(text = "Pulsar")
            }
        }

    }

}