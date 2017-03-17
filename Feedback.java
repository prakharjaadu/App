package com.example.prakhar.loginregister;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Feedback extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);

    }

    public void send_click(View v)
    {
        EditText name=(EditText) findViewById(R.id.etname);
        EditText email=(EditText) findViewById(R.id.etemail);
        EditText sub=(EditText) findViewById(R.id.etsub);
        EditText feedback=(EditText) findViewById(R.id.etfeed);
        Button submit= (Button) findViewById(R.id.bfeed);
        if (name.getText().toString().equals(""))
            name.setError("Enter your name ");
        else if (email.getText().toString().equals(""))
            email.setError(" Enter your E-mail");

        else if (sub.getText().toString().equals(""))
            sub.setError("Enter the event name ");

        else if (feedback.getText().toString().equals(""))
            feedback.setError("Give your feedback");
        else{
            Intent i = new Intent(Intent.ACTION_SENDTO);
            i.setData(Uri.parse("mailto:"));
            i.putExtra(Intent.EXTRA_EMAIL, new String[]  {"prakhargupta4319@gmail.com"});
            i.putExtra(Intent.EXTRA_SUBJECT, sub.getText().toString());
            i.putExtra(Intent.EXTRA_TEXT, "dear Sir,\n"
            +feedback.getText().toString()+"\n regards, "
            +email.getText().toString());

            try{
                startActivity(Intent.createChooser(i,"send mail"));
            }catch (android.content.ActivityNotFoundException ex)
            {
                Toast.makeText(this,"no email app found", Toast.LENGTH_SHORT).show();
            }catch (Exception ex)
            {
                Toast.makeText(this,"unexpected error" + ex.toString(),  Toast.LENGTH_SHORT).show();
            }
        }



    }
}
