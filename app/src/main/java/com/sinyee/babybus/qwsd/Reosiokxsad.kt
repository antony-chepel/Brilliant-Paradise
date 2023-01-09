package com.sinyee.babybus.qwsd


import kotlinx.coroutines.Dispatchers
import com.orhanobut.hawk.Hawk

import kotlinx.coroutines.GlobalScope
import android.content.Intent


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.util.Log
import com.google.android.gms.ads.identifier.AdvertisingIdClient
import com.sinyee.babybus.R
import com.sinyee.babybus.gvbcffre.Btsixcuocji
import com.sinyee.babybus.vfiuoc.Btsxokzzsd.Companion.okcvkco
import com.sinyee.babybus.vfiuoc.Btsxokzzsd.Companion.bovk
import com.sinyee.babybus.vfiuoc.Btsxokzzsd.Companion.wosk
import com.sinyee.babybus.vfiuoc.Btsxokzzsd.Companion.appqpl
import com.sinyee.babybus.vfiuoc.Hyxoxzchsije


import kotlinx.coroutines.launch

class Reosiokxsad : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_iosuxhsdw)
        ckvmc()
    }


    private fun ckvmc() {

        val oksdsko = kivobijv()

        if (oksdsko == "0") {
            makasijd()

        } else {
            GlobalScope.launch(Dispatchers.Default) {
                odihuvc()
            }
            xxcxokcxo()
        }
    }
    private fun kivobijv(): String? {
        val doeplkofd: String? = Hawk.get(wosk)
        Log.d("ADACt Data", doeplkofd.toString())
        return doeplkofd
    }


    private fun makasijd() {
        val rokdkof = Intent(this@Reosiokxsad,Hyxoxzchsije::class.java)
        Hawk.put(okcvkco, null)
        Hawk.put(bovk, null)
        startActivity(rokdkof)
        finish()
    }

    private fun xxcxokcxo() {
        val gokvbkov = Intent(this@Reosiokxsad, Btsixcuocji::class.java)
        startActivity(gokvbkov)
        finish()
    }





    private fun odihuvc(){
        val sodkoasdkdkas = AdvertisingIdClient(applicationContext)
        sodkoasdkdkas.start()
        val cokvokc = sodkoasdkdkas.info.id
        Log.d("getAdvertisingId = ", cokvokc.toString())
        Hawk.put(appqpl, cokvokc)
    }


}