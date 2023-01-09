package com.sinyee.babybus.vfiuoc

import android.app.Application
import com.onesignal.OneSignal
import com.orhanobut.hawk.Hawk

class Btsxokzzsd : Application() {
    companion object {
        const val aopkaskao = "5c71d10d-980f-474d-9781-7a111f6ab4dd"
        var gokvc: String? = "d11"
        var gokv = "link"

        var appqpl: String? = "mainid"
        var okcvkco = "geo"
        var wosk = "appsChecker"

        var bovk: String? = "countryCode"
        var oksdskokoas: String? = "c11"

    }

    override fun onCreate() {
        super.onCreate()
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE)
        OneSignal.initWithContext(this)
        OneSignal.setAppId(aopkaskao)
        Hawk.init(this).build()
    }
}