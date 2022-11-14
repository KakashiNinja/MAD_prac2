package com.example.mihir_mad_p_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private val TAG = "Hello toast!"

    //Toast.makeText(applicationContext, TAG, duration).show()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showMessage("onCreate is called!")
    }

    private fun showMessage(msg:String){
        Log.i(TAG,msg)
        Toast.makeText(this,msg,Toast.LENGTH_LONG).show()
        Snackbar.make(findViewById(R.id.CL1),msg,Snackbar.LENGTH_LONG).show()
    }

    override fun onStart() {
        super.onStart()
        showMessage("onStart is called!")
    }

    override fun onStop() {
        super.onStop()
        showMessage("onStop is called!")
    }

    override fun onResume() {
        super.onResume()
        showMessage("onResume is called!")
    }

    override fun onPause() {
        super.onPause()
        showMessage("onPause is called!")
    }

    override fun onDestroy() {
        super.onDestroy()
        showMessage("onDestroy is called!")
    }
}