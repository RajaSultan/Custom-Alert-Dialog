package com.example.toasts;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static android.R.color.transparent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View view = LayoutInflater.from(MainActivity.this).inflate(R.layout.popup, null);

                Button btnNo = view.findViewById(R.id.button2);
                Button btnYes = view.findViewById(R.id.button3);

                AlertDialog dialog = new AlertDialog.Builder(MainActivity.this).setView(view).create();
                dialog.getWindow().setBackgroundDrawableResource(transparent);
                btnNo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                        Toast.makeText(MainActivity.this, "No Clicked", Toast.LENGTH_SHORT).show();
                    }
                });

                btnYes.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                        Toast.makeText(MainActivity.this, "Yes Clicked", Toast.LENGTH_SHORT).show();
                    }
                });


                dialog.show();

            }
        });
    }
}