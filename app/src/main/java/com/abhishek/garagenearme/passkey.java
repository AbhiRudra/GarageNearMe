package com.abhishek.garagenearme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class passkey extends AppCompatActivity {

    Button b;
    EditText e;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passkey);

        b=findViewById(R.id.login);
        e=findViewById(R.id.pass);








        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String passa=e.getText().toString();
                final String valid="love@garage";
if(passa.equals(valid)) {
    Intent toy = new Intent(passkey.this, admina.class);
    startActivity(toy);
}

                else{
                    Toast.makeText(passkey.this,"Enter correct passkey!",Toast.LENGTH_LONG).show();
               }
            }
        });
    }
}
