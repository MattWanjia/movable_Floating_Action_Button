package com.example.movablefab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.CharacterPickerDialog;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    MovableFloatingActionButton movableFloatingActionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        movableFloatingActionButton = findViewById(R.id.fab);
        movableFloatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "ADD ACTION HERE", Toast.LENGTH_SHORT).show();
            }
        });

    }
}