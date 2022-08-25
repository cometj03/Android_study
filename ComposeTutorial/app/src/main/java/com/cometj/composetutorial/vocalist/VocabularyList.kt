package com.cometj.composetutorial.vocalist

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel

data class Vocabulary(
    val id: Int,
    val word: String,
    val mean: String
)

@Composable
fun VocabularyList(
    searchText: String,
    list: List<Vocabulary>,
    onSearchList: (String) -> List<Vocabulary>
) {
    LazyColumn {
        val itemList = if (searchText.isEmpty()) {
            list
        } else {
            onSearchList(searchText)
        }
        items(itemList) { item ->
            VocabularyItem(word = item.word, mean = item.mean)
        }
    }
}


@Composable
fun VocabularyItem(
    word: String,
    mean: String,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .padding(8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            modifier = Modifier.weight(1f),
            text = word
        )
        Text(
            modifier = Modifier.weight(1f),
            text = mean
        )
    }
}

@Preview(showBackground = true)
@Composable
fun Preview() {
    VocabularyItem("test", "테스트")
}