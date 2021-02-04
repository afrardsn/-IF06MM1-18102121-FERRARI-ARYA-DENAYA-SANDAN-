package com.ferrariarya_18102121.praktikum14.`interface`

import com.ferrariarya_18102121.praktikum14.model.Login
import com.ferrariarya_18102121.praktikum14.model.Quote

interface MainView {
    fun showMessage(messsage : String)
    fun resultQuote(data: ArrayList<Quote>)
    fun resultLogin(data: Login)
}