package com.example.ldann_000.familytreeapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;

import com.example.ldann_000.familytreeapp.R;

public class MainActivity extends Activity {

    Button button;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gotoYourTree();
        gotoTreesInTheFamily();
        gotoPersonalInfo();
        gotoSettings();
    }

    public void gotoYourTree() {
        final Context context = this;
        button = (Button) findViewById(R.id.yourtree);
        button.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(context, YourTree.class);
                startActivity(intent);
            }

        });
    }

    public void gotoTreesInTheFamily() {
        final Context context = this;
        button = (Button) findViewById(R.id.treesinthefamily);
        button.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(context, TreesintheFamily.class);
                startActivity(intent);
            }

        });
    }

    public void gotoPersonalInfo() {
        final Context context = this;
        button = (Button) findViewById(R.id.personalinfo);
        button.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(context, PersonalInfo.class);
                startActivity(intent);
            }

        });
    }

    public void gotoSettings() {
        final Context context = this;
        button = (Button) findViewById(R.id.settings);
        button.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(context, Settings.class);
                startActivity(intent);
            }

        });
    }

}
