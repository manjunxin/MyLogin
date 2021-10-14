package com.example.mylogin;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
public class MainLogin extends AppCompatActivity implements View.OnClickListener {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        Button login = findViewById(R.id.loginbtn);
        login.setOnClickListener(this);
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);
        dialog.setTitle("登录");
        dialog.setIcon(R.drawable.ic_launcher_background);
        dialog.show();
    }

    @Override
    public void onClick(View view) {

    }
}
