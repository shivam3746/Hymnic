package com.example.pavlion.hymnic;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class songs_list extends AppCompatActivity {
    String msg;
     ListView listView;
    TextView textView;
    String[] listItem;
    Button back_2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs_list);

        back_2=findViewById(R.id.back_2);
        listView=findViewById(R.id.listView);
        textView=findViewById(R.id.textView);
        listItem = getResources().getStringArray(R.array.array_technology);
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, listItem);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                String value=adapter.getItem(position);
                Toast.makeText(getApplicationContext(),value,Toast.LENGTH_SHORT).show();
                Intent i4;
                i4 = new Intent(songs_list.this,songs_detail.class);

                if (position==0){
                    msg=getResources().getString(R.string.song_1_detail);
                    i4.putExtra("detail",msg);
                    startActivity(i4);
                    }
                else  if (position==1){
                    msg=getResources().getString(R.string.song_2_detail);
                    i4.putExtra("detail",msg);
                    startActivity(i4);
                }
                else  if (position==2){
                    msg=getResources().getString(R.string.song_3_detail);
                    i4.putExtra("detail",msg);
                    startActivity(i4);
                }
                else  if (position==3){
                    msg=getResources().getString(R.string.song_4_detail);
                    i4.putExtra("detail",msg);
                    startActivity(i4);
                }
                else  if (position==4){
                    msg=getResources().getString(R.string.song_5_detail);
                    i4.putExtra("detail",msg);
                    startActivity(i4);
                }
                else  if (position==5){
                    msg=getResources().getString(R.string.song_6_detail);
                    i4.putExtra("detail",msg);
                    startActivity(i4);
                }
                else  if (position==6){
                    msg=getResources().getString(R.string.song_7_detail);
                    i4.putExtra("detail",msg);
                    startActivity(i4);
                }
                else  if (position==7){
                    msg=getResources().getString(R.string.song_8_detail);
                    i4.putExtra("detail",msg);
                    startActivity(i4);
                }
                else  if (position==8){
                    msg=getResources().getString(R.string.song_9_detail);
                    i4.putExtra("detail",msg);
                    startActivity(i4);
                }
                else  if (position==9){
                    msg=getResources().getString(R.string.song_10_detail);
                    i4.putExtra("detail",msg);
                    startActivity(i4);
                }
                else  if (position==10){
                    msg=getResources().getString(R.string.song_11_detail);
                    i4.putExtra("detail",msg);
                    startActivity(i4);
                }
                else  if (position==11){
                    msg=getResources().getString(R.string.song_12_detail);
                    i4.putExtra("detail",msg);
                    startActivity(i4);
                }
            }
        });
        back_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i;
                i=new Intent(songs_list.this,WebPlayer.class);
                startActivity(i);
            }
        });
    }
}
