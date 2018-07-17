package com.abhishek.garagenearme;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Abhi extends AppCompatActivity {

    String e1,e2,e3,e4,e5,e6,e7;
    TextView t1,t2,t3,t4,t5,t6;

    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abhi);

        t1=findViewById(R.id.namegarage);
        t2=findViewById(R.id.nameowner);
        t3=findViewById(R.id.nameservice);
        t4=findViewById(R.id.servicedetails);
        t5=findViewById(R.id.address);
        t6=findViewById(R.id.city);

        b1=findViewById(R.id.call);



        Intent intent= getIntent();
        e1=intent.getStringExtra("e1");
        e2=intent.getStringExtra("e2");
        e3=intent.getStringExtra("e3");
        e4=intent.getStringExtra("e4");
        e5=intent.getStringExtra("e5");
        e6=intent.getStringExtra("e6");
        e7=intent.getStringExtra("e7");

        t1.setText(e1);
        t2.setText(e2);
        t3.setText(e3);
        t4.setText(e4);
        t5.setText(e5);
        t6.setText(e6);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:"+e7));
                startActivity(intent);
            }
        });




    }
}
