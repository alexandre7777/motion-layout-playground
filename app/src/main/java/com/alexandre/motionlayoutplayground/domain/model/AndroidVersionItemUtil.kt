package com.alexandre.motionlayoutplayground.domain.model

import com.alexandre.motionlayoutplayground.R

fun createAndroidVersionList(): List<AndroidVersionItem> {
    val donut = AndroidVersionItem(1, "1.6", R.drawable.donut, "Donut", R.layout.activity_donut)
    val eclair = AndroidVersionItem(2, "2.1", R.drawable.eclair, "Eclair", R.layout.activity_eclair)
    val froyo = AndroidVersionItem(3, "2.2", R.drawable.froyo, "Froyo", R.layout.activity_froyo)
    val gingerbread = AndroidVersionItem(
        4,
        "2.3",
        R.drawable.gingerbread,
        "Gingerbread",
        R.layout.activity_gingerbread
    )
    val honeycomb =
        AndroidVersionItem(5, "3.0", R.drawable.honeycomb, "Honeycomb", R.layout.activity_honeycomb)
    val iceCreamSandwich = AndroidVersionItem(
        6,
        "4.0",
        R.drawable.ice_cream_sandwich,
        "Ice Cream Sandwich",
        R.layout.activity_icecreamsandwich
    )
    val jellyBean = AndroidVersionItem(
        7,
        "4.1",
        R.drawable.jelly_bean,
        "Jelly Bean",
        R.layout.activity_jellybean
    )
    val kitkat = AndroidVersionItem(8, "4.4", R.drawable.kitkat, "KitKat", R.layout.activity_kitkat)
    val lollipop =
        AndroidVersionItem(9, "5.0", R.drawable.lollipop, "Lollipop", R.layout.activity_lollipop)
    val marshmallow = AndroidVersionItem(
        10,
        "6.0",
        R.drawable.marshmallow,
        "Marshmallow",
        R.layout.activity_marshmallow
    )
    val nougat =
        AndroidVersionItem(10, "7.0", R.drawable.nougat, "Nougat", R.layout.activity_nougat)
    val oreo = AndroidVersionItem(10, "8.0", R.drawable.oreo, "Oreo", R.layout.activity_oreo)
    val pie = AndroidVersionItem(10, "9.0", R.drawable.pie, "Pie", R.layout.activity_pie)

    val ten = AndroidVersionItem(13, "10.0", R.drawable.ten, "10", R.layout.activity_ten)

    return listOf(
        donut,
        eclair,
        froyo,
        gingerbread,
        honeycomb,
        iceCreamSandwich,
        jellyBean,
        kitkat,
        lollipop,
        marshmallow,
        nougat,
        oreo,
        pie,
        ten
    )
}