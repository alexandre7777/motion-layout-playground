package com.alexandre.motionlayoutplayground.ui.detailandroid

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.motion.widget.MotionLayout
import androidx.viewpager.widget.ViewPager
import com.alexandre.motionlayoutplayground.R
import com.alexandre.motionlayoutplayground.ui.detailandroid.adapter.ViewPagerAdapter
import kotlinx.android.synthetic.main.activity_nougat.*
import kotlinx.android.synthetic.main.activity_pie.*

class DetailAndroidActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val layout = intent.getIntExtra(KEY_RES_ID, R.layout.activity_donut)

        setContentView(layout)

        when(layout) {
            R.layout.activity_nougat -> {
                val motionLayout = findViewById<MotionLayout>(R.id.motionLayout)

                val adapter = ViewPagerAdapter(supportFragmentManager)
                adapter.addPage("Page 1", R.layout.motion_viewpager)
                adapter.addPage("Page 2", R.layout.motion_viewpager)
                adapter.addPage("Page 3", R.layout.motion_viewpager)
                pager.adapter = adapter
                tabs.setupWithViewPager(pager)
                if (motionLayout != null) {
                    pager.addOnPageChangeListener(motionLayout as ViewPager.OnPageChangeListener)
                }
            }
            R.layout.activity_pie -> {
                val motion = findViewById<MotionLayout>(R.id.motion)

                motion.setTransitionListener(
                    object : MotionLayout.TransitionListener {
                        override fun onTransitionStarted(motionLayout: MotionLayout?, startId: Int, endId: Int) {
                            Toast.makeText(baseContext, "Start", Toast.LENGTH_SHORT).show()
                        }

                        override fun onTransitionChange(motionLayout: MotionLayout?, startId: Int, endId: Int, progress: Float) {
                            seekBar.progress = (progress * 100).toInt()
                        }

                        override fun onTransitionCompleted(motionLayout: MotionLayout?, currentId: Int) {
                            Toast.makeText(baseContext, "Completed", Toast.LENGTH_SHORT).show()
                        }

                        override fun onTransitionTrigger(motionLayout: MotionLayout?, triggerId: Int, positive: Boolean, progress: Float) {}
                    })
            }
        }
    }

    companion object {
        const val KEY_RES_ID = "com.alexandre.motionlayoutplayground.res"
    }
}