package com.sinyee.babybus.gvbcffre
import com.orhanobut.hawk.Hawk
import com.sinyee.babybus.R
import com.sinyee.babybus.databinding.ActivityYocixjhdsBinding
import android.content.pm.PackageManager
import android.net.Uri
import com.sinyee.babybus.vfiuoc.Btsxokzzsd.Companion.oksdskokoas
import android.annotation.SuppressLint
import android.app.Activity

import java.io.IOException
import android.widget.Toast
import android.util.Log
import android.webkit.*
import com.sinyee.babybus.vfiuoc.Btsxokzzsd.Companion.gokvc


import com.appsflyer.AppsFlyerLib
import com.google.android.material.snackbar.Snackbar
import com.onesignal.OneSignal
import android.content.Intent

import com.sinyee.babybus.vfiuoc.Btsxokzzsd.Companion.appqpl
import com.sinyee.babybus.vfiuoc.Btsxokzzsd.Companion.gokv


import android.os.*
import androidx.appcompat.app.AppCompatActivity
import android.provider.MediaStore






import org.json.JSONException
import org.json.JSONObject

import java.io.File


class Nyixokczs : AppCompatActivity() {

    var ovkc = ""
    lateinit var qopwoke: WebView
    private var vokcbko = false
    var aokoasji: String? = null

    lateinit var fokcox: ActivityYocixjhdsBinding
    private val eioksd = 1
    var vokcv = ""
    var doekos: ValueCallback<Array<Uri>>? = null




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        fokcox = ActivityYocixjhdsBinding.inflate(layoutInflater)
        setContentView(fokcox.root)

        qopwoke = fokcox.roeisd
        Snackbar.make(
            fokcox.root, "Loading...",
            Snackbar.LENGTH_LONG
        ).show()


