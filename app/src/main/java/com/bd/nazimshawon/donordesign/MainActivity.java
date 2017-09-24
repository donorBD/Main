package com.bd.nazimshawon.donordesign;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
    }
    public void search(View v) {
        startActivity(new Intent(MainActivity.this, search.class));
    }
    public void ambulance(View v) {
        startActivity(new Intent(MainActivity.this, ambulance.class));
    }
    public void hospital(View v) {
        startActivity(new Intent(MainActivity.this, hospital.class));
    }
    public void tips(View v) {
        startActivity(new Intent(MainActivity.this, tips.class));
    }
    public void aboutus(View v) {
        startActivity(new Intent(MainActivity.this, aboutus.class));
    }
}
