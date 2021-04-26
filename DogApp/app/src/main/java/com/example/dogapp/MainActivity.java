package com.example.dogapp;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import com.example.dogapp.connection.FakeDatabase;
import com.example.dogapp.connection.IDatabase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainActivity extends AppCompatActivity {
    private ListView raceList;
    private List<String> rasy;
    private EditText searchEdit;
    private List<String> rasyArr;
    private IDatabase database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        database = new FakeDatabase();
        rasyArr = database.getDogRaces();

        rasy = new ArrayList<>(rasyArr);

        raceList = findViewById(R.id.dogList);
        RaceTitleAdapter adapter = new RaceTitleAdapter(this, R.layout.race_row, rasy);
        raceList.setAdapter(adapter);

        searchEdit = findViewById(R.id.searchEdit);
        searchEdit.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String searchText = searchEdit.getText().toString();
                rasy.clear();
                if(searchText.length() > 0)
                {
                    rasy.addAll(rasyArr.stream().filter(x -> x.toLowerCase().contains(searchText.toLowerCase())).collect(Collectors.toList()));
                }
                else
                {
                    rasy.addAll(rasyArr);
                }
                adapter.notifyDataSetChanged();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

    }
}