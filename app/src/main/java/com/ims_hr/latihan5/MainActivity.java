package com.ims_hr.latihan5;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button B_Submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Inisial();
        Listen_B_Submit();
    }

    private void Inisial() {
        B_Submit = findViewById(R.id.button_Main_Submit);
    }

    private void Listen_B_Submit() {
        B_Submit.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, DuaActivity.class);
            startActivity(intent);
        });
    }

}
