package com.ferrariarya_18102121.praktikum9.preference

import android.content.Context
import com.ferrariarya_18102121.praktikum9.data.SettingModel

internal class SettingPreference(context: Context) {
    companion object {
        private const val PREFS_NAME = "setting_pref"
        private const val NAME = "name"
        private const val USER = "user"
        private const val PASS = "pass"
        private const val EMAIL = "email"
        private const val AGE = "age"
        private const val PIN = "pin"
        private const val PHONE_NUMBER = "phone"
        private const val THEME = "theme"
    }

    private val preferences = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
    fun setSetting(value: SettingModel) {
        val editor = preferences.edit()
        editor.putString(NAME, value.name)
        editor.putString(USER, value.user)
        editor.putString(PASS, value.pass)
        editor.putString(EMAIL, value.email)
        editor.putInt(AGE, value.age)
        editor.putString(PIN, value.pin)
        editor.putString(PHONE_NUMBER, value.phoneNumber)
        editor.putBoolean(THEME, value.isDarkTheme)
        editor.apply()
    }

    fun getSetting(): SettingModel {
        val model = SettingModel()
        model.name = preferences.getString(NAME, "")
        model.user = preferences.getString(USER, "")
        model.pass = preferences.getString(PASS, "")
        model.email = preferences.getString(EMAIL, "")
        model.age = preferences.getInt(AGE, 0)
        model.pin = preferences.getString(PIN, "")
        model.phoneNumber = preferences.getString(PHONE_NUMBER, "")
        model.isDarkTheme = preferences.getBoolean(THEME, false)
        return model
    }
}