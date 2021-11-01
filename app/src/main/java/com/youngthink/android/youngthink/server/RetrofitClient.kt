package com.youngthink.android.youngthink.server

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


object RetrofitClient {

    private const val BASE_URL = "https://jsonplaceholder.typicode.com"
    private const val BASE_MIGGLE_URL = "http://www.developer-hyun.com/"

    val getPostService: PostAPI
        get() = instance.create(PostAPI::class.java)

    /**
     * 레트로핏 인스턴스 반환 메서드
     * 빌더 패턴으로 레트로핏 인스턴스를 생성
     *
     * @return
     */
    private val instance: Retrofit
        private get() {
            val gson = GsonBuilder().setLenient().create()
            return Retrofit.Builder()
                .baseUrl(BASE_MIGGLE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build()
        }
}