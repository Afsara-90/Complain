package com.example.nadia.dawrycomplaindemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Author extends AppCompatActivity {

    Button b2m,reg_a,login_a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_author);
        b2m = (Button) findViewById(R.id.back_a);
        reg_a=(Button) findViewById(R.id.registration_b);
        login_a=(Button) findViewById(R.id.login_b);
        login_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a_login = new Intent(Author.this,Login.class);
                startActivity(a_login);
            }
        });
        reg_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a_reg = new Intent(Author.this,Author_reg.class);
                startActivity(a_reg);
            }
        });

        b2m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent B2Main = new Intent(Author.this,MainActivity.class);
                startActivity(B2Main);
            }
        });
    }

}
