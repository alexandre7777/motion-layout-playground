package com.alexandre.motionlayoutplayground.ui.androidversionlist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.alexandre.motionlayoutplayground.R
import com.alexandre.motionlayoutplayground.domain.model.AndroidVersionItem

class AndroidVersionViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    private val versionTitle: TextView = view.findViewById(R.id.versionTitle)
    private val versionImage: ImageView = view.findViewById(R.id.versionImage)

    fun bind(androidVersionItem: AndroidVersionItem, onClickAndroidVersionItem: (View?, AndroidVersionItem) -> Unit) {
        versionTitle.text = androidVersionItem.title
        versionImage.setImageResource(androidVersionItem.image)
        itemView.setOnClickListener {
            onClickAndroidVersionItem(it, androidVersionItem)
        }
    }

    companion object {
        fun create(parent: ViewGroup): AndroidVersionViewHolder {
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.android_version_item, parent, false)
            return AndroidVersionViewHolder(view)
        }
    }
}