package com.example.project2_studybuddy;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.fragment.app.Fragment;

public class MyGroupsFragment extends Fragment {

    private EditText groupNameInput;
    private EditText classInput;
    private Button createGroupButton;
    private Button logoutButton;

    public MyGroupsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_my_groups, container, false);

        groupNameInput = view.findViewById(R.id.groupNameInput);
        classInput = view.findViewById(R.id.classInput);
        createGroupButton = view.findViewById(R.id.createGroupButton);
        logoutButton = view.findViewById(R.id.logoutButton);  // Initialize logout button

        createGroupButton.setOnClickListener(v -> {
            String groupName = groupNameInput.getText().toString();
            String className = classInput.getText().toString();

            if (groupName.isEmpty() || className.isEmpty()) {
                Toast.makeText(getContext(), "Please fill in all fields", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(getContext(), "Group Created", Toast.LENGTH_SHORT).show();
            }
        });

        // Set the logout button's click listener
        logoutButton.setOnClickListener(v -> {
            // Log out and go back to login screen
            Intent intent = new Intent(getActivity(), MainActivity.class);  // Use getActivity() to access context
            startActivity(intent);
            getActivity().finish();  // Close the current activity/fragment
        });

        return view;
    }
}
