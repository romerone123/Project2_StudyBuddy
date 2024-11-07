package com.example.project2_studybuddy;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.fragment.app.Fragment;

public class SessionsFragment extends Fragment {

    private Button messageTeammatesButton;

    public SessionsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_sessions, container, false);

        // Initialize the "Message Teammates" button
        messageTeammatesButton = view.findViewById(R.id.messageTeammatesButton);

        // Set the click listener for the button to open ChatActivity
        messageTeammatesButton.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), ChatActivity.class);
            startActivity(intent);
        });

        return view;
    }
}

