package com.example.blooddonationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.blooddonationapp.databinding.ActivityRecipientRegistrationBinding;

public class RecipientRegistrationActivity extends AppCompatActivity {
    ActivityRecipientRegistrationBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRecipientRegistrationBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.backButton.setOnClickListener(view1 -> {
            Intent intent = new Intent(RecipientRegistrationActivity.this, LoginActivity.class);
            startActivity(intent);
        });
    }
}