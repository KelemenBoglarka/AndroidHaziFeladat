package com.example.layoutshf;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.text.InputType;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Product> products=new ArrayList<Product>();
    ListView listview;
    ArrayList<String> nameArray = new ArrayList<String>();
    ArrayList<String> codeArray = new ArrayList<String>();
    ArrayList<Double> priceArray = new ArrayList<Double>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn=(Button) findViewById(R.id.cancel);
        btn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                TextView et1 = (TextView)findViewById(R.id.code);
                et1.setText("");
                TextView et2 = (TextView)findViewById(R.id.name);
                et2.setText("");
                TextView et3 = (TextView)findViewById(R.id.price);
                et3.setText("");
            }
        });

        Button btn2=(Button) findViewById(R.id.add);
        btn2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                TextView edText1 = (TextView) findViewById(R.id.code);
                edText1.setInputType(InputType.TYPE_CLASS_TEXT);
                String code = edText1.getText().toString();
                TextView edText2 = (TextView) findViewById(R.id.name);
                edText2.setInputType(InputType.TYPE_CLASS_TEXT);
                String name = edText2.getText().toString();
                TextView edText3 = (TextView) findViewById(R.id.price);
                edText3.setInputType(InputType.TYPE_CLASS_TEXT);
                double price = Double.parseDouble(edText3.getText().toString());
                Product p=new Product(code,name,price);
                products.add(new Product(code,name,price));
                nameArray.add(name);
                codeArray.add(code);
                priceArray.add(price);
                TextView et1 = (TextView)findViewById(R.id.code);
                et1.setText("");
                TextView et2 = (TextView)findViewById(R.id.name);
                et2.setText("");
                TextView et3 = (TextView)findViewById(R.id.price);
                et3.setText("");
            }
        });
        Button btn3=(Button) findViewById(R.id.showP);
        listview=(ListView) findViewById(R.id.listView);
        CustomAdapter adapter=new CustomAdapter(this,nameArray,codeArray,priceArray);

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listview.setAdapter(adapter);
                //ArrayAdapter arrayAdapter=new ArrayAdapter(this, android.R.layout.simple_list_item_1,products);

            }
        });
/*
        listview=(ListView) findViewById(R.id.listView);

        ArrayAdapter arrayAdapter=new ArrayAdapter(this, android.R.layout.simple_list_item_1,products);
*/
    }

    private class Product {
        private String code;
        private String name;
        private double price;


        public Product(String code, String name, double price) {
            this.code = code;
            this.name = name;
            this.price = price;
        }
    }

    private class CustomAdapter extends ArrayAdapter{
        private final Activity context;

        private final ArrayList<String> name;
        private final ArrayList<String> code;
        private final ArrayList<Double> price;


        public CustomAdapter(Activity context, ArrayList<String> Name, ArrayList<String> Code,
                             ArrayList<Double> Price){

            super(context, R.layout.listviewrow, nameP);
            this.context=context;
            this.price = Price;
            this.name = Name;
            this.code = Code;

        }
        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater inflater=context.getLayoutInflater();
            View rowView=inflater.inflate(R.layout.listviewrow,null,true);

            TextView textView5=rowView.findViewById(R.id.name);
            TextView textView6=rowView.findViewById(R.id.code);
            TextView textView7=rowView.findViewById((R.id.price));

            textView5.setText(nameArray.get(position));
            textView6.setText(codeArray.get(position));
            textView7.setText(priceArray.get(position));
            return rowView;
        }
    }
}