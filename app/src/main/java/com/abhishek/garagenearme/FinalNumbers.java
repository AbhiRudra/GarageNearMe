package com.abhishek.garagenearme;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class FinalNumbers extends AppCompatActivity {


    ListView listView;
    FirebaseDatabase database;
    DatabaseReference ref;
    AddNumbers addNumbers;
    List<AddNumbers> numbersList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_numbers);

        database = FirebaseDatabase.getInstance();
        addNumbers= new AddNumbers();
        ref = database.getReference("Numbers");
        listView=findViewById(R.id.listViewa);
        numbersList= new ArrayList<>();

        Toast.makeText(getApplicationContext(),"Important Contact details!",Toast.LENGTH_LONG).show();

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String phonenumber= ((TextView)view.findViewById(R.id.textnum)).getText().toString();
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:"+phonenumber));
                startActivity(intent);
                finish();
            }
        });


    }


    @Override
    protected void onStart() {
        super.onStart();
        ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                for (DataSnapshot ds: dataSnapshot.getChildren()){
                    AddNumbers addNumbers= ds.getValue(AddNumbers.class);

                    numbersList.add(addNumbers);

                }

                Numberlist adapter=new Numberlist(FinalNumbers.this,numbersList);
                listView.setAdapter(adapter);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }
}

