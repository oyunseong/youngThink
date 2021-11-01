package com.youngthink.android.youngthink.model

class ChangePlzResponse(
    val isSuccess: Boolean? = null,
    val code: Int? = null,
    val message: String? = null,
    val result: Result
)

data class Result(
    val plusmoney: String? = null
)