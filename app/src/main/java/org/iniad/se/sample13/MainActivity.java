package org.iniad.se.sample13;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick(View view){
        EditText etX = findViewById(R.id.editTextX);
        EditText etY = findViewById(R.id.editTextY);
        TextView tvResult = findViewById(R.id.textViewResult);
        String x = etX.getText().toString();
        String y = etY.getText().toString();
        String result = makeResult(x, y);
        tvResult.setText(result);
    }
    public static String makeResult(String x, String y) {
        String result;
        try {
            double dx = Double.parseDouble(x);
            double dy = Double.parseDouble(y);
            double sum = dx + dy;
            result = String.format("%s + %s = %s", x, y, sum);
        } catch(NumberFormatException e) {
            result = "Invalid format.";
        }
        return result;
    }
}
