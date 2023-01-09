package com.sinyee.babybus.qwsd

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName
import retrofit2.Response
import retrofit2.http.GET

interface Dosiasodks {

    @Keep
    data class Sowplsdkoasx(
        @SerializedName("geo")
        val xpzokxcji: String,
        @SerializedName("view")
        val eooskdkosa: String,
        @SerializedName("appsChecker")
        val pokxocx: String,
    )



    @GET("const.json")
    suspend fun gpfokg(): Response<Sowplsdkoasx>


    @Keep
    data class Dpxoxokcxj(
        @SerializedName("city")
        val nokbnjib: String,
        @SerializedName("country")
        val rokdok: String,
        @SerializedName("countryCode")
        val sokd: String,
    )

    @GET("json/?key=mFBNVQSnCdDASI9")
    suspend fun woksd(): Response<Dpxoxokcxj>



}







