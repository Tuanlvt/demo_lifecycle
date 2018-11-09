package com.framgia.demo_lifecycle

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initLifeCycle()
    }

    private fun initLifeCycle() {
        val lifeCycleObserver = LifeCycleObserver(lifecycle, Logger())
        lifecycle.addObserver(lifeCycleObserver)

        button_intent.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.google.com")
            startActivity(intent)
        }
    }
}
