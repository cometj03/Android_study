package com.cometj.composetutorial.vocalist

import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable

@Composable
fun SearchTextField(
    text: String,
    onValueChange: (String) -> Unit
) {
    TextField(
        value = text,
        onValueChange = onValueChange,
        label = { Text(text = "Type a word") }
    )
}