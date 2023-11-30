package com.example.teacherandprincipal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.commonutils.appLevelNavigation.Activities
import com.example.commonutils.appLevelNavigation.Navigator
import com.example.teacherandprincipal.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private var _binding: ActivityMainBinding? = null

    private val binding get() = _binding!!

    @Inject
    lateinit var provider: Navigator.Provider


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.navigateToTeacherScreen.setOnClickListener {
            provider.getActivities(Activities.TeacherActivity).navigate(this)
        }
        binding.navigateToPrincipleScreen.setOnClickListener {
            provider.getActivities(Activities.PrincipleActivity).navigate(this)
        }
    }
}