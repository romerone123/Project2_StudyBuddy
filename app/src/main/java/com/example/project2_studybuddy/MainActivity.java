package com.example.project2_studybuddy;

import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Button loginButton = findViewById(R.id.loginButton);

        // Set an OnClickListener on the login button
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent to start the DashboardActivity
                Intent intent = new Intent(MainActivity.this, DashboardActivity.class);
                startActivity(intent);
                // Optionally, finish LoginActivity so it's removed from the back stack
                finish();
            }
        });
    }
}