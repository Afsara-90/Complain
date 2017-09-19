package com.example.nadia.dawrycomplaindemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Spinner sp;
    Button c,a,l;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        c = (Button) findViewById(R.id.complainButton);
        a = (Button) findViewById(R.id.authorButton);
        l= (Button) findViewById(R.id.lawsButton);


        c.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Complain.class);
                startActivity(intent);
            }
        });

        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Author = new Intent(MainActivity.this,Author.class);
                startActivity(Author);
            }
        });
        l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ll = new Intent(MainActivity.this,Laws.class);
                startActivity(ll);
            }
        });
    }

}
