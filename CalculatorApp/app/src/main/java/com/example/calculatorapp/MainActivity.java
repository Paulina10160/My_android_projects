package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import org.mariuszgromada.math.mxparser.*;

public class MainActivity extends AppCompatActivity {
    private TextView previousCalculator;
    private EditText display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        previousCalculator = findViewById(R.id.previousCalculationView);
        display = findViewById(R.id.displayEditText);

        // zeby klawiatura nie wyskakiwala
        display.setShowSoftInputOnFocus(false);
    }
    private void updateText(String strToAdd)
    {
        String oldStr = display.getText().toString();

        int cursorPos = display.getSelectionStart();
        String leftStr = oldStr.substring(0,cursorPos);
        String rightStr = oldStr.substring(cursorPos);

        display.setText(String.format("%s%s%s", leftStr, strToAdd, rightStr));
        display.setSelection(cursorPos + strToAdd.length());
    }
    public void zeroBTNpush(View view){
        updateText(getResources().getString(R.string.zeroText));
    }
    public void oneBTNpush(View view){
        updateText(getResources().getString(R.string.oneText));
    }
    public void twoBTNpush(View view){
        updateText(getResources().getString(R.string.twoText));
    }
    public void threeBTNpush(View view){
        updateText(getResources().getString(R.string.threeText));
    }
    public void fourBTNpush(View view){
        updateText(getResources().getString(R.string.fourText));
    }
    public void fiveBTNpush(View view){
        updateText(getResources().getString(R.string.fiveText));
    }
    public void sixBTNpush(View view){
        updateText(getResources().getString(R.string.sixText));
    }
    public void sevenBTNpush(View view){
        updateText(getResources().getString(R.string.sevenText));
    }
    public void eightBTNpush(View view){
        updateText(getResources().getString(R.string.eightText));
    }
    public void nineBTNpush(View view){
        updateText(getResources().getString(R.string.nineText));
    }
    public void clearBTNpush(View view){
        display.setText("");
        previousCalculator.setText("");
    }
    public void parenthesesOpenTextBTNpush(View view){
        updateText(getResources().getString(R.string.parenthesesOpenText));
    }
    public void parenthesesCloseTextBTNpush(View view){
        updateText(getResources().getString(R.string.parenthesesCloseText));
    }
    public void divideTextBTNpush(View view){
        updateText(getResources().getString(R.string.divideText));
    }
    public void multiplyTextBTNpush(View view){
        updateText(getResources().getString(R.string.multiplyText));
    }
    public void addTextBTNpush(View view){
        updateText(getResources().getString(R.string.addText));
    }
    public void subtractTextBTNpush(View view){
        updateText(getResources().getString(R.string.subtractText));
    }
    public void decimalTextBTNpush(View view){
        updateText(getResources().getString(R.string.decimalText));
    }
    public void backspaceBTNpush(View view){
        int cursorPos = display.getSelectionStart();
        int textLen = display.getText().length();

        if(cursorPos != 0 && textLen != 0)
        {
            SpannableStringBuilder selection = (SpannableStringBuilder)display.getText();
            selection.replace(cursorPos -1, cursorPos, "");
            display.setText(selection);
            display.setSelection(cursorPos-1);
        }
    }
    public void equalBTNpush(View view){
        String userExp = display.getText().toString();

        previousCalculator.setText(userExp);

        userExp = userExp.replaceAll(getResources().getString(R.string.divideText), "/");
        userExp = userExp.replaceAll(getResources().getString(R.string.multiplyText), "*");

        Expression exp = new Expression(userExp);
        String result = String.valueOf(exp.calculate());

        display.setText(result);
        display.setSelection(result.length());

    }

    public void sinBTN(View view){
        updateText("sin(");
    }

    public void cosBTN(View view){
        updateText("cos(");
    }

    public void tanBTN(View view){
        updateText("tan(");
    }

    public void minSinBTN(View view){
        updateText("arcsin(");
    }

    public void minCosBTN(View view){
        updateText("arccos(");
    }

    public void minTanBTN(View view){
        updateText("arctan(");
    }

    public void nlogBTN(View view){
        updateText("ln(");
    }

    public void logBTN(View view){
        updateText("log10(");
    }

    public void pierwBTN(View view){
        updateText("sqrt(");
    }

    public void warBzwglBTN(View view){
        updateText("abs(");
    }

    public void piBTN(View view){
        updateText("pi");
    }

    public void eBTN(View view){
        updateText("e");
    }

    public void potegaBTN(View view){
        updateText("^(2)");
    }

    public void potegiBTN(View view){
        updateText("^(");
    }

    public void pierwszaBTN(View view) {
        updateText("ispr(");

    }
}