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
 * Created by abhishek on 15/4/18.
 */

public class Numberlist extends ArrayAdapter<AddNumbers> {

    private Activity context;
    private List<AddNumbers> numbersList;

    public Numberlist(Activity context, List<AddNumbers> numbersList) {
        super(context, R.layout.info, numbersList);
        this.context = context;
        this.numbersList = numbersList;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View listviewitem = inflater.inflate(R.layout.info, null, true);

        TextView textViewname= (TextView)listviewitem.findViewById(R.id.textna);
        TextView textViewcat= (TextView)listviewitem.findViewById(R.id.textcat);
        TextView textViewnum= (TextView)listviewitem.findViewById(R.id.textnum);

        AddNumbers addNumbers=numbersList.get(position);
        textViewname.setText(addNumbers.getNa());
        textViewcat.setText(addNumbers.getCat());
        textViewnum.setText(addNumbers.getNumber());


        return  listviewitem;

    }

}
