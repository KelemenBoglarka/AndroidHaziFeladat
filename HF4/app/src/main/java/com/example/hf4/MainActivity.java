package com.example.hf4;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lista = findViewById(R.id.valutaLista);

        CustomListViewAdapter adapter = new CustomListViewAdapter(this);
        lista.setAdapter(adapter);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @SuppressLint("DefaultLocale")
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String name = ElemDisplay.getNameArray()[position];
                double buyPrice = ElemDisplay.getBuyInfoArray()[position];
                Toast.makeText(getApplicationContext(), name + " " + String.format("%,.4f", buyPrice) + " RON",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}