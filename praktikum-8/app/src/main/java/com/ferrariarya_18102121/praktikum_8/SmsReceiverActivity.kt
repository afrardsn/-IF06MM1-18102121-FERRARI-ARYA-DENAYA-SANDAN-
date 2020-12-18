package com.ferrariarya_18102121.praktikum_8

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sms_receiver.*
import java.util.regex.Pattern

class SmsReceiverActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_SMS_NO = "extra_sms_no"
        const val EXTRA_SMS_MESSAGE = "extra_sms_message"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sms_receiver)
        val senderNo = intent.getStringExtra(EXTRA_SMS_NO)
        val senderMessage = intent.getStringExtra(EXTRA_SMS_MESSAGE)
        val isValidMessage = isValidMessage(senderMessage)

        if (!isValidMessage) {
            title = " Hati-hati Penipuan! "
            tv_message.setTextColor(Color.RED)
        } else {
            title = " Anda dapat sms! "
        }

        tv_from.text = getString(R.string.coming_from) + ": " + senderNo
        tv_message.text = senderMessage
        btn_close.setOnClickListener { finish() }
    }

    private fun isValidMessage(message: String?): Boolean {
        val listOfBadWords = listOf(
            "Hadiah",
            "hadiah",
            "Blogspot",
            "blogspot",
            "Wordpress",
            "wordpress",
            "Pulsa",
            "pulsa",
            "Selamat",
            "selamat",
            "Transfer",
            "transfer",
            "Mobil",
            "mobil",
            "Polisi",
            "polisi",
            "Rumah",
            "rumah"
        )
        val currentMessage = message?.split(" ") // "selamat, anda" -> ["selamat,",anda"]

        if (currentMessage != null) {
            for (bad in currentMessage) {
                for (word in listOfBadWords) {
                    val myRegex = Pattern.compile(".*${word.toLowerCase()}.*")
                    if (myRegex.matcher(bad.toLowerCase()).matches()) return false
                }
            }
        }
        return true
    }
}