package com.cometj.composetutorial.vocalist

import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember

@Composable
fun SearchTextField(
    onTextChange: (String) -> Unit
) {
    val textState = remember { mutableStateOf("") }
    TextField(
        value = textState.value,
        onValueChange = { newValue -> textState.value = newValue },
        label = { Text(text = "Type a word") }
    )
}