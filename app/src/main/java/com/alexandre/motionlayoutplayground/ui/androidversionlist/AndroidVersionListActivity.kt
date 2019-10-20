package com.alexandre.motionlayoutplayground.ui.androidversionlist

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.alexandre.motionlayoutplayground.R
import com.alexandre.motionlayoutplayground.domain.model.AndroidVersionItem
import com.alexandre.motionlayoutplayground.domain.model.createAndroidVersionList
import com.alexandre.motionlayoutplayground.ui.detailandroid.DetailAndroidActivity
import com.alexandre.motionlayoutplayground.ui.detailandroid.FragmentExampleActivity
import kotlinx.android.synthetic.main.activity_android_version_list.*

class AndroidVersionListActivity : AppCompatActivity() {

    private var adapter = AndroidVersionListAdapter { _, androidVersionItem: AndroidVersionItem ->
        when (androidVersionItem.id) {
            14 -> startActivity(Intent(this, FragmentExampleActivity::class.java))
            else -> {
                val intent = Intent(this, DetailAndroidActivity::class.java)
                intent.putExtra(KEY_RES_ID, androidVersionItem.res)
                startActivity(intent)
            }
        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_android_version_list)

        initAdapter()
    }

    private fun initAdapter() {
        list.layoutManager = LinearLayoutManager(applicationContext)
        list.adapter = adapter

        adapter.submitList(createAndroidVersionList())
    }

    companion object {
        const val KEY_RES_ID = "com.alexandre.motionlayoutplayground.res"
    }
}
