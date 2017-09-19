package com.example.nadia.dawrycomplaindemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Complain3 extends AppCompatActivity {


    RadioGroup rg3;
    RadioButton rb3;
    Button send_c3,back_c3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complain4);

        rg3=(RadioGroup) findViewById(R.id.complainType3);
        back_c3 = (Button) findViewById(R.id.back_c3_c);
        send_c3 = (Button) findViewById(R.id.send_c3_c);

        send_c3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(),"Message has been sent", Toast.LENGTH_SHORT).show();
            }
        });

        back_c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent c3_back = new Intent(Complain3.this,Author_page.class);
                startActivity(c3_back);
            }
        });

    }
    public void rbclick3 (View v){
        int rbId3 = rg3.getCheckedRadioButtonId();
        rb3 = (RadioButton) findViewById(rbId3);
        if(rb3==findViewById(R.id.savedType3))
            Toast.makeText(getApplicationContext(),"This type of complain has come before",Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(getBaseContext(),"The complain has been saved", Toast.LENGTH_SHORT).show();
    }
}
