package com.alexandre.motionlayoutplayground.ui.detailandroid

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.alexandre.motionlayoutplayground.R

class DetailAndroidActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(intent.getIntExtra(KEY_RES_ID, R.layout.activity_donut))
    }

    companion object {
        const val KEY_RES_ID = "com.alexandre.motionlayoutplayground.res"
    }
}