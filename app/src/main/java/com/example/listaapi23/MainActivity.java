package com.example.listaapi23;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvAlumnos;
    ArrayList alumnos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvAlumnos = findViewById(R.id.lvAlumnos);

        alumnos=new ArrayList<String>();
        alumnos.add("Elvis");
        alumnos.add("Carlos");
        alumnos.add("Manuel");
        alumnos.add("sixto");

        ArrayAdapter<String> adapter =new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,alumnos);
        lvAlumnos.setAdapter(adapter);

        lvAlumnos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,alumnos.get(position).toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
