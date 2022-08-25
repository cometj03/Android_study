package com.cometj.composetutorial.vocalist

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.cometj.composetutorial.ui.theme.ComposeTutorialTheme

@Composable
fun VocaListScreen(
    modifier: Modifier = Modifier
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .fillMaxWidth()
            .padding(top = 16.dp)
    ) {
        SearchTextField(onTextChange = { })
    }
}

//@Preview(showBackground = true)
//@Composable
//fun DefaultPreview() {
//    ComposeTutorialTheme {
//        VocaListScreen()
//    }
//}