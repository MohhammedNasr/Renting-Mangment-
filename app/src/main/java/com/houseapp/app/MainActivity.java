package com.houseapp.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.Listview);


        List<String> list = new ArrayList<>();
        list.add("Apartment 1");
        list.add("Apartment 2");
        list.add("Apartment 3");
        list.add("Apartment 4");
        list.add("Apartment 5");
        list.add("Apartment 6");
        list.add("Apartment 7");
        list.add("Apartment 8");
        list.add("Apartment 9");
        list.add("Apartment 10");
        list.add("Apartment 11");
        list.add("Apartment 12");
        list.add("Shop 1");
        list.add("Shop 2");
        list.add("Shop 3");
        list.add("basement");

        ArrayAdapter arrayAdapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,list);

        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if(position == 0)
                {
                    startActivity(new Intent(MainActivity.this,apartment1.class));
                    //clicked 1
                }
                else if(position == 1)
                {
                    startActivity(new Intent(MainActivity.this,apartment2.class));
                    //clicked 2
                }
                else if(position == 2)
                {
                    startActivity(new Intent(MainActivity.this,apartment3.class));
                    //clicked 3
                }
                else if(position == 3)
                {
                    startActivity(new Intent(MainActivity.this,apartment4.class));
                    //clicked 4
                }
                else if(position == 4)
                {
                    startActivity(new Intent(MainActivity.this,apartment5.class));
                    //clicked 5
                }
                else if(position == 5)
                {
                    startActivity(new Intent(MainActivity.this,apartment6.class));
                    //clicked 6
                }
                else if(position == 6)
                {
                    startActivity(new Intent(MainActivity.this,apartment7.class));
                    //clicked 7
                }
                else if(position == 7)
                {
                    startActivity(new Intent(MainActivity.this,apartment8.class));
                    //clicked 8
                }
                else if(position == 8)
                {
                    startActivity(new Intent(MainActivity.this,apartment9.class));
                    //clicked 9
                }
                else if(position == 9)
                {
                    startActivity(new Intent(MainActivity.this,apartment10.class));
                    //clicked 10
                }
                else if(position == 10)
                {
                    startActivity(new Intent(MainActivity.this,apartment11.class));
                    //clicked 11
                }
                else if(position == 11)
                {
                    startActivity(new Intent(MainActivity.this,apartment12.class));
                    //clicked 12
                }
                else if(position == 12)
                {
                    startActivity(new Intent(MainActivity.this,apartment13.class));
                    //clicked 12
                }
                else if(position == 13)
                {
                    startActivity(new Intent(MainActivity.this,apartment14.class));
                    //clicked 12
                }
                else if(position == 14)
                {
                    startActivity(new Intent(MainActivity.this,apartment15.class));
                    //clicked 12
                }
                else if(position == 15)
                {
                    startActivity(new Intent(MainActivity.this,apartment16.class));
                    //clicked 12
                }
            }
        });

    }
}