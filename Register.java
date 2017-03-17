package com.example.prakhar.loginregister;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.style.EasyEditSpan;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity {
    public static final String MSG="details";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);



        final EditText name = (EditText) findViewById(R.id.etname);
        final EditText reg = (EditText) findViewById(R.id.etreg);
        final EditText contact = (EditText) findViewById(R.id.etnumber);
        final EditText email = (EditText) findViewById((R.id.etmail));
        final Button Register = (Button) findViewById(R.id.bregister);


        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loginintent = new Intent(Register.this, Login.class);
                startActivity(loginintent);

                Toast.makeText(Register.this, "Information saved", Toast.LENGTH_SHORT).show();

            }

        });
    }
}
