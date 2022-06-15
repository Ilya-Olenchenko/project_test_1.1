package com.example.project_test_11;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;


import com.example.project_test_11.databinding.ActivityMainNavigationBinding;
import com.example.project_test_11.ui.sleep.SleepFragment;
import com.example.project_test_11.ui.home.HomeFragment;
import com.example.project_test_11.ui.notifications.MusicFragment;
import com.example.project_test_11.ui.statistics.StatisticsFragment;

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
                    replaceFragment(new SleepFragment());
                    break;
                case R.id.navigation_music:
                    replaceFragment(new MusicFragment());
                    break;
                case R.id.navigation_statistics:
                    replaceFragment(new StatisticsFragment());
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