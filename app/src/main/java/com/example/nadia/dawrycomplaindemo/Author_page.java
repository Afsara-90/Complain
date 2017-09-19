package com.example.nadia.dawrycomplaindemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Author_page extends AppCompatActivity {

    Button back_ap, logout_ap,com1,com2,com3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_author_page);



        logout_ap = (Button) findViewById(R.id.logout_ap_c);
        back_ap = (Button) findViewById(R.id.back_ap_c);
        com1 = (Button) findViewById(R.id.complain1_c);
        com2 = (Button) findViewById(R.id.complain2_c);
        com3 = (Button) findViewById(R.id.complain3_c);

        com1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent ap_com1 = new Intent(Author_page.this,Complain1.class);
                startActivity(ap_com1);
            }
        });

        com2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent ap_com2 = new Intent(Author_page.this,Complain2.class);
                startActivity(ap_com2);
            }
        });

        com3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent ap_com2 = new Intent(Author_page.this,Complain3.class);
                startActivity(ap_com2);
            }
        });

        logout_ap.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent ap_logout = new Intent(Author_page.this,Login.class);
                startActivity(ap_logout);
            }
        });

        back_ap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ap_back = new Intent(Author_page.this,Login.class);
                startActivity(ap_back);
            }
        });
    }


}
