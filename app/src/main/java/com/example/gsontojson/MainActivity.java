package com.example.gsontojson;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Gson gson = new Gson();
        userInfo userinfo = new userInfo() ;
        userinfo.info("ArmanZiaei" , "armanziei83@gmail.com" , 17);
        
    }
}