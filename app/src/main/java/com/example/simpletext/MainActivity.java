package com.example.simpletext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class 62MainActivity extends AppCompatActivity {
    private EditText FirstNo, SecondNo;
    private Button btnSum, btnSub;
    int First, Second, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Binding
        FirstNo = findViewById(R.id.etFirst);
        SecondNo = findViewById(R.id.etSecond);
        btnSum = findViewById(R.id.btnSum);
        btnSub = findViewById(R.id.btnSubtract);

        //Button ko click listener
        btnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                First = Integer.parseInt(FirstNo.getText().toString());
                Second = Integer.parseInt(SecondNo.getText().toString());
                result = First + Second;

                // for output
                Toast.makeText(MainActivity.this, "The sum is " + result, Toast.LENGTH_SHORT).show();
            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                First = Integer.parseInt(FirstNo.getText().toString());
                Second = Integer.parseInt(SecondNo.getText().toString());
                result = First - Second;

                // for output
                Toast.makeText(MainActivity.this, "The substraction is " + result, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
