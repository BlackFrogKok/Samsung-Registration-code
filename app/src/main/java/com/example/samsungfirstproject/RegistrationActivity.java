package com.example.samsungfirstproject;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.example.samsungfirstproject.databinding.RegistrationActivityBinding;

public class RegistrationActivity extends AppCompatActivity {
    private RegistrationActivityBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = RegistrationActivityBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

    }

}
