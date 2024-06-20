package com.example.digitall.Activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.WindowManager;

import com.example.digitall.R;
import com.example.digitall.Fragments.HomePage.ChatBotFragment;
import com.example.digitall.Fragments.HomePage.ForumFragment;
import com.example.digitall.Fragments.HomePage.HomeFragment;
import com.example.digitall.Fragments.HomePage.QueriesFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {
    BottomNavigationView bottomNavigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
        loadFragment(new HomeFragment());
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Fragment fragment = null;
        switch (item.getItemId()) {
            case R.id.homeMenu:
                fragment = new HomeFragment();
                break;
            case R.id.chatBotMenu:
                fragment = new ChatBotFragment();
                break;
            case R.id.forumMenu:
                fragment = new ForumFragment();
                break;
            case R.id.queriesMenu:
                fragment = new QueriesFragment();
                break;
        }
        if (fragment != null) {
            loadFragment(fragment);
        }
        return true;
    }

    void loadFragment(Fragment fragment) {
        //to attach fragment
        getSupportFragmentManager().beginTransaction().replace(R.id.flFragment, fragment).commit();
    }
}