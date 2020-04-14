package com.example.regis;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.text.AlteredCharSequence;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.parse.LogInCallback;
import com.parse.ParseException;
import com.parse.ParseUser;

public class Login extends AppCompatActivity {

    public static final String TAG = "LoginActivity";
    private EditText etUsername;
    private EditText etPassword;
    private Button btnLogin;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        etUsername = findViewById(R.id.etUsename);
        etPassword = findViewById(R.id.etPassword);
        btnLogin = findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i(TAG, "onClick login button");
                String username = etUsername.getText().toString();
                String password = etPassword.getText().toString();
                loginUser(username, password);
            }

        });
    }
    private void loginUser(String username, String password) {
        Log.i(TAG, "Attemting to login user" + username);

        ParseUser.logInInBackground(username, password, new LogInCallback() {
            @Override
            public void done(ParseUser user, ParseException e) {
                if (e != null) {
                    //TODO better error handling
                    Log.e(TAG,"Issue with login", e);
                    Toast.makeText(Login.this,"Issue width login",Toast.LENGTH_SHORT).show();
                    return;
                }
            // TODO navigation to the main activity if the has signed in properly
                goMainActivity();
                Toast.makeText(Login.this,"Succes!",Toast.LENGTH_SHORT).show();
            }
        });
}

    private void goMainActivity() {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}




