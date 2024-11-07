package com.example.project2_studybuddy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class GroupSelectionActivity extends AppCompatActivity {

    private LinearLayout groupsLayout;
    private String[] groups = {"Group 1", "Group 2", "Group 3", "Group 4"}; // Sample groups

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group_selection);

        groupsLayout = findViewById(R.id.groupsLayout);

        // Dynamically add buttons for each group
        for (String group : groups) {
            Button groupButton = new Button(this);
            groupButton.setText(group);
            groupButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Send the selected group to the ChatActivity
                    Intent intent = new Intent(GroupSelectionActivity.this, ChatActivity.class);
                    intent.putExtra("selectedGroup", group);
                    startActivity(intent);
                }
            });
            groupsLayout.addView(groupButton);
        }
    }
}
