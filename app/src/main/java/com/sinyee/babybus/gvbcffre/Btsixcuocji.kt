package com.sinyee.babybus.gvbcffre
import com.sinyee.babybus.vfiuoc.Btsxokzzsd.Companion.oksdskokoas
import com.sinyee.babybus.vfiuoc.Btsxokzzsd.Companion.bovk

import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit
import android.content.Intent
import com.sinyee.babybus.vfiuoc.Btsxokzzsd.Companion.gokvc
import com.sinyee.babybus.vfiuoc.Btsxokzzsd.Companion.wosk
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.appsflyer.AppsFlyerConversionListener
import com.appsflyer.AppsFlyerLib
import com.orhanobut.hawk.Hawk
import com.sinyee.babybus.databinding.ActivityIosuxhsdwBinding
import com.sinyee.babybus.vfiuoc.Btsxokzzsd.Companion.okcvkco

import com.sinyee.babybus.vfiuoc.Hyxoxzchsije







class Btsixcuocji : AppCompatActivity() {
    lateinit var nchxji: ActivityIosuxhsdwBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        nchxji = ActivityIosuxhsdwBinding.inflate(layoutInflater)
        setContentView(nchxji.root)

        val woksdij: String? = Hawk.get(wosk, "null")

        if (woksdij == "1") {
            AppsFlyerLib.getInstance()
                .init("QeBTwwA8xFLDuchTRY5BE9", psokcovji, applicationContext)
            AppsFlyerLib.getInstance().start(this)
        }

        doeopsld()

    }

    private val psokcovji = object : AppsFlyerConversionListener {
        override fun onConversionDataSuccess(eokdskod: MutableMap<String, Any>?) {
            val vockocvb = eokdskod?.get("campaign").toString()
            Hawk.put(oksdskokoas, vockocvb)
        }
        override fun onConversionDataFail(p0: String?) {}
        override fun onAppOpenAttribution(p0: MutableMap<String, String>?) {}
        override fun onAttributionFailure(p0: String?) {}
    }




    private fun doeopsld() {

        val cokcxjiv: String = Hawk.get(okcvkco)
        val sidjijsd: String = Hawk.get(bovk, "null")

        val cokvkocxvkij: String? = Hawk.get(gokvc, "null") //здесь нужен дефолтный ноль
        val dokdsj: String? = Hawk.get(wosk, "null")
        var pockv: String? = Hawk.get(oksdskokoas)

        if (dokdsj == "1") {
            Log.d("AppsChecker", dokdsj)
            val dodkcvji = Executors.newSingleThreadScheduledExecutor()
            dodkcvji.scheduleAtFixedRate({
                if (pockv != null) {

                    if (pockv!!.contains("tdb2") || cokcxjiv.contains(sidjijsd) || cokvkocxvkij!!.contains("tdb2")) {
                        Log.d("Apps Checker", "naming: $pockv")
                        dodkcvji.shutdown()
                        apoakskas()
                    } else {
                        dodkcvji.shutdown()
                        awpsodkkdosijcv()
                    }
                } else {
                    pockv = Hawk.get(oksdskokoas)
                    Log.d("TestInUIHawk", "Received null $pockv")
                }
            }, 0, 1, TimeUnit.SECONDS)
        }  else if (cokcxjiv.contains(sidjijsd)) {
            apoakskas()
        } else {
            awpsodkkdosijcv()
        }

    }



    private fun awpsodkkdosijcv() {
        val ccjivcji = Intent(this@Btsixcuocji, Hyxoxzchsije::class.java)
        Hawk.put(okcvkco, null)
        Hawk.put(bovk, null)
        startActivity(ccjivcji)
        finish()
    }


    private fun apoakskas() {
        val bjvbj = Intent(this@Btsixcuocji, Nyixokczs::class.java)
        Hawk.put(okcvkco, null)
        Hawk.put(bovk, null)
        startActivity(bjvbj)
        finish()
    }







}