package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void covertCurrency(View view) {

        Log.i("Info", "Button pressed!");

        EditText editText = (EditText) findViewById(R.id.editText);

        String amountInDollars = editText.getText().toString();

        double amountInDollarsDouble = Double.parseDouble(amountInDollars);

        double amountInEuroDouble = amountInDollarsDouble * 0.84;

        String amountInEuroString = String.format("%.2f", amountInEuroDouble);

        Toast.makeText(this, "$" + amountInDollars + " is €" + amountInEuroString, Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}