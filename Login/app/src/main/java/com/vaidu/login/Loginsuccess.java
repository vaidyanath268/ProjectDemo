package com.vaidu.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Loginsuccess extends AppCompatActivity {
 TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginsuccess);
        Intent intent=getIntent();
        intent.getStringExtra("Rollnumber");
        txt=findViewById(R.id.view);
        txt.append(intent.getStringExtra("Rollnumber"));

    }
}
