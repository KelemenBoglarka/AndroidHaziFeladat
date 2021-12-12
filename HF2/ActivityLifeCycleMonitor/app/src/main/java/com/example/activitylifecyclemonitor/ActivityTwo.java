package com.example.activitylifecyclemonitor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        Button gomb1=findViewById(R.id.button);
        gomb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(getBaseContext(),ActivityThree.class);//honnan,hová
                startActivity(intent);
                //elöször inten obijektumot hozok létre két paraméterrel:
                //1.ahonnan indítom a hívást
                //2.amit meg akarok hívni
            }
        });
    }
}