package com.example.blooddonationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.blooddonationapp.databinding.ActivityDonnorRegistrationBinding;
import com.example.blooddonationapp.databinding.ActivityRecipientRegistrationBinding;

public class DonnorRegistrationActivity extends AppCompatActivity {

    ActivityDonnorRegistrationBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDonnorRegistrationBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.backButton.setOnClickListener(view1 -> {
            Intent intent = new Intent(DonnorRegistrationActivity.this, LoginActivity.class);
            startActivity(intent);
        });

    }
}