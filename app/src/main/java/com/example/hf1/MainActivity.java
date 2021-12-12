package com.example.hf1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText szam1 = findViewById(R.id.szam1);
        EditText szam2 = findViewById(R.id.szam2);
        TextView eredmeny = findViewById(R.id.textView);
        Button osszeadas=findViewById(R.id.button);
        Button kivonas=findViewById(R.id.button2);
        Button szorzas=findViewById(R.id.button3);
        Button osztas=findViewById(R.id.button4);
        kivonas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double kivonas = Double.parseDouble(szam1.getText().toString())-Double.parseDouble(szam2.getText().toString());

                eredmeny.setText(String.format("%.2f", kivonas));
            }
        });
        osszeadas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double osszeadas = Double.parseDouble(szam1.getText().toString())+Double.parseDouble(szam2.getText().toString());

                eredmeny.setText(String.format("%.2f", osszeadas));
            }
        });
        szorzas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double szorzas = Double.parseDouble(szam1.getText().toString())*Double.parseDouble(szam2.getText().toString());

                eredmeny.setText(String.format("%.2f", szorzas));
            }
        });
        osztas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Double.parseDouble(szam2.getText().toString())==0){
                    eredmeny.setText("nullával nem osztunk!");
                }else {
                    double osztas = Double.parseDouble(szam1.getText().toString()) / Double.parseDouble(szam2.getText().toString());

                    eredmeny.setText(String.format("%.2f", osztas));
                }
            }
        });
    }
}