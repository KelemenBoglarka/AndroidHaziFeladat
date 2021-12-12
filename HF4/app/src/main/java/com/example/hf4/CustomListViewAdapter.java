package com.example.hf4;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class CustomListViewAdapter  extends ArrayAdapter {
    private Activity context = null;
    private Integer[] imageArray = null;
    private String[] nameArray = null;
    private String[] infoArray = null;
    private double[] buyInfoArray = null;
    private double[] sellInfoArray= null ;

    public CustomListViewAdapter(@NonNull Context context, int resource) {
        super(context, resource);
    }



    public CustomListViewAdapter(Activity context) {
        super(context, R.layout.listview_row, ElemDisplay.getNameArray());
        this.context = context;
        this.imageArray = ElemDisplay.getImageArray();
        this.nameArray = ElemDisplay.getNameArray();
        this.infoArray = ElemDisplay.getInfoArray();
        this.buyInfoArray = ElemDisplay.getBuyInfoArray();
        this.sellInfoArray = ElemDisplay.getSellInfoArray();
    }


    @SuppressLint("DefaultLocale")
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = context.getLayoutInflater();
        View rowView = layoutInflater.inflate(R.layout.listview_row, null, true);

        ImageView image = rowView.findViewById(R.id.image);
        TextView name = rowView.findViewById(R.id.name);
        TextView description = rowView.findViewById(R.id.description);
        TextView buyView = rowView.findViewById(R.id.buyView);
        TextView sellView = rowView.findViewById(R.id.sellView);

        image.setImageResource(imageArray[position]);
        name.setText(nameArray[position]);
        description.setText(infoArray[position]);
        buyView.setText(String.format("%,.4f", buyInfoArray[position]));
        sellView.setText(String.format("%,.4f", sellInfoArray[position]));

        return rowView;
    }
}
