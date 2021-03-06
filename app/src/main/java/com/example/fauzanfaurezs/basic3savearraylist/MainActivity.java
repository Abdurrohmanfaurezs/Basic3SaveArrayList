package com.example.fauzanfaurezs.basic3savearraylist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    //Todo inisialisasi
    //inisialisasi Array List
    private List kontenList = new ArrayList<>();
    //inisialisasi Array Adapter
    private ArrayAdapter adapter = null;
    //inisialisasi / deklarasi Variable ListView
    private ListView listView;

    //inisialisasi / deklarasi Komponen2 yang lain
    private EditText inputData;
    private Button saveData;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //find Viewnya
        listView = findViewById(R.id.list_data);
        inputData = findViewById(R.id.imput_data);
        saveData = findViewById(R.id.save_data);

        //Mengatur Array Adapter untuk di tampil kan pada List View nya
        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, kontenList);
        //nampilin
        listView.setAdapter(adapter);

        //Menyimpan data Array dan Menampilkannya
        saveData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Konten myKonten = new Konten();
                //get buat ngambil text, data dsb
                myKonten.setData(inputData.getText().toString());
                adapter.add(myKonten);
                Toast.makeText(getApplicationContext(),"Ok Data Tersimpan", Toast.LENGTH_LONG).show();

            }
        });

    }
}
