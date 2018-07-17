package com.abhishek.garagenearme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class vehiclemain extends AppCompatActivity {

    Spinner s,s1,s2;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vehiclemain);

        s=findViewById(R.id.spinner);
        s1=findViewById(R.id.spinner4);
        s2=findViewById(R.id.spinner5);

        b=findViewById(R.id.search);

        ArrayAdapter<CharSequence> adapter= ArrayAdapter.createFromResource(this,R.array.cities,R.layout.support_simple_spinner_dropdown_item);
        adapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        s.setAdapter(adapter);

        ArrayAdapter<CharSequence> adaptera= ArrayAdapter.createFromResource(this,R.array.Services,R.layout.support_simple_spinner_dropdown_item);
        adaptera.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        s1.setAdapter(adaptera);

        ArrayAdapter<CharSequence> adapterb= ArrayAdapter.createFromResource(this,R.array.Category,R.layout.support_simple_spinner_dropdown_item);
        adapterb.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        s2.setAdapter(adapterb);


        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a=s.getSelectedItem().toString();
                String aa=s1.getSelectedItem().toString();
                String aaa=s2.getSelectedItem().toString();


                Intent toy=new Intent(vehiclemain.this,Finalist.class);
                toy.putExtra("e1",a);
                toy.putExtra("e2",aa);
                toy.putExtra("e3",aaa);
                startActivity(toy);
            }
        });

    }
}
