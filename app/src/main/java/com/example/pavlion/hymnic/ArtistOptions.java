package com.example.pavlion.hymnic;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.GridView;
import android.widget.Toast;

public class ArtistOptions extends Activity {
    Button back_4;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get the view from gridview_main.xml
        setContentView(R.layout.activity_artist_options);
        back_4=findViewById(R.id.back_4);
        // Locate GridView in listview_main.xml
        GridView gridview = (GridView) findViewById(R.id.simpleGridView);

        // Set the ImageAdapter into GridView Adapter
        gridview.setAdapter(new ImageAdapter(this));

        // Capture GridView item click
        gridview.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {

                // Launch ViewImage.java using intent


                // Show the item position using toast
                Toast.makeText(ArtistOptions.this, "Position " + position,
                        Toast.LENGTH_SHORT).show();


            }
        });
        back_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i4;
                i4=new Intent(ArtistOptions.this,WebPlayer.class);
                startActivity(i4);
            }
        });
    }


}