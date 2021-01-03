package com.ferrariarya_18102121.praktikum10.db

import android.provider.BaseColumns

internal class DatabaseContract {
    internal class QuoteColumns : BaseColumns {
        companion object {
            const val TABLE_QUOTE = "quote"
            const val _ID = "_id"
            const val TITLE = "title"
            const val AUTHOR = "author"
            const val DESCRIPTION = "description"
            const val CATEGORY = "category"
            const val YEAR = "year"
            const val DATE = "date"
        }
    }
}
