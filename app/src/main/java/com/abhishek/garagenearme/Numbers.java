package com.abhishek.garagenearme;

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

public class Numbers extends AppCompatActivity {

    EditText e1,e2;
    Spinner s1;
    Button b1;

    AddNumbers addNumbers;

    FirebaseDatabase database;
    DatabaseReference ref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        e1=findViewById(R.id.ed1);
        e2=findViewById(R.id.ed2);
        s1=findViewById(R.id.spinner6);
        b1=findViewById(R.id.numadd);

        database = FirebaseDatabase.getInstance();
        addNumbers= new AddNumbers();
        ref = database.getReference("Numbers");

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


        String name= e1.getText().toString();
        String number=e2.getText().toString();
        String cat=s1.getSelectedItem().toString();



        AddNumbers addNumbers=new AddNumbers(cat,name,number);
        ref.child(name).setValue(addNumbers);

        Toast.makeText(Numbers.this,"Added Successfully!",Toast.LENGTH_LONG).show();
    }
}
