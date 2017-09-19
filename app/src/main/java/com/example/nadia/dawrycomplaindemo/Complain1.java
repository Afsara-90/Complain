package com.example.nadia.dawrycomplaindemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Complain1 extends AppCompatActivity {

    RadioGroup rg;
    RadioButton rb;
    Button back_c1,send_c1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complain1);
        rg=(RadioGroup) findViewById(R.id.complainType);
        back_c1 = (Button) findViewById(R.id.back_c1_c);
        send_c1 = (Button) findViewById(R.id.send_c1_c);

        send_c1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(),"Message has been sent",Toast.LENGTH_SHORT).show();
            }
        });

        back_c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent c1_back = new Intent(Complain1.this,Author_page.class);
                startActivity(c1_back);
            }
        });

    }
    public void rbclick (View v){
        int rbId = rg.getCheckedRadioButtonId();
        rb = (RadioButton) findViewById(rbId);
         if(rb==findViewById(R.id.savedType))
         Toast.makeText(getApplicationContext(),"This type of complain has come before",Toast.LENGTH_SHORT).show();
          else
        Toast.makeText(getBaseContext(),"The complain has been saved", Toast.LENGTH_SHORT).show();
    }

}
