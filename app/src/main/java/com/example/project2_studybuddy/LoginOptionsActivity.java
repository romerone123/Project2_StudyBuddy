package com.example.project2_studybuddy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import androidx.appcompat.app.AppCompatActivity;

public class LoginOptionsActivity extends AppCompatActivity {

    private ListView classesListView;
    private Button goToDashboardButton;
    private Button logOutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_options);

        // Initialize UI components
        classesListView = findViewById(R.id.classesListView);
        goToDashboardButton = findViewById(R.id.goToDashboardButton);
        logOutButton = findViewById(R.id.logOutButton);

        // Mock registered classes (replace with dynamic data if needed)
        String[] registeredClasses = {"Math 101", "CS 201", "History 303"};

        // Create an ArrayAdapter to bind the registered classes data to the ListView
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, registeredClasses);
        classesListView.setAdapter(adapter);

        // Set the click listener for the "Go to Dashboard" button
        goToDashboardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to the DashboardActivity
                Intent intent = new Intent(LoginOptionsActivity.this, DashboardActivity.class);
                startActivity(intent);
                finish();
            }
        });

        // Set the click listener for the "Log Out" button
        logOutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate back to the MainActivity (Login page)
                Intent intent = new Intent(LoginOptionsActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
