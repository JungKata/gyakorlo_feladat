package com.example.gyakorlo_feladat;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button buttonSubmit;
    private EditText editTextInput;
    private TextView textViewResult;
    private Button buttonSubmit_kis;
    private Button  textSzin;
    private Random rnd;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nagybetu = editTextInput.getText().toString().toUpperCase();
                textViewResult.setText(nagybetu);
            }
        });
        buttonSubmit_kis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String kisbetu = editTextInput.getText().toString().toLowerCase();
                textViewResult.setText(kisbetu);
            }
        });

        textSzin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int red = rnd.nextInt(256);
                int green = rnd.nextInt(256);
                int blue = rnd.nextInt(256);
                textViewResult.setBackgroundColor(Color.rgb(red, green, blue));
            }
        });
    }

    public void init()
    {
        buttonSubmit = findViewById(R.id.buttonSubmit);
        editTextInput = findViewById(R.id.editTextInput);
        textViewResult = findViewById(R.id.textViewResult);
        buttonSubmit_kis = findViewById(R.id.buttonSubmit_kis);
        textSzin = findViewById(R.id.textSzin);
        rnd = new Random();
    }
}