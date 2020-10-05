package com.example.introapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NextLogin extends AppCompatActivity {
    Button btn_doted;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next_login);

        btn_doted = (Button) findViewById(R.id.doted_btn);

        btn_doted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NextLogin.this,WelcomeHome.class);
                startActivity(intent);
            }
        });
    }
}