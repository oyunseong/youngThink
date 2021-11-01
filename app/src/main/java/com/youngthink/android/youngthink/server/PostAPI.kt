package com.youngthink.android.youngthink.server

import com.youngthink.android.youngthink.model.ChangePlzResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface PostAPI {

    @GET("app/users/miggle/dart/")
    fun getDart(
        @Query("crtfc_key") crtfc_key: String?,
        @Query("corp_code") corp_code: String?,
        @Query("bsns_year") bsns_year: Int,
        @Query("reprt_code") reprt_code: Int
    ): Call<ChangePlzResponse?>?
    // call 안에 response가 들어가야함
}