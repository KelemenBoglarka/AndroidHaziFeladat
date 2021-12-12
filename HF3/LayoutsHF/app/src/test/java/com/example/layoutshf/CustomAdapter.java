package com.example.layoutshf;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {
    //to reference the Activity
    private final Activity context;

    private final ArrayList<String> name;
    private final ArrayList<String> code;
    private final ArrayList<Double> price;


    public CustomAdapter(Activity context, ArrayList<String> nameP, ArrayList<String> codeP,
                         ArrayList<Double> priceP){

        super(context, R.layout.listviewrow, nameP);
        this.context=context;
        this.price = priceP;
        this.name = nameP;
        this.code = codeP;

    }
/*
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.listviewrow,null,true);

        TextView nev=rowView.findViewById(R.id.nev2);
        TextView leiras=rowView.findViewById(R.id.leiras2);
        ImageView kep=rowView.findViewById(R.id.imageView2);
        TextView kor=rowView.findViewById((R.id.eletkor));

        nev.setText(nameArray[position]);
        leiras.setText(infoArray[position]);
        kep.setImageResource(imageIDarray[position]);
        kor.setText(eletkor[position]);
        return rowView;
    }*/
}
