package com.example.numbergeneratorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btn1(View view){
        Intent intent = new Intent(this, Lotto.class  );
        startActivity(intent);
        }
    public void btn2(View view){
        Intent intent = new Intent(this, Szybkie600.class  );
        startActivity(intent);
    }
    public void btn3(View view){
        Intent intent = new Intent(this, EuroJackpot.class  );
        startActivity(intent);
    }
    public void btn4(View view){
        Intent intent = new Intent(this, MultiMulti.class  );
        startActivity(intent);
    }
    public void btn5(View view){
        Intent intent = new Intent(this, Keno.class  );
        startActivity(intent);
    }
    public void btn6(View view){
        Intent intent = new Intent(this, ExtraPensja.class  );
        startActivity(intent);
    }
    public void btn7(View view){
        Intent intent = new Intent(this, MiniLotto.class  );
        startActivity(intent);
    }
    public void btn8(View view){
        Intent intent = new Intent(this, Kaskada.class  );
        startActivity(intent);
    }
    public void btn9(View view){
        Intent intent = new Intent(this, SuperSzansa.class  );
        startActivity(intent);
    }
    }
