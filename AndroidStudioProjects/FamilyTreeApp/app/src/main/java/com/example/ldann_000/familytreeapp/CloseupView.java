package com.example.ldann_000.familytreeapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CloseupView extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_closeup_view);
        gotoTreesInTheFamily();
        gotoPersonalInfo();
        gotoOverheadView();
        gotoPosts();
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

    public void gotoPersonalInfo() {
        final Context context = this;
        button = (Button) findViewById(R.id.personalinfo);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(context, PersonalInfo.class);
                startActivity(intent);
            }
        });
    }

    public void gotoOverheadView() {
        final Context context = this;
        button = (Button) findViewById(R.id.overheadview);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(context, OverheadView.class);
                startActivity(intent);
            }
        });
    }

    public void gotoPosts() {
        final Context context = this;
        button = (Button) findViewById(R.id.posts);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(context, Posts.class);
                startActivity(intent);
            }
        });
    }
}
