package com.example.project_test_11;


import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;


import com.example.project_test_11.databinding.ActivityMainNavigationBinding;
import com.example.project_test_11.ui.dashboard.DashboardFragment;
import com.example.project_test_11.ui.home.HomeFragment;
import com.example.project_test_11.ui.notifications.NotificationsFragment;

public class MainNavigation extends AppCompatActivity {

   ActivityMainNavigationBinding binding;


    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        binding = ActivityMainNavigationBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        replaceFragment(new HomeFragment());
        binding.navView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()){
                case R.id.navigation_home:
                    replaceFragment(new HomeFragment());
                    break;
                case R.id.navigation_dashboard:
                    replaceFragment(new DashboardFragment());
                    break;
                case R.id.navigation_notifications:
                    replaceFragment(new NotificationsFragment());
                    break;
            }

            return  true;
        });
    }
    private void replaceFragment(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame_layout, fragment);
        fragmentTransaction.commit();
    }


}