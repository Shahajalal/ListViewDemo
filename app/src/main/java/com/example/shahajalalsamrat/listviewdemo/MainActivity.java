package com.example.shahajalalsamrat.listviewdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private SearchView searchView;
    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.listviewid);
        searchView=findViewById(R.id.searchviewid);



        final String [] shahajalal=getResources().getStringArray(R.array.countryName);

        final ArrayAdapter<String>arrayAdapter=new ArrayAdapter<String>(this,R.layout.countrytext,R.id.textid,shahajalal);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String value=shahajalal[position];
                Intent intent=new Intent(MainActivity.this,DesignActivity.class);
                intent.putExtra("key",value);
                startActivity(intent);

            }
        });


        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {

                arrayAdapter.getFilter().filter(newText);

                return false;
            }
        });

    }
}
