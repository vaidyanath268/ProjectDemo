package com.vaidu.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Rigister extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rigister);
    }

    public void RS(View view) {
        Toast.makeText(this, "Register Sucessfully", Toast.LENGTH_SHORT).show();
    }
}
