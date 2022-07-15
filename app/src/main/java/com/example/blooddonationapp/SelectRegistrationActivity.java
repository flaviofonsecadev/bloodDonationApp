package com.example.blooddonationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.blooddonationapp.databinding.ActivitySelectRegistrationBinding;

public class SelectRegistrationActivity extends AppCompatActivity {
    ActivitySelectRegistrationBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySelectRegistrationBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.donnorButton.setOnClickListener(view1 -> {
            Intent intent = new Intent(SelectRegistrationActivity.this, DonnorRegistrationActivity.class);
            startActivity(intent);
        });

        binding.recipientButton.setOnClickListener(view1 -> {
            Intent intent = new Intent(SelectRegistrationActivity.this, RecipientRegistrationActivity.class);
            startActivity(intent);
        });

        binding.backButton.setOnClickListener(view1 -> {
            Intent intent = new Intent(SelectRegistrationActivity.this, LoginActivity.class);
            startActivity(intent);
        });
    }
}