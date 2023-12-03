package com.enaitzdam.appmvvmzero

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private var _frase = ""
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

    // Declare private mutable variable that can only be modified
    // within the class it is declared.
    private var _count = 0

    // Declare another public immutable field and override its getter method.
    // Return the private property's value in the getter method.
    // When count is accessed, the get() function is called and
    // the value of _count is returned.
    val count: Int
        get() = _count

    private var _currentScrambledWord = "test"
    val currentScrambledWord: String
        get() = _currentScrambledWord



    private var wordsList: MutableList<String> = mutableListOf()
    private lateinit var currentWord: String









}