package com.example.nadia.dawrycomplaindemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Complain extends AppCompatActivity {

    Button cSub,cBack;
    EditText name_c;
    String name_s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complain2);
        cSub = (Button) findViewById(R.id.submit_c);
        cBack = (Button) findViewById(R.id.back_c);
        name_c= (EditText) findViewById(R.id.textFieldName_c);
        name_s =name_c.getText().toString().trim();
        cSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
               if(check()){
                   Toast.makeText(getApplicationContext(),"Complain has been submitted",Toast.LENGTH_SHORT).show();
               }
               else{
                   Toast.makeText(getApplicationContext(),"Complain",Toast.LENGTH_SHORT).show();
               }
            }
        });
        cBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent backToMain = new Intent(Complain.this,MainActivity.class);

                startActivity(backToMain);
            }
        });
    }
    public boolean check(){
        boolean b=true;
        if(name_s.isEmpty()){
            name_c.setError("Enter valid name");
            b=false;
        }
         return b;

    }
}
