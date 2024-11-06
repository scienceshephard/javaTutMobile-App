package com.javatut;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });
        setTitle("Home");
    }
    public void ClickMe(View v){
        EditText ed= findViewById(R.id.editText);
        String input = ed.getText().toString();
        TextView output=v.findViewById(R.id.output);
        ((TextView) findViewById(R.id.output)).setText(input);
        Toast.makeText(this, input, Toast.LENGTH_SHORT).show();
    }

    public void settingsActivity(View v){
        Intent i= new Intent(this, settings.class);
        startActivity(i);
    }
}