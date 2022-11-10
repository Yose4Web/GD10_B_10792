package com.danan.gd10_b_10792

import com.google.gson.annotations.SerializedName

data class ResponseCreate(
    @SerializedName("status") val stt:Int,
    @SerializedName("error") val e:Boolean,
    @SerializedName("message") val pesan:String,
)