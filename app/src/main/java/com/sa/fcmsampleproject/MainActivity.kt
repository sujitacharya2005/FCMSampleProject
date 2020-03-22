package com.sa.fcmsampleproject

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.iid.FirebaseInstanceId
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    companion object {
        val TAG = MainActivity.javaClass.simpleName;
    }

    private var mFcmToken:String?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        FirebaseInstanceId.getInstance().instanceId.addOnSuccessListener {
            instanceIdResult->
                val deviceToken = instanceIdResult.token
            Log.i(TAG, "Success ..Token ->  $mFcmToken")
        }

        get_token.setOnClickListener{
            Log.i(TAG, "onClick Token ->  $mFcmToken")
        }
    }
}
