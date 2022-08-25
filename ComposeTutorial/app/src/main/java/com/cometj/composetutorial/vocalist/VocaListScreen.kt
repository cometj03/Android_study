package com.cometj.composetutorial.vocalist

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun VocaListScreen(
    modifier: Modifier = Modifier,
    vocaListViewModel: VocaListViewModel = viewModel()
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .fillMaxWidth()
            .padding(top = 16.dp)
    ) {
        SearchTextField(
            text = vocaListViewModel.searchText,
            onValueChange = {
                vocaListViewModel.searchVocasByWord(it)
            }
        )
        VocabularyList(list = vocaListViewModel.vocabularies)
    }
}

//@Preview(showBackground = true)
//@Composable
//fun DefaultPreview() {
//    ComposeTutorialTheme {
//        VocaListScreen()
//    }
//}