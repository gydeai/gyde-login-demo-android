package com.vzw.sampleappforgyde.ui.login

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.gyde.mylibrary.screens.GydeHomeActivity
import com.vzw.sampleappforgyde.R

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    fun onGydeHelpClicked(v: View?) {
        startActivity(Intent(this@LoginActivity, GydeHomeActivity::class.java))
    }
}
