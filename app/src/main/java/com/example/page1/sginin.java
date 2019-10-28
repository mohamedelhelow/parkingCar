package com.example.page1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sginin extends AppCompatActivity {
    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sginin);

        button =(Button) findViewById(R.id.sginin);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openaddcar();


            }
        });


    }
    public void openaddcar()
    {
        Intent intent = new Intent(this, addcar.class);
        startActivity(intent);
    }
}