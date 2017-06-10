package com.example.ldann_000.familytreeapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PersonalInfo extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_info);
        gotoYourTree();
        gotoCloseupView();
        gotoMainActivity();
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

    public void gotoMainActivity() {
        final Context context = this;
        button = (Button) findViewById(R.id.mainactivity);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(context, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
