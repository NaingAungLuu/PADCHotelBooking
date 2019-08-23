package com.androboy.padchotelbooking.activities;

import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.annotation.NonNull;
import android.view.MenuItem;

import com.androboy.padchotelbooking.R;
import com.androboy.padchotelbooking.fragments.ExploreFragment;
import com.androboy.padchotelbooking.fragments.HomeFragment;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView navView;
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home: loadFragment(new HomeFragment());
                    return true;
                case R.id.navigation_explore: loadFragment(new ExploreFragment());
                    return true;
                case R.id.navigation_events:
                    return true;
                case R.id.navigation_saved:
                    return true;

            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        navView = findViewById(R.id.nav_view);
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        loadFragment(new HomeFragment());


    }

    private boolean loadFragment(Fragment fragment) {
        //switching fragment
        if (fragment != null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_main, fragment)
                    .commit();
            return true;
        }
        return false;
    }

}
