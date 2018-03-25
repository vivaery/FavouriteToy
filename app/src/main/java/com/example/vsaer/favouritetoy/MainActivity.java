package com.example.vsaer.favouritetoy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView toy_names;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toy_names = findViewById(R.id.tv_toy_names);
        String[] toyNames = ToyBox.getToyNames();

        for(String toyName : toyNames)

        toy_names.append(toyName + "\n \n \n");
    }
}
