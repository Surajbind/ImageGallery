package com.example.imagegallery;


import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.Gravity;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

public class Navi_drawer {
    private DrawerLayout mDrawerLayout;
    private NavigationView navigationView;
    String pic="";
    SharedPreferences preferences;

    public void nav(DrawerLayout mDrawerLayout, NavigationView navigationView) {

        final Context context = mDrawerLayout.getContext();

        navigationView.bringToFront();
        final DrawerLayout finalMDrawerLayout = mDrawerLayout;
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                item.setChecked(true);
                switch (item.getItemId()) {
                    // Respond to the action bar's Up/Home button
                    case R.id.recent:
                        Intent a = new Intent(context, MainActivity.class);
                        context.startActivity(a);
                        item.setChecked(false);
                        finalMDrawerLayout.closeDrawer(Gravity.START);
                        return true;
                }
                return false;
            }
        });



    }
}
