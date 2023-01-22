package com.example.mvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    private val myLifeData = MyLifeData()
    private lateinit var textView: TextView
    private lateinit var editText: EditText
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView = findViewById(R.id.testTest1)
        editText = findViewById(R.id.editText)
        button = findViewById(R.id.buttonSave)

        myLifeData.observe(this, Observer {
            textView.text = myLifeData.value
        })
        button.setOnClickListener {
            myLifeData.setValueToLiveData(editText.text.toString())
        }
    }
}