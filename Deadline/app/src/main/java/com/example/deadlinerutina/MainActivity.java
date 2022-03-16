package com.example.deadlinerutina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView titlepage,subtitlepage,endpage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        titlepage = findViewById(R.id.titlePage);
        subtitlepage = findViewById(R.id.subtitlePage);
        endpage = findViewById(R.id.endpage);
    }
}