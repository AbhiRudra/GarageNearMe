package com.abhishek.garagenearme;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by abhishek on 9/4/18.
 */

public class Garagelist extends ArrayAdapter<AddGarage> {

    private Activity context;
    private List<AddGarage>garageList;

    public Garagelist(Activity context,List<AddGarage>garageList){
        super(context, R.layout.user_info,garageList);
        this.context=context;
        this.garageList=garageList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View listviewitem=inflater.inflate(R.layout.user_info,null,true);

        TextView textViewname= (TextView)listviewitem.findViewById(R.id.textgname);
        TextView textViewoname= (TextView)listviewitem.findViewById(R.id.textoname);
        TextView textViewservice= (TextView)listviewitem.findViewById(R.id.textservice);
        TextView textViewaddress= (TextView)listviewitem.findViewById(R.id.textaddress);
        TextView textViewphone= (TextView)listviewitem.findViewById(R.id.textphone);
        TextView textViewcity= (TextView)listviewitem.findViewById(R.id.textcity);
        TextView textViewadditional= (TextView)listviewitem.findViewById(R.id.textadditional);
        TextView textViewcategory= (TextView)listviewitem.findViewById(R.id.textcategory);


        AddGarage addGarage=garageList.get(position);
        textViewname.setText(addGarage.getG_name());
        textViewoname.setText("Owner: "+addGarage.getO_name());
        textViewservice.setText("Service: " +addGarage.getService());
        textViewaddress.setText("Address: "+addGarage.getAddress());
        textViewphone.setText("Contact: " +addGarage.getPhone());
        textViewcity.setText("City: "+addGarage.getCity());
        textViewadditional.setText("Details: "+addGarage.getAdditional());
        textViewcategory.setText("Category: "+addGarage.getCategory());

        return  listviewitem;
    }
}
