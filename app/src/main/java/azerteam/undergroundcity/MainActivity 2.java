package com.example.listapp;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {


    ListView myListView;
    String[] items;
    String[] schedule;
    String[] description;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Resources res = getResources();
        myListView = (ListView) findViewById(R.id.myListView);
        items = res.getStringArray(R.array.items);
        schedule = res.getStringArray(R.array.schedule);
        description = res.getStringArray(R.array.description);

        ItemAdaptor itemAdaptor = new ItemAdaptor(this,items,schedule,description);
        myListView.setAdapter(itemAdaptor);


        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent showDetailActivity = new Intent(getApplicationContext(), DetailActivity.class);
                showDetailActivity.putExtra("com.example.ITEM_IDEX",i);
                startActivity(showDetailActivity);
            }
        });

    }
}
