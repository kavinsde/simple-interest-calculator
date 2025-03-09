package dev.puffs.simpleinterestcalculator;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText principalAmount, rateOfInterest, timeInYears;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        principalAmount = findViewById(R.id.principalAmount);
        rateOfInterest = findViewById(R.id.rateOfInterest);
        timeInYears = findViewById(R.id.timeInYears);
        TextView display = findViewById(R.id.display);
        Button calculate = findViewById(R.id.calculate);

        calculate.setOnClickListener(view -> {
            double principal = Double.parseDouble(principalAmount.getText().toString());
            double rate = Double.parseDouble(rateOfInterest.getText().toString());
            double time = Double.parseDouble(timeInYears.getText().toString());
            double interest = (principal * rate * time) / 100;
            display.setText(String.format("Simple Interest: %s", interest));
        });
        }
    }