        val forkd = CookieManager.getInstance()
        forkd.setAcceptCookie(true)
        forkd.setAcceptThirdPartyCookies(qopwoke, true)
        owkspld()
        val xodkds: Activity = this
        qopwoke.webViewClient = object : WebViewClient() {


            override fun shouldOverrideUrlLoading(apqo: WebView, vobk: String): Boolean {
                try {
                    if (URLUtil.isNetworkUrl(vobk)) {
                        return false
                    }
                    if (forkodkspl(vobk)) {

                        val rpdlfoksa = Intent(Intent.ACTION_VIEW)
                        rpdlfoksa.data = Uri.parse(vobk)
                        startActivity(rpdlfoksa)
                    } else {

                        Toast.makeText(
                            applicationContext,
                            "Application is not installed",
                            Toast.LENGTH_LONG
                        ).show()
                        startActivity(
                            Intent(
                                Intent.ACTION_VIEW,
                                Uri.parse("https://play.google.com/store/apps/details?id=org.telegram.messenger")
                            )
                        )
                    }
                    return true
                } catch (e: Exception) {
                    return false
                }
                apqo.loadUrl(vobk)
            }


            override fun onPageFinished(view: WebView, url: String) {
                super.onPageFinished(view, url)

                fokrijd(url)
            }

            override fun onReceivedError(
                view: WebView,
                errorCode: Int,
                description: String,
                failingUrl: String
            ) {
                Toast.makeText(xodkds, description, Toast.LENGTH_SHORT).show()
            }


        }
        qopwoke.webChromeClient = object : WebChromeClient() {
            override fun onShowFileChooser(
                xozd: WebView, eokkjisd: ValueCallback<Array<Uri>>,
                qpwok: FileChooserParams
            ): Boolean {
                doekos?.onReceiveValue(null)
                doekos = eokkjisd
                var fokdkcxo: Intent? = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                if (fokdkcxo!!.resolveActivity(packageManager) != null) {

                    var plkoxjicji: File? = null
                    try {
                        plkoxjicji = oksjid()
                        fokdkcxo.putExtra("PhotoPath", aokoasji)
                    } catch (ex: IOException) {

                    }

                    if (plkoxjicji != null) {
                        aokoasji = "file:" + plkoxjicji.absolutePath
                        fokdkcxo.putExtra(
                            MediaStore.EXTRA_OUTPUT,
                            Uri.fromFile(plkoxjicji)
                        )
                    } else {
                        fokdkcxo = null
                    }
                }
                val rokjd = Intent(Intent.ACTION_GET_CONTENT)
                rokjd.addCategory(Intent.CATEGORY_OPENABLE)
                rokjd.type = "image/*"
                val dokxozkc: Array<Intent?> =
                    fokdkcxo?.let { arrayOf(it) } ?: arrayOfNulls(0)
                val fpfldldpf = Intent(Intent.ACTION_CHOOSER)
                fpfldldpf.putExtra(Intent.EXTRA_INTENT, rokjd)
                fpfldldpf.putExtra(Intent.EXTRA_TITLE, getString(R.string.image_chooser))
                fpfldldpf.putExtra(Intent.EXTRA_INITIAL_INTENTS, dokxozkc)
                startActivityForResult(
                    fpfldldpf, eioksd
                )
                return true
            }

            @Throws(IOException::class)
            private fun oksjid(): File {
                var fokdkof = File(
                    Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES),
                    "DirectoryNameHere"
                )
                if (!fokdkof.exists()) {
                    fokdkof.mkdirs()
                }

                fokdkof =
                    File(fokdkof.toString() + File.separator + "IMG_" + System.currentTimeMillis() + ".jpg")
                return fokdkof
            }

        }

        qopwoke.loadUrl(eoksd())
    }







    override fun onActivityResult(dokcokx: Int, qpwl: Int, doksd: Intent?) {
        if (dokcokx != eioksd || doekos == null) {
            super.onActivityResult(dokcokx, qpwl, doksd)
            return
        }
        var xpclpcx: Array<Uri>? = null


        if (qpwl == AppCompatActivity.RESULT_OK) {
            if (doksd == null || doksd.data == null) {

                xpclpcx = arrayOf(Uri.parse(aokoasji))
            } else {
                val eokkoosdk = doksd.dataString
                if (eokkoosdk != null) {
                    xpclpcx = arrayOf(Uri.parse(eokkoosdk))
                }
            }
        }
        doekos?.onReceiveValue(xpclpcx)
        doekos = null
    }




    private fun eoksd(): String {


        val ockvkocxv: String? = Hawk.get(gokvc, "null")
        val wokksodk = "deeporg"
        val oxkckozpl = "sub_id_5="
        val psdl = "ad_id="
        val sdj = "sub_id_4="
        val fokcxv = Hawk.get(gokv, "null")
        val eokookd: String? = Hawk.get(appqpl, "null")
        AppsFlyerLib.getInstance().setCollectAndroidID(true)
        val dokdfji = "naming"
        val wokkods = "sub_id_6="
        val oxckzxij = "sub_id_1="
        val qopldl = Build.VERSION.RELEASE
        val xokccx:String? = Hawk.get(oksdskokoas, "null")
        val qokwow = AppsFlyerLib.getInstance().getAppsFlyerUID(this)
        val fkdo = getSharedPreferences("SP_WEBVIEW_PREFS", AppCompatActivity.MODE_PRIVATE)
        val cpvlcx = "com.sinyee.babybus"
        val wokdosk = "deviceID="



        if (xokccx != "null"){
            vokcv = "$fokcxv$oxckzxij$xokccx&$wokdosk$qokwow&$psdl$eokookd&$sdj$cpvlcx&$oxkckozpl$qopldl&$wokkods$dokdfji"
            rpekosd(qokwow.toString())
        } else {
            vokcv = "$fokcxv$oxckzxij$ockvkocxv&$wokdosk$qokwow&$psdl$eokookd&$sdj$cpvlcx&$oxkckozpl$qopldl&$wokkods$wokksodk"
            rpekosd(qokwow.toString())
        }

        Log.d("TESTAG", "Test Result $vokcv")
        return fkdo.getString("SAVED_URL", vokcv).toString()
    }

    @SuppressLint("SetJavaScriptEnabled")
    private fun owkspld() {
        val dokf = qopwoke.settings
        dokf.loadWithOverviewMode = true
        dokf.displayZoomControls = false
        dokf.setSupportZoom(true)
        dokf.setAppCacheEnabled(true)

        dokf.javaScriptEnabled = true
        dokf.builtInZoomControls = true
        dokf.domStorageEnabled = true

        dokf.setSupportMultipleWindows(false)
        dokf.userAgentString = dokf.userAgentString.replace("; wv", "")
        dokf.allowContentAccess = true
        dokf.allowFileAccess = true

        dokf.pluginState = WebSettings.PluginState.ON
        dokf.mixedContentMode = WebSettings.MIXED_CONTENT_ALWAYS_ALLOW

        dokf.javaScriptCanOpenWindowsAutomatically = true

        dokf.useWideViewPort = true

    }

    private fun forkodkspl(xozk: String): Boolean {

        val qopwk = packageManager
        try {

            qopwk.getPackageInfo("org.telegram.messenger", PackageManager.GET_ACTIVITIES)

            return true
        } catch (e: PackageManager.NameNotFoundException) {

        }
        return false
    }
    fun fokrijd(xzpcl: String?) {
        if (!xzpcl!!.contains("t.me")) {

            if (ovkc == "") {
                ovkc = getSharedPreferences(
                    "SP_WEBVIEW_PREFS",
                    AppCompatActivity.MODE_PRIVATE
                ).getString(
                    "SAVED_URL",
                    xzpcl
                ).toString()

                val doke = getSharedPreferences("SP_WEBVIEW_PREFS", AppCompatActivity.MODE_PRIVATE)
                val qpldasok = doke.edit()
                qpldasok.putString("SAVED_URL", xzpcl)
                qpldasok.apply()
            }
        }
    }


    override fun onBackPressed() {


        if (qopwoke.canGoBack()) {
            if (vokcbko) {
                qopwoke.stopLoading()
                qopwoke.loadUrl(ovkc)
            }
            this.vokcbko = true
            qopwoke.goBack()
            Handler(Looper.getMainLooper()).postDelayed(Runnable {
                vokcbko = false
            }, 2000)

        } else {
            super.onBackPressed()
        }
    }




    private fun rpekosd(wplsd: String) {
        OneSignal.setExternalUserId(
            wplsd,
            object : OneSignal.OSExternalUserIdUpdateCompletionHandler {
                override fun onSuccess(dfkoc: JSONObject) {
                    try {
                        if (dfkoc.has("push") && dfkoc.getJSONObject("push").has("success")) {
                            val plokkoxz = dfkoc.getJSONObject("push").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for push status: $plokkoxz"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (dfkoc.has("email") && dfkoc.getJSONObject("email").has("success")) {
                            val xijc =
                                dfkoc.getJSONObject("email").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for email status: $xijc"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (dfkoc.has("sms") && dfkoc.getJSONObject("sms").has("success")) {
                            val wplsdokos = dfkoc.getJSONObject("sms").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for sms status: $wplsdokos"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                }

                override fun onFailure(error: OneSignal.ExternalIdError) {
                    OneSignal.onesignalLog(
                        OneSignal.LOG_LEVEL.VERBOSE,
                        "Set external user id done with error: $error"
                    )
                }
            })
    }


}