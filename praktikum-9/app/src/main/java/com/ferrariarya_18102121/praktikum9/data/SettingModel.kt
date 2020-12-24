package com.ferrariarya_18102121.praktikum9.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

    @Parcelize
    data class SettingModel (
        var name: String? = null,
        var user: String? = null,
        var pass: String? = null,
        var email: String? = null,
        var age: Int = 0,
        var pin: String? = null,
        var phoneNumber: String? = null,
        var isDarkTheme: Boolean = false
    ): Parcelable