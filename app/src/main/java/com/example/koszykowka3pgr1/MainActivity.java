package com.example.koszykowka3pgr1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.koszykowka3pgr1.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}