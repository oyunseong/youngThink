package com.youngthink.android.youngthink.ui

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import com.youngthink.android.youngthink.MainActivity
import com.youngthink.android.youngthink.R
import com.youngthink.android.youngthink.base.BaseActivity
import com.youngthink.android.youngthink.databinding.ActivitySplashBinding

class SplashActivity : BaseActivity<ActivitySplashBinding>({ ActivitySplashBinding.inflate(it) }) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Handler().postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
            fadeAnim()
            overridePendingTransition(R.anim.nav_default_enter_anim, R.anim.nav_default_pop_exit_anim)
            finish()
        }, 800)
    }
}