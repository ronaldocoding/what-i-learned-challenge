package br.com.what_i_learned_challenge

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.what_i_learned_challenge.databinding.ActivityWhatILearnedBinding

class WhatILearnedActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityWhatILearnedBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }

}
