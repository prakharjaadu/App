package com.example.prakhar.loginregister;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        final EditText username = (EditText) findViewById(R.id.etusername);
        final EditText password = (EditText) findViewById(R.id.etpassword);
        final TextView registerlink = (TextView) findViewById(R.id.tvregister);
        final TextView feedback = (TextView) findViewById(R.id.tvfeed);
        final Button login = (Button) findViewById(R.id.blogin);

        registerlink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent registerintent = new Intent(Login.this, Register.class);
                Login.this.startActivity(registerintent);

            }
        });
        feedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent feedbackintent = new Intent(Login.this, Feedback.class);
                Login.this.startActivity(feedbackintent);

            }


        });

    }
    public void onBackPressed(){
        createdialog();
    }
    private void createdialog(){
        AlertDialog.Builder alert= new AlertDialog.Builder(this);
        alert.setMessage("Are you sure want to exit?");
        alert.setCancelable(false);
        AlertDialog.Builder builder = alert.setPositiveButton("yes", new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialog, int which){
                Login.super.onBackPressed();
            }

        } );
        alert.setNegativeButton("No", new DialogInterface.OnClickListener(){

            @Override
            public void onClick(DialogInterface dialog,int which){


            }
        });
        alert.create().show();

    }

}

