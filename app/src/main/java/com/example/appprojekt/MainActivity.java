package com.example.appprojekt;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnAdd;
        final TextView textDisplay;
        final EditText textInput;

        btnAdd = findViewById(R.id.btnAdd);
        textDisplay = findViewById(R.id.textDisplay);
        textInput = findViewById(R.id.textinput);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textDisplay.setText(textInput.getText());
            }
        });
    }
}