package com.example.exam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var textArray = mutableListOf<String>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

            addArray()
            removeArray()
    }

    private fun addArray() {
        add_button.setOnClickListener click@ {
            val value: String = add_edit_text.text.toString()
              add_edit_text.text.clear()
            Toast.makeText(this, "Элемент не найден ", Toast.LENGTH_SHORT).show()
            textArray.add(value)
            //displayArray()
        }
    }

    private fun removeArray () {
        remove_button.setOnClickListener {
            val value: String = remove_edit_text.text.toString()
            remove_edit_text.text.clear()
            Toast.makeText(this, "Невозможно добавить пустое знаечение", Toast.LENGTH_SHORT).show().
            textArray.remove(value)
            //displayArray()

        }
    }

}

