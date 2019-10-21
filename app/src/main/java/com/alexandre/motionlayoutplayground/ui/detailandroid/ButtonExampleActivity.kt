package com.alexandre.motionlayoutplayground.ui.detailandroid

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.motion.widget.MotionLayout
import androidx.fragment.app.Fragment
import com.alexandre.motionlayoutplayground.R
import kotlinx.android.synthetic.main.activity_btn.*
import kotlinx.android.synthetic.main.activity_example_fragment.*

class ButtonExampleActivity : AppCompatActivity() {

    private var start: Boolean = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_btn)

        android_img.setOnClickListener {
            if (start) {
                motion.transitionToEnd()
                start = false
            } else {
                motion.transitionToStart()
                start = true
            }
        }
    }
}