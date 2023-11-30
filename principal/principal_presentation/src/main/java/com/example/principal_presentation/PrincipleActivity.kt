package com.example.principal_presentation

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.commonutils.appLevelNavigation.Navigator

class PrincipleActivity : AppCompatActivity() {

    companion object {
        fun launchActivity(activity: Activity) {
            activity.startActivity(Intent(activity, PrincipleActivity::class.java))
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principle)
    }
}

object GoToPrincipleActivity : Navigator {
    override fun navigate(activity: Activity) {
        PrincipleActivity.launchActivity(activity)
    }

}