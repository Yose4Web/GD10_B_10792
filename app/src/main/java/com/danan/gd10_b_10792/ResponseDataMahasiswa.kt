package com.danan.gd10_b_10792

import com.google.gson.annotations.SerializedName

data class ResponseDataMahasiswa (
    @SerializedName("status") val stt:String,
    val totaldata: Int,
    val data:List<MahasiswaData>
)
