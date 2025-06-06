package com.example.recipehubfrontend

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

// Obsolete - replaced by MainContainerActivity as launcher. Retained for backup/ref purposes.
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
