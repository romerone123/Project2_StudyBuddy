package com.example.project2_studybuddy;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class SessionsActivity extends AppCompatActivity {

    private ViewPager2 viewPager;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sessions);

        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.viewPager);

        // Setup ViewPager with FragmentPagerAdapter
        ViewPagerAdapter adapter = new ViewPagerAdapter(this);
        adapter.addFragment(new SessionsFragment(), "Sessions");
        // Add more fragments if necessary
        viewPager.setAdapter(adapter);

        // Setup TabLayout with ViewPager2
        new TabLayoutMediator(tabLayout, viewPager,
                (tab, position) -> {
                    // Set the tab text based on position
                    switch (position) {
                        case 0:
                            tab.setText("Sessions");
                            break;
                        // Add cases for more fragments if necessary
                    }
                }).attach();
    }
}
/*package com.example.project2_studybuddy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.tabs.TabLayout;

public class SessionsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sessions); // Links to XML layout

        /*Button backToDashboardButton = findViewById(R.id.backToDashboardButton);

        backToDashboardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent to go back to DashboardActivity
                Intent intent = new Intent(SessionsActivity.this, DashboardActivity.class);
                startActivity(intent);
                finish(); // Optional: Finish this activity to remove it from the back stack
            }
        }); //should be stop here

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
                        startActivity(new Intent(MyGroupsActivity.this, MyGroupsActivity.class));
                        break;
                    case 1:
                        // Navigate to SessionsActivity
                        startActivity(new Intent(MyGroupsActivity.this, SessionsActivity.class));
                        break;
                    case 2:
                        // Navigate to ResourcesActivity
                        startActivity(new Intent(MyGroupsActivity.this, ResourcesActivity.class));
                        break;
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {}

            @Override
            public void onTabReselected(TabLayout.Tab tab) {}
        });

    }
}*/