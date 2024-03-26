package com.example.flashcard_app

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class AddCardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_card)

        val editTextField = findViewById<EditText>(R.id.editTextField)
        val editTextField1 = findViewById<EditText>(R.id.editTextField1)
        val showingAnswers = findViewById<ImageView>(R.id.icone_X)
        val saveAnswers = findViewById<ImageView>(R.id.icone_save)

        showingAnswers.setOnClickListener {
            // Retour à MainActivity
            finish()
        }

        saveAnswers.setOnClickListener {
            val question = editTextField.text.toString()
            val answer = editTextField1.text.toString()

            val intent = Intent()
            intent.putExtra("question", question)
            intent.putExtra("answer", answer)
            setResult(Activity.RESULT_OK, intent)
            finish()
        }
    }
}
