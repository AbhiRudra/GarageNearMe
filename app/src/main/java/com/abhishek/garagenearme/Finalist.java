package com.abhishek.garagenearme;

import android.content.Intent;
import android.net.Uri;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class Finalist extends AppCompatActivity {

    ListView listView;
    FirebaseDatabase database;
    DatabaseReference ref;
    AddGarage addGarage;

    List<AddGarage>garageList;


   String e1,e2,e3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finalist);


        database = FirebaseDatabase.getInstance();
        addGarage= new AddGarage();
        ref = database.getReference("Garages");
        listView=findViewById(R.id.listview);
        garageList= new ArrayList<>();
        Intent intent= getIntent();
        e1=intent.getStringExtra("e1");
        e2=intent.getStringExtra("e2");
        e3=intent.getStringExtra("e3");


        Toast.makeText(getApplicationContext(),e2,Toast.LENGTH_LONG).show();


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String phonenumber= ((TextView)view.findViewById(R.id.textphone)).getText().toString();
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
            AddGarage addGarage= ds.getValue(AddGarage.class);

                if(addGarage.getCity().equals(e1) && addGarage.getService().equals(e2) && addGarage.getCategory().equals(e3)) {
                    garageList.add(addGarage);
                }
        }

        Garagelist adapter=new Garagelist(Finalist.this,garageList);
        listView.setAdapter(adapter);
    }

    @Override
    public void onCancelled(DatabaseError databaseError) {

    }
});
    }
}
