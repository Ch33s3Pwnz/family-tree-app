package com.example.ldann_000.familytreeapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OverheadView extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_overhead_view);
        gotoTreesInTheFamily();
        gotoCloseupView();
    }

    public void gotoTreesInTheFamily() {
        final Context context = this;
        button = (Button) findViewById(R.id.treesinthefamily);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(context, TreesintheFamily.class);
                startActivity(intent);
            }
        });
    }

    public void gotoCloseupView() {
        final Context context = this;
        button = (Button) findViewById(R.id.closeupview);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(context, CloseupView.class);
                startActivity(intent);
            }

        });
    }
}
