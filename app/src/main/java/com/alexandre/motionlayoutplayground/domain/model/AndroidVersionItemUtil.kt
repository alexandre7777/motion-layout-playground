package com.alexandre.motionlayoutplayground.domain.model

import com.alexandre.motionlayoutplayground.R

fun createAndroidVersionList() : List<AndroidVersionItem>{
    val donut = AndroidVersionItem(1, "1.6", R.drawable.donut, "Donut")
    val eclair = AndroidVersionItem(2, "2.1", R.drawable.eclair, "Eclair")
    val froyo = AndroidVersionItem(3, "2.2", R.drawable.froyo, "Froyo")
    val gingerbread = AndroidVersionItem(4, "2.3", R.drawable.gingerbread, "Gingerbread")
    val honeycomb = AndroidVersionItem(5, "3.0", R.drawable.honeycomb, "Honeycomb")
    val iceCreamSandwich = AndroidVersionItem(6, "4.0", R.drawable.ice_cream_sandwich, "Ice Cream Sandwich")
    val jellyBean = AndroidVersionItem(7, "4.1", R.drawable.jelly_bean, "Jelly Bean")
    val kitkat = AndroidVersionItem(8, "4.4", R.drawable.kitkat, "KitKat")
    val lollipop = AndroidVersionItem(9, "5.0", R.drawable.lollipop, "Lollipop")
    val marshmallow = AndroidVersionItem(10, "6.0", R.drawable.marshmallow, "Marshmallow")

    return listOf(donut, eclair, froyo, gingerbread, honeycomb, iceCreamSandwich, jellyBean, kitkat, lollipop, marshmallow)
}