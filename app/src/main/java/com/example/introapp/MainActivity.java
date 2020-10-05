package com.example.introapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv_forgetpass;
    Button btn_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_forgetpass = (TextView) findViewById(R.id.forget_text);
        btn_login = (Button) findViewById(R.id.btn_login);
        tv_forgetpass.setPaintFlags(tv_forgetpass.getPaintFlags() |   Paint.UNDERLINE_TEXT_FLAG);


       btn_login.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent = new Intent(MainActivity.this,NextLogin.class);
               startActivity(intent);

           }
       });
    }
}