package com.abhishek.garagenearme;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class Gregistration extends AppCompatActivity {

    EditText e1,e2,e3,e4,e5;
    Button b;
    Spinner s1,s2,s3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gregistration);

        e1=findViewById(R.id.egaragename);
        e2=findViewById(R.id.eownername);
        e3=findViewById(R.id.eaddress);
        e4=findViewById(R.id.eadditional);
        e5=findViewById(R.id.ephone);

        s1=findViewById(R.id.espinner2);
        s2=findViewById(R.id.espinner3);
        s3=findViewById(R.id.spinner100);

        b=findViewById(R.id.insert);



        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final String eg=e1.getText().toString();
                final String eo=e2.getText().toString();
                final String ea=e3.getText().toString();
                final String eadd=e4.getText().toString();
                final String ep=e5.getText().toString();

                final String ec=s1.getSelectedItem().toString();
                final String es=s2.getSelectedItem().toString();
                final String ecat=s3.getSelectedItem().toString();


                Intent myMail = new Intent(Intent.ACTION_SEND);
                myMail.setData(Uri.parse("mail to:"));
                myMail.setType("message/rfc822");
                String to="guravashish80@gmail.com";
                String sub="Registration for E-garage:";
                myMail.putExtra(Intent.EXTRA_EMAIL,new String[]{to});
                myMail.putExtra(Intent.EXTRA_SUBJECT,sub);
                myMail.putExtra(Intent.EXTRA_TEXT,"Heyy.. I want to register my garage on your application, Details are as follows\n" +
                        "Garage name: "+eg+"\nOwner name: "+eo+"\nService: "+es+"\nCategory: "+ecat+"\nDetails: "+eadd+"\nCity: "+ec+"\nAddress: "+ea+"\n Phone number: "+ep);
                startActivity(Intent.createChooser(myMail,"send email"));
            }
        });

    }
}
