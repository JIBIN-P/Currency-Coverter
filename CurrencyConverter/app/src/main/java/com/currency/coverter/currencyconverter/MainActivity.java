package com.currency.coverter.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void onClick(View button) {

        EditText editText = (EditText) findViewById(R.id.editText);
        Double result = Double.parseDouble(editText.getText().toString());
        result *= 64.14; 
        Toast.makeText(this,  "The INR equivalent is " + String.format("%.2f",result), Toast.LENGTH_LONG).show();
        Log.i("Info","Button Clicked");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
