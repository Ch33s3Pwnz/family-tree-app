package com.example.ldann_000.familytreeapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Shop extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);
        gotoYourTree();
        gotoGarden();
    }

    public void gotoYourTree() {
        final Context context = this;
        button = (Button) findViewById(R.id.yourtree);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(context, YourTree.class);
                startActivity(intent);
            }
        });
    }

    public void gotoGarden() {
        final Context context = this;
        button = (Button) findViewById(R.id.garden);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(context, Garden.class);
                startActivity(intent);
            }
        });
    }
}
