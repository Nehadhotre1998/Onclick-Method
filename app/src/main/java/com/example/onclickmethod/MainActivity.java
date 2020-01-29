package com.example.onclickmethod;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button1;
    Button button2;
    Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Button 1", Toast.LENGTH_LONG).show();
            }
        });

        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(this);

        button3 = findViewById(R.id.button3);
        button3.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

//        if (v.getId() == R.id.button2) {
//            Toast.makeText(getApplicationContext(), "Button 2", Toast.LENGTH_LONG).show();
//        }
//
//        if (v.getId() == R.id.button3) {
//            Toast.makeText(getApplicationContext(), "Button 3", Toast.LENGTH_LONG).show();
//
//        }

        switch (v.getId()) {
            case R.id.button2:
                Toast.makeText(getApplicationContext(), "Button 2", Toast.LENGTH_LONG).show();
                break;

            case R.id.button3:
                Toast.makeText(getApplicationContext(), "Button 3", Toast.LENGTH_LONG).show();
                break;
        }

    }


    // press alt + enter to create method in class
    public void showToast(View view) {
        Toast.makeText(getApplicationContext(), "Button 4", Toast.LENGTH_LONG).show();
    }
}
