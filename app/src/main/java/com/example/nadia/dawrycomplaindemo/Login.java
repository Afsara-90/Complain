package com.example.nadia.dawrycomplaindemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Login extends AppCompatActivity {

    Button log_al,back_al;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        log_al = (Button) findViewById(R.id.login_al_c);
        back_al = (Button) findViewById(R.id.back_al_c);


        log_al.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent al_log = new Intent(Login.this,Author_page.class);
                startActivity(al_log);
            }
        });

        back_al.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent al_back = new Intent(Login.this,MainActivity.class);
                startActivity(al_back);
            }
        });
    }
}
