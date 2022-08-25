package com.cometj.composetutorial.vocalist

import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.toMutableStateList
import androidx.lifecycle.ViewModel

class VocaListViewModel : ViewModel() {

    private val _searchText = mutableStateOf("")
    val searchText: String
        get() = _searchText.value

    private val _vocabularies = getVocabularies().toMutableStateList()
    val vocabularies: List<Vocabulary>
        get() = _vocabularies

    fun searchVocasByWord(searchText: String): List<Vocabulary> {
        _searchText.value = searchText
        return _vocabularies.filter { voca -> searchText in voca.word }
    }
}

private fun getVocabularies() = List(5) { i -> Vocabulary(i, englishList[i], koreanList[i]) }

private val englishList = listOf(
    "abroad", "absolute", "abundance", "accommodate", "add"
)

private val koreanList = listOf(
    "해외에 / 외국에 / 널리", "완전한", "풍부 / 대량 / 다양한", "수용하다 / 맞추다", "더하다 / 추가하다"
)