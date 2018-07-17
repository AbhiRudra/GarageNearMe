package com.abhishek.garagenearme;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Garage extends AppCompatActivity {

    EditText e1,e2,e3,e4,e5;
    Spinner s1,s2,s3;

    Button b1;

    FirebaseDatabase database;
    DatabaseReference ref;
    AddGarage addGarage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_garage);




        e1 = findViewById(R.id.garagename);
        e2 = findViewById(R.id.ownername);
        e3 = findViewById(R.id.address);
        e4 = findViewById(R.id.phone);
        e5 = findViewById(R.id.additional);
        s1= findViewById(R.id.spinner2);
        s2 = findViewById(R.id.spinner3);
        s3 = findViewById(R.id.spinner100);

        b1 = findViewById(R.id.insert);

        database = FirebaseDatabase.getInstance();
        addGarage= new AddGarage();
        ref = database.getReference("Garages");


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ref.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {

                        getvalues();


                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                });
            }
        });
    }


        private void getvalues(){


        String g_name= e1.getText().toString();
        String o_name=e2.getText().toString();
        String city=s1.getSelectedItem().toString();
        String service=s2.getSelectedItem().toString();
        String address=e3.getText().toString();
        String phone=e4.getText().toString();
        String additional=e5.getText().toString();
        String category=s3.getSelectedItem().toString();




    AddGarage addGarage= new AddGarage(city,service,g_name,o_name,address,phone,additional,category);
        ref.child(g_name).setValue(addGarage);

        Toast.makeText(Garage.this,"Added Successfully!",Toast.LENGTH_LONG).show();
    }



}

