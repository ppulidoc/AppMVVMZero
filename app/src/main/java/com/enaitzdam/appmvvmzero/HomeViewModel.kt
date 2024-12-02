package com.enaitzdam.appmvvmzero

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

  /*  private var _frase = ""
    val frase: String
        get() = _frase

    private var _autor = ""
    val autor: String
        get() = _autor

    fun randomQuote() {
        val currentQuote = QuoteProvider.random()
        _frase=currentQuote.quote
        _autor=currentQuote.author
    }
    private var score = 0
    private var currentWordCount = 0
    private var _count = 0
    val count: Int
        get() = _count

    private var _currentScrambledWord = "test"
    val currentScrambledWord: String
        get() = _currentScrambledWord
    private var wordsList: MutableList<String> = mutableListOf()
    private lateinit var currentWord: String*/



    fun returnCount(edat: Int): Int {
        var numAlumnes = 0
        for (alumne in AlumnsProvider.returnAlumns()) {
            if (alumne.edat == edat){
                numAlumnes++
            }
        }
        return numAlumnes
    }











}