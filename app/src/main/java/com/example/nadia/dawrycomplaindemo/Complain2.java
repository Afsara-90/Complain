package com.example.nadia.dawrycomplaindemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Complain2 extends AppCompatActivity {

    RadioGroup rg2;
    RadioButton rb2;
    Button back_c2,send_c2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complain2);
        rg2=(RadioGroup) findViewById(R.id.complainType2);
        back_c2 = (Button) findViewById(R.id.back_c2_c);
        send_c2 = (Button) findViewById(R.id.send_c2_c);

        send_c2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(),"Message has been sent",Toast.LENGTH_SHORT).show();
            }
        });

        back_c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent c2_back = new Intent(Complain2.this,Author_page.class);
                startActivity(c2_back);
            }
        });

    }
    public void rbclick2 (View v){
        int rbId2 = rg2.getCheckedRadioButtonId();
        rb2 = (RadioButton) findViewById(rbId2);
        if(rb2==findViewById(R.id.savedType2))
            Toast.makeText(getApplicationContext(),"This type of complain has come before",Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(getBaseContext(),"The complain has been saved", Toast.LENGTH_SHORT).show();
    }

}
