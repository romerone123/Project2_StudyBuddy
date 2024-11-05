package com.example.project2_studybuddy;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import androidx.viewpager2.widget.ViewPager2;

public class DashboardActivity extends AppCompatActivity {

    /*@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        TabLayout tabLayout = findViewById(R.id.tabLayout);

        // Add tabs for "My Groups," "Sessions," and "Resources"
        tabLayout.addTab(tabLayout.newTab().setText("My Groups"));
        tabLayout.addTab(tabLayout.newTab().setText("Sessions"));
        tabLayout.addTab(tabLayout.newTab().setText("Resources"));

        // Set a listener to handle tab selections
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                switch (tab.getPosition()) {
                    case 0:
                        // Navigate to MyGroupsActivity
                        startActivity(new Intent(DashboardActivity.this, MyGroupsActivity.class));
                        break;
                    case 1:
                        // Navigate to SessionsActivity
                        startActivity(new Intent(DashboardActivity.this, SessionsActivity.class));
                        break;
                    case 2:
                        // Navigate to ResourcesActivity
                        startActivity(new Intent(DashboardActivity.this, ResourcesActivity.class));
                        break;
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {}

            @Override
            public void onTabReselected(TabLayout.Tab tab) {}
        });
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        TabLayout tabLayout = findViewById(R.id.tabLayout);
        ViewPager2 viewPager = findViewById(R.id.viewPager);

        // Create an adapter for the ViewPager2
        FragmentPagerAdapter adapter = new FragmentPagerAdapter(this);
        viewPager.setAdapter(adapter);

        // Set up the TabLayout with the ViewPager2
        new TabLayoutMediator(tabLayout, viewPager,
                (tab, position) -> {
                    switch (position) {
                        case 0:
                            tab.setText("My Groups");
                            break;
                        case 1:
                            tab.setText("Sessions");
                            break;
                        case 2:
                            tab.setText("Resources");
                            break;
                    }
                }).attach();

    }
}
