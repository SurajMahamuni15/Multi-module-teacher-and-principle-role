package com.example.teacherandprincipal

import com.example.commonutils.appLevelNavigation.Activities
import com.example.commonutils.appLevelNavigation.Navigator
import com.example.principal_presentation.GoToPrincipleActivity
import com.example.teacher_presentation.GoToTeacherActivity

class DefaultNavigator : Navigator.Provider {
    override fun getActivities(activities: Activities): Navigator {
        return when (activities) {
            Activities.PrincipleActivity -> GoToPrincipleActivity
            Activities.TeacherActivity -> GoToTeacherActivity
        }
    }
}