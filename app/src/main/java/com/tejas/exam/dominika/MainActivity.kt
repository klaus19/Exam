package com.tejas.exam.dominika

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.tejas.exam.R

class MainActivity : AppCompatActivity() {
    private var mDelayHandler : Handler? = null
    private var SPLASH_DELAY :Long = 3000 // 3 seconds

    internal val mRunnable : Runnable = Runnable {
        if(!isFinishing){
            val intent = Intent(applicationContext,HomeActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mDelayHandler = Handler()

        mDelayHandler !!.postDelayed(mRunnable,SPLASH_DELAY)
    }

    override fun onDestroy() {
        if (mDelayHandler !=null){
            mDelayHandler!!.removeCallbacks(mRunnable)
        }
        super.onDestroy()
    }
}