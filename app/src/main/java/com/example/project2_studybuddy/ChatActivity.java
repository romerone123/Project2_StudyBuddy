package com.example.project2_studybuddy;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ChatActivity extends AppCompatActivity {

    private LinearLayout chatMessagesLayout;
    private EditText messageInput;
    private Button sendButton;
    private TextView selectedGroupText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        chatMessagesLayout = findViewById(R.id.chatMessagesLayout);
        messageInput = findViewById(R.id.messageInput);
        sendButton = findViewById(R.id.sendButton);
        selectedGroupText = findViewById(R.id.selectedGroupText); // This TextView will display the group name

        // Get the selected group name from the intent
        String selectedGroup = getIntent().getStringExtra("selectedGroup");
        if (selectedGroup != null) {
            selectedGroupText.setText("Messaging group: " + selectedGroup);
        }

        // Send Button onClickListener
        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = messageInput.getText().toString().trim();
                if (!message.isEmpty()) {
                    addMessageToChat(message);
                    messageInput.setText(""); // Clear input field after sending
                }
            }
        });
    }

    private void addMessageToChat(String message) {
        // Create a new TextView for the message
        TextView messageTextView = new TextView(this);
        messageTextView.setText(message);
        messageTextView.setPadding(16, 16, 16, 16);  // Optional: padding for message

        // Add the message TextView to the LinearLayout
        chatMessagesLayout.addView(messageTextView);
    }
}