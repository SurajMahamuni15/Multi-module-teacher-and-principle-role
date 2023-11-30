package com.example.teacher_presentation

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.commonutils.appLevelNavigation.Navigator

class TeacherActivity : AppCompatActivity() {

    companion object {
        fun launchActivity(activity: Activity) {
            activity.startActivity(Intent(activity, TeacherActivity::class.java))
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_teacher)
    }
}

object GoToTeacherActivity : Navigator {
    override fun navigate(activity: Activity) {
        TeacherActivity.launchActivity(activity)
    }

}