package com.panharithcoding.worldcup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listview;
    private static CustomAdapter adapter;
    ArrayList<CountryModel> dataModels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 1- AdapterView: a listView
        listview = findViewById(R.id.listview);
        // 2- Data source
        dataModels = new ArrayList<>();
        dataModels.add(new CountryModel("Brazil", "5", R.drawable.brazil));
        dataModels.add(new CountryModel("Germany", "4",R.drawable.germany));
        dataModels.add(new CountryModel("Argentina", "3", R.drawable.argentina));
        dataModels.add(new CountryModel("France", "2",R.drawable.frace));
        dataModels.add(new CountryModel("England", "1", R.drawable.england));
        dataModels.add(new CountryModel("Spain", "1", R.drawable.spain));
        dataModels.add(new CountryModel("Japan", "0", R.drawable.japan));
        // 3- Adapter
        adapter = new CustomAdapter(dataModels,getApplicationContext());
        listview.setAdapter(adapter);
        // 4 - Handling the click events on Listview items
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this,
                        "Country " + adapter.getItem(i).getCountry_name() + "\n" +"World Cups wins: " + adapter.getItem(i).getWorldCup_win(),
                        Toast.LENGTH_SHORT).show();
            }
        });

    }
}