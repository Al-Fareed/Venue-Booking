package com.example.admin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageButton addVenue,updateVenue,listallvenue,home,aHistory,aSetting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Code redirect from Home page to Add Venue page
        addVenue = (ImageButton) findViewById(R.id.addVenue);
        addVenue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent addVeueIntent = new Intent(MainActivity.this,addvenue.class);
                startActivity(addVeueIntent);
            }
        });
//        Code redirect from Home page to Update Venue page
        updateVenue = (ImageButton) findViewById(R.id.updateVenue);
        updateVenue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent updateVenueIntent = new Intent(MainActivity.this,updatevenue.class);
                startActivity(updateVenueIntent);
            }
        });
//        Code redirect from Home page to list all Venue page
        listallvenue = (ImageButton) findViewById(R.id.listVenues);
        listallvenue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent listVenuesIntent = new Intent(MainActivity.this,listallvenue.class);
                startActivity(listVenuesIntent);
            }
        });

//        Code for Home page button
        home = (ImageButton) findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "You are in Home page", Toast.LENGTH_SHORT).show();
            }
        });

//        Code for Book History of admin application
        aHistory = (ImageButton) findViewById(R.id.adminHistory);
        aHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent histIntent = new Intent(MainActivity.this, listallvenue.class);
                startActivity(histIntent);
            }
        });
//       redirecting to Admin setting page
        aSetting = (ImageButton) findViewById(R.id.adminSettings);
        aSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent settingIntent = new Intent(MainActivity.this,adminSetting.class);
                startActivity(settingIntent);
            }
        });
    }
}