package com.example.pavlion.hymnic;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Final_Player extends AppCompatActivity {

    Button back_5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final__player);

        back_5 = findViewById(R.id.back_5);

        back_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                moveTaskToBack(true);
                android.os.Process.killProcess(android.os.Process.myPid());
                System.exit(1);
            }
        });

    }

}
