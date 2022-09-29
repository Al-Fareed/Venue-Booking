package com.example.admin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.Toast;

public class adminSetting extends AppCompatActivity {

    ImageButton home,aHistory,aSetting;
    Spinner limit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_setting);

        String[] arraySpinner = new String[] {
                "0", "1", "2", "3", "4", "5", "6","7", "9"
        };
        Spinner s = (Spinner) findViewById(R.id.spinner1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, arraySpinner);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s.setAdapter(adapter);

        //        Code for Home page button
        home = (ImageButton) findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent histIntent = new Intent(adminSetting.this, MainActivity.class);
                startActivity(histIntent);
            }
        });

//        Code for Book History of admin application
        aHistory = (ImageButton) findViewById(R.id.adminHistory);
        aHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent settingIntent = new Intent(adminSetting.this,history.class);
                startActivity(settingIntent);


            }
        });
//       redirecting to Admin setting page
        aSetting = (ImageButton) findViewById(R.id.adminSettings);
        aSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(adminSetting.this, "You are viewing this page", Toast.LENGTH_SHORT).show();

            }
        });
    }
}