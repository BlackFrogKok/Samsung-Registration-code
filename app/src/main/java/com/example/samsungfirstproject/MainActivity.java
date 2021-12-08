package com.example.samsungfirstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.samsungfirstproject.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private String login;
    private String password;
    private static String truePassword = "1234";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.entranceButton.setOnClickListener(v -> checkLogin());
    }
    private void checkLogin(){
        login = binding.inputLogin.getText().toString();
        password = binding.inputPassword.getText().toString();
        if (!password.equals(truePassword)){
            binding.errorStatus.setTextColor(getResources().getColor(R.color.red));
            binding.errorStatus.setText(R.string.incorectData);
            binding.errorStatus.setVisibility(View.VISIBLE);
            startSecondActivity();
        }
        else {
            binding.errorStatus.setTextColor(getResources().getColor(R.color.green));
            binding.errorStatus.setText(R.string.corectData);
            binding.errorStatus.setVisibility(View.VISIBLE);
        }
    }
    private void startSecondActivity() {
        Intent intent = new Intent(this, RegistrationActivity.class); // создаём намерение
        startActivity(intent); // стартуем
    }
}