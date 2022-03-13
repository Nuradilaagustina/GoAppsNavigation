package com.example.goapps.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.goapps.R;

public class LoginActivity extends AppCompatActivity {

    ImageButton login;
    EditText username, password;

    protected void onCreate(Bundle saveInstanState){
        super.onCreate(saveInstanState);

        setContentView(R.layout.login_relative);

        login = (ImageButton) findViewById(R.id.login);
        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (password.getText().toString().toUpperCase().equals("TEST1")){

                    login_sukses();
              } else {

                Toast.makeText(getApplicationContext(), "Salah Password", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }


    private void login_sukses() {
        String user_login = username.getText().toString();
        Intent i = new Intent(this,MainActivity.class);
        // kirim username ke tampilan utama
        i.putExtra("USERNAME", user_login);
        startActivity(i);
    }
}



