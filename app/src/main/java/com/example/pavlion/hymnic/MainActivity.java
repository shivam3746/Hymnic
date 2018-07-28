package com.example.pavlion.hymnic;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button)findViewById(R.id.Enter);
        button.setOnClickListener(welcomelistener);
    }


    private View.OnClickListener welcomelistener = new View.OnClickListener() {
        public void onClick(View v) {
            Intent i;
            i=new Intent(MainActivity.this,WebPlayer.class);
            startActivity(i);
        }
    };

}
