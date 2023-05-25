package com.example.myhomework1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myhomework1.MainActivity.Companion.KEY_FOR_TEXT
import com.example.myhomework1.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {

    private lateinit var binding: ActivityResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.wordsEt.setText(intent.getStringExtra(KEY_FOR_TEXT))
        initListener()
    }

    private fun initListener() {
        binding.btnTwo.setOnClickListener {
            intent.putExtra(KEY_FOR_TEXT, binding.wordsEt.text.toString())
            setResult(RESULT_OK, intent)
            finish()
        }
    }
}