package com.example.pavlion.hymnic;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class songs_detail extends AppCompatActivity {
    TextView textView2;
    Button back_3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs_detail);

        String savedExtra = getIntent().getStringExtra("detail");
        textView2= findViewById(R.id.details);
        textView2.setText(savedExtra);

        back_3=findViewById(R.id.back_3);

        back_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i;
                i=new Intent(songs_detail.this,songs_list.class);
                startActivity(i);
            }
        });
    }
}
