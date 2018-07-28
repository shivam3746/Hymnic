package com.example.pavlion.hymnic;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class WebPlayer extends AppCompatActivity {

    ImageView imgClick;
    ImageView imgClick2;
    Button surprise;
    Button back_1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.web_player);

        back_1=findViewById(R.id.back_1);
        imgClick = findViewById(R.id.artist_view);
        surprise=findViewById(R.id.play_song);
        imgClick2 = findViewById(R.id.song_list);


        imgClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               Intent i;
                i=new Intent(WebPlayer.this,ArtistOptions.class);
                startActivity(i);

            }
        });
        imgClick2.setOnClickListener(new View.OnClickListener() {

             @Override
             public void onClick(View v) {
                 Intent i2;
                 i2=new Intent(WebPlayer.this,songs_list.class);
                 startActivity(i2);
             }

        });
         surprise.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent i3;
                 i3= new Intent(WebPlayer.this,Final_Player.class);
                 startActivity(i3);
             }
         });
         back_1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent i4;
                 i4=new Intent(WebPlayer.this,MainActivity.class);
                 startActivity(i4);
             }
         });
    }
}