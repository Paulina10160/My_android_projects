package com.example.kolkokrzyzykapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class PlayerSetup extends AppCompatActivity {

    private EditText player1;
    private EditText player2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.player_setup);

        player1 = findViewById(R.id.pl1Name);
        player2 = findViewById(R.id.pl2Name);
    }
    public void submitButtonClick(View view){
        String pl1Name = player1.getText().toString();
        String pl2Name = player2.getText().toString();

        Intent intent = new Intent(this, GameDisplay.class);
        intent.putExtra("Player_Names", new String[] {pl1Name, pl2Name});
        startActivity(intent);
    }
}