package com.example.nadia.dawrycomplaindemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Laws extends AppCompatActivity {

    Button back_l,l1,l2,l3,l4,l5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laws);
        back_l= (Button) findViewById(R.id.back_l_c);
        l1= (Button) findViewById(R.id.law1_c);
        l2= (Button) findViewById(R.id.law2_c);
        l3= (Button) findViewById(R.id.law3_c);
        l4= (Button) findViewById(R.id.law4_c);
        l5= (Button) findViewById(R.id.law5_c);


        back_l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent l_back = new Intent(Laws.this,MainActivity.class);
                startActivity(l_back);
            }
        });
        l1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ll1 = new Intent(Laws.this,Law1.class);
                startActivity(ll1);
            }
        });
        l2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ll2 = new Intent(Laws.this,Law2.class);
                startActivity(ll2);
            }
        });
        l3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ll3 = new Intent(Laws.this,Law3.class);
                startActivity(ll3);
            }
        });
        l4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ll4 = new Intent(Laws.this,Law4.class);
                startActivity(ll4);
            }
        });
        l5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ll5 = new Intent(Laws.this,Law5.class);
                startActivity(ll5);
            }
        });
    }
}
