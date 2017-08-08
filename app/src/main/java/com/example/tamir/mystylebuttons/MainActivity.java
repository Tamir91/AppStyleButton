package com.example.tamir.mystylebuttons;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.tamir.mystylebuttons.ColorsActivites.DefaultActivity;
import com.example.tamir.mystylebuttons.ColorsActivites.InfoActivity;
import com.example.tamir.mystylebuttons.ColorsActivites.PrimaryActivity;

public class MainActivity extends AppCompatActivity {
    Intent intent;
    Button buttonDefault, buttonPrimary, buttonInfo;
    Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        initListeners();
    }

    public void initViews() {
        buttonDefault = (Button) findViewById(R.id.buttonDefault);
        buttonPrimary = (Button) findViewById(R.id.buttonPrimary);
        buttonInfo = (Button) findViewById(R.id.buttonInfo);
    }

    public void initListeners() {
        buttonDefault.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(context, DefaultActivity.class);
                startActivity(intent);
            }
        });

        buttonPrimary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(context, PrimaryActivity.class);
                startActivity(intent);
            }
        });

        buttonInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(context, InfoActivity.class);
                startActivity(intent);
            }
        });


    }
}
