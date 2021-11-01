package com.youngthink.android.youngthink.base

import android.app.Activity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding
import com.youngthink.android.youngthink.R

abstract class BaseActivity<B: ViewBinding>(val bindingFactory: (LayoutInflater) -> B): AppCompatActivity(){
    private var _binding: B? =null
    val binding get() = _binding!!

    private val tag: String = this::class.java.name

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(tag, "++onCreate")
        _binding = bindingFactory(layoutInflater)
        setContentView(binding.root)
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.d(tag, "++onDestroy")
        _binding = null
    }

    fun showToast(str: String) {
        Toast.makeText(this, str, Toast.LENGTH_SHORT).show();
    }

    override fun onStart() {
        super.onStart()
        Log.d(tag, "++onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(tag, "++onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(tag, "++onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(tag, "++onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(tag, "++onRestart")
    }
    fun Activity.slideLeft(){
        overridePendingTransition(R.anim.slide_in_top, R.anim.slide_out_top)
    }
    fun Activity.fadeAnim(){
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out)
    }


}