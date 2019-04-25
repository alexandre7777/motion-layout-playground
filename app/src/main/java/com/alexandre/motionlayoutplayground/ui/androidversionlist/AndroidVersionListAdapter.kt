package com.alexandre.motionlayoutplayground.ui.androidversionlist

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.alexandre.motionlayoutplayground.domain.model.AndroidVersionItem

class AndroidVersionListAdapter(private val onClickAndroidVersionItem: (View?, AndroidVersionItem) -> Unit) : ListAdapter<AndroidVersionItem, RecyclerView.ViewHolder>(ANDROID_VERSION_ITEM_COMPARATOR) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return AndroidVersionViewHolder.create(parent)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = getItem(position)
        if (item != null) {
            (holder as AndroidVersionViewHolder).bind(item, onClickAndroidVersionItem)
        }
    }

    companion object {
        private val ANDROID_VERSION_ITEM_COMPARATOR = object : DiffUtil.ItemCallback<AndroidVersionItem>() {
            override fun areItemsTheSame(oldItem: AndroidVersionItem, newItem: AndroidVersionItem): Boolean =
                oldItem.id == newItem.id

            override fun areContentsTheSame(oldItem: AndroidVersionItem, newItem: AndroidVersionItem): Boolean =
                oldItem == newItem
        }
    }
}