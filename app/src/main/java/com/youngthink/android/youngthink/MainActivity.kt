package com.youngthink.android.youngthink

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.youngthink.android.youngthink.base.BaseActivity
import com.youngthink.android.youngthink.databinding.ActivityMainBinding
import com.youngthink.android.youngthink.model.ChangePlzResponse
import com.youngthink.android.youngthink.server.PostAPI
import com.youngthink.android.youngthink.server.RetrofitClient
import retrofit2.Call
import retrofit2.Response

class MainActivity : BaseActivity<ActivityMainBinding>({ ActivityMainBinding.inflate(it) }) {
    val postApiClient: PostAPI by lazy {
        RetrofitClient.getPostService
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initNavigation()

        postApiClient.getDart(
            crtfc_key = "b2ee4ac66008d7ebb5e87165604bae92cf554783",
            corp_code = "00164779",
            bsns_year = 2020,
            reprt_code = 11011,
        )!!.enqueue(object : retrofit2.Callback<ChangePlzResponse?> {
            override fun onResponse(
                call: Call<ChangePlzResponse?>,
                response: Response<ChangePlzResponse?>
            ) {
                val response: ChangePlzResponse? = response.body()
                Log.d("dartResponse", response.toString())
            }

            override fun onFailure(call: Call<ChangePlzResponse?>, t: Throwable) {
                Log.d("dartResponse", t.message.toString())
            }
        })


    }

    private fun initNavigation() {
        var navController = findNavController(R.id.main_nav_host)
        binding.mainBottomNavigation.setupWithNavController(navController)
        binding.mainBottomNavigation.itemIconTintList = null

        navController.addOnDestinationChangedListener { _, destination, _ ->
            if (destination.id == R.id.HomeTapFragment ||
                destination.id == R.id.BTapFragment ||
                destination.id == R.id.CTapFragment
            ) {
                binding.mainBottomNavigation.visibility = View.VISIBLE
            } else {
                binding.mainBottomNavigation.visibility = View.GONE
            }
        }
    }
}