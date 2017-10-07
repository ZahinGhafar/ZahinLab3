package com.example.zahinghafar10.zahinlab3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import static com.example.zahinghafar10.zahinlab3.R.id.parent;
import static com.example.zahinghafar10.zahinlab3.R.styleable.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView gridView = (GridView) findViewById(R.id.gridView);
        gridView.setAdapter(new ImageAdapter(this));

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {

            Intent i = new Intent(getApplicationContext(), FullImageActivity.class) ;
           i.putExtra("id",position);
                startActivity(i);
            }
        });
    }}



