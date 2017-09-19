package com.example.nadia.dawrycomplaindemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Author_reg extends AppCompatActivity {

    Button sub_a_r,back_a_r;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_author_reg);
        sub_a_r= (Button) findViewById(R.id.submit_ar_c);
        back_a_r= (Button) findViewById(R.id.back_ar_c);

        sub_a_r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Registration completed", Toast.LENGTH_SHORT).show();
            }
        });
        back_a_r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a_r_back = new Intent(Author_reg.this,Author.class);
                startActivity(a_r_back);
            }
        });
    }
}
