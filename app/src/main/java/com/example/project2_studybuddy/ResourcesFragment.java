package com.example.project2_studybuddy;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ResourcesFragment extends Fragment {

    private Button uploadButton;
    private Button downloadButton;

    public ResourcesFragment() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_resources, container, false);

        // Initialize buttons
        uploadButton = view.findViewById(R.id.uploadButton);
        downloadButton = view.findViewById(R.id.downloadButton);

        // Set up button listeners
        uploadButton.setOnClickListener(v -> {
            // Logic for file upload
            Toast.makeText(getContext(), "Upload functionality coming soon", Toast.LENGTH_SHORT).show();
        });

        downloadButton.setOnClickListener(v -> {
            // Logic for file download
            Toast.makeText(getContext(), "Download functionality coming soon", Toast.LENGTH_SHORT).show();
        });

        return view;
    }
}
