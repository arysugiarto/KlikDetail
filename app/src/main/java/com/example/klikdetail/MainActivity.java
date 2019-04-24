package com.example.klikdetail;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listView;

    private ArrayAdapter<String> arrayAdapter;

    private String[] programmingLang={

            "Eko", "Jaya","Fazri", "Ari","Andi", "Wong","Asli", "Palembang"

    };


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listViewProgramming1);

        arrayAdapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,programmingLang);

        listView.setAdapter(arrayAdapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {



            public void onItemClick(AdapterView<?> parent, View view,


                                    int position, long id) {

                String detail = listView.getItemAtPosition(position).toString();

                Intent intent= new Intent(getApplicationContext(),DetailBookingActivity.class);

                intent.putExtra("detail", detail);

                startActivity(intent);

            }

        });

    }

}
