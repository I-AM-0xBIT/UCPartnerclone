package com.abhis.ucpartner_clone;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.Window;
import android.widget.TextView;
import android.support.v7.widget.Toolbar;

public class HomePage extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        //setTheme(R.style.AppTheme2);

        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("Home Page");

        setSupportActionBar(toolbar);
        //this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        //requestWindowFeature(Window.FEATURE_NO_TITLE);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(this);

        loadFragment(new NewFragment());
    }

    private  boolean loadFragment(Fragment fragment)
    {
        if(fragment != null)
        {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,fragment).commit();
            return true;
        }
        return false;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        Fragment fragment = null;
        switch (item.getItemId())
        {
            case R.id.navigation_new:
                fragment = new NewFragment();
                break;

            case R.id.navigation_ongoing:
                fragment = new OngoingFragment();
                break;

            case R.id.navigation_profile:
                fragment = new ProfileFragment();
                break;

            case R.id.navigation_menu:
                fragment = new MenuFragment();
                break;
        }

        return loadFragment(fragment);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        System.exit(1);
    }
}
