package br.com.fretadosbs.tccfretadosfinal.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.fretadosbs.tccfretadosfinal.R

class MainActivity : AppCompatActivity() {

    companion object {
        private const val TAG = "MainActivity"
        private const val SIGN_IN_RESULT_CODE = 1001
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

}