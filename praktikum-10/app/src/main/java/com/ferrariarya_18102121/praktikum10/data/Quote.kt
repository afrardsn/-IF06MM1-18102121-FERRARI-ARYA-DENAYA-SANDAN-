package com.ferrariarya_18102121.praktikum10.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Quote(
    var id: Int = 0,
    var title: String? = null,
    var author: String? = null,
    var description: String? = null,
    var category: String? = null,
    var year: String? = null,
    var date: String? = null
) : Parcelable
