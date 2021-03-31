package com.vaidu.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
 EditText e;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e=findViewById(R.id.roll);

    }

    public void login(View view) {
        Intent intent=new Intent(MainActivity.this,Loginsuccess.class);
        intent.putExtra("Rollnumber",e.getText().toString());
        startActivity(intent);
    }

    public void rg(View view) {
        Intent intent=new Intent(MainActivity.this,Rigister.class);
        startActivity(intent);
    }
}
