package com.example.project2_studybuddy;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class ResourcesActivity extends AppCompatActivity {

    private ViewPager2 viewPager;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resources);

        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.viewPager);

        // Setup ViewPager with FragmentPagerAdapter
        ViewPagerAdapter adapter = new ViewPagerAdapter(this);
        adapter.addFragment(new ResourcesFragment(), "Resources");
        // Add more fragments if necessary
        viewPager.setAdapter(adapter);

        // Setup TabLayout with ViewPager2
        new TabLayoutMediator(tabLayout, viewPager,
                (tab, position) -> {
                    // Set the tab text based on position
                    switch (position) {
                        case 0:
                            tab.setText("Resources");
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


public class ResourcesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resources); // Links to XML layout

        Button backToDashboardButton = findViewById(R.id.backToDashboardButton);

        backToDashboardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent to go back to DashboardActivity
                Intent intent = new Intent(ResourcesActivity.this, DashboardActivity.class);
                startActivity(intent);
                finish(); // Optional: Finish this activity to remove it from the back stack
            }
        });

    }
}*/
