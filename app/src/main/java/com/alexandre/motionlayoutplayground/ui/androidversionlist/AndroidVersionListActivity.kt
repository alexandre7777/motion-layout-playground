package com.alexandre.motionlayoutplayground.ui.androidversionlist

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.alexandre.motionlayoutplayground.R
import com.alexandre.motionlayoutplayground.domain.model.createAndroidVersionList
import kotlinx.android.synthetic.main.activity_android_version_list.*

class AndroidVersionListActivity : AppCompatActivity() {

    private var adapter = AndroidVersionListAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_android_version_list)

        initAdapter()
    }

    private fun initAdapter(){
        list.layoutManager = LinearLayoutManager(applicationContext)
        list.adapter = adapter

        adapter.submitList(createAndroidVersionList())
    }
}
