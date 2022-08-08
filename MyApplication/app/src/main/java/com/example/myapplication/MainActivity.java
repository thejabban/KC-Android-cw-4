package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textview =findViewById(R.id.tv);
        TextView t=findViewById(R.id.result);
        EditText Ed1 =findViewById(R.id.ET1);
        EditText Ed2=findViewById(R.id.ET2);
        Button b = findViewById(R.id.calculate);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                int num1 = Integer.parseInt(Ed1.getText().toString());
                int num2 = Integer.parseInt(Ed2.getText().toString());
                int button = num1 + num2;
                t.setText(String.valueOf(button));}

        });

    }
}
