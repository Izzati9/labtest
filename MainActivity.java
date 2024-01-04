package com.tuto.mindsharpened;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    //private static final String LOG_TAG = "MindSharpener;
    private TextView textView,textview4,textview6;
    private Button check;

    Random random = new Random();

    int randomNumber = new random.nextInt(100);

    int number = 0; //random number between 0 - 99
    /*Number num;
    num = (TextView)findViewById(R.id.textview1);*/

    int operator; //can be any operator such as : +,-,*,/.

    //randomNumber between 0 and 4 to be set.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        random = (RadioGroup)findViewById(R.id.radiogroup1);
        random = (RadioButton)findViewById(R.id.radiobtn1);
        random = (RadioButton)findViewById(R.id.radiobtn2);
        random = (RadioButton)findViewById(R.id.radiobtn3);

        if (random(R.id.radiobtn1) <= 8){
            println:"Maximum one - digit question, for example: 1 + 8";
        }
        else if (random(R.id.radiobtn2) <= 98){
            println:"Maximum 2 digits question, for example: 98 - 3";
        }
        else(random(R.id.radiobtn3) < 986){
            println:"Maximum 3 digits questions, for example: 986 * 5";
        }

        randomNumber = (TextView)findViewById(R.id.textview4);
        randomNumber = (TextView)findViewById(R.id.textview6);
        randomNumber = (TextView)findViewById(R.id.result);
        //Random.nextInt(1000) will return number between 0 - 999
        //2 numbers need run 2 times
        operator = (TextView)findViewById(R.id.operator);

        //algorithm operands
        if (number != randomNumber){
            //random() = randomNumber; [instantiate random class]
            R.id.radioButton =  //want to check radiobutton
            randomNumber = +1;
        } else if (number <= randomNumber) {
            randomNumber = +98;
        }
        else {
            randomNumber = 986;
        }

        showResult = (TextView)findViewById(R.id.result);

    }
    public void radiobtn1(View v){

    }
}
