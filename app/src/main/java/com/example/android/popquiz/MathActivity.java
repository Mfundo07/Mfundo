package com.example.android.popquiz;

import android.content.Intent;
import android.graphics.Color;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import static android.os.Build.VERSION_CODES.M;

public class MathActivity extends AppCompatActivity {
    int scoreCard = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math);












        RadioGroup group1q = (RadioGroup) findViewById(R.id.maths_groupq1);

        group1q.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            RadioButton radioBquest1 = (RadioButton) findViewById(R.id.radio_button1_a1);
            RadioButton radioBquest2 = (RadioButton) findViewById(R.id.radio_button1_a2);
            RadioButton radioBquest3 = (RadioButton) findViewById(R.id.radio_button1_a3);
            RadioButton radioBquest4 = (RadioButton) findViewById(R.id.radio_button1_a4);

            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                boolean checkButton2 = radioBquest2.isChecked();
                boolean checkButton1 = radioBquest1.isChecked();
                boolean checkButton3 = radioBquest3.isChecked();
                boolean checkButton4 = radioBquest4.isChecked();


                if(checkButton2 == true){
                    if(checkButton1 == false || checkButton3 == false || checkButton4 == false ){
                    Toast.makeText(getApplicationContext(), "Correct!",
                             Toast.LENGTH_LONG).show();

                    scoreCard  = 10;
                    radioBquest2.setTextColor(Color.GREEN);
                    radioBquest3.setTextColor(Color.RED);
                    radioBquest4.setTextColor(Color.RED);
                    radioBquest1.setTextColor(Color.RED);
                    }

                    else{
                        scoreCard = 0;
                    }

                }
                if(checkButton1 == true){
                        Toast.makeText(getApplicationContext(), "Incorrect!",
                                Toast.LENGTH_LONG).show();
                    scoreCard += 0;
                    radioBquest2.setTextColor(Color.GREEN);
                    radioBquest3.setTextColor(Color.RED);
                    radioBquest4.setTextColor(Color.RED);
                    radioBquest1.setTextColor(Color.RED);

                }
                if(checkButton3 == true){
                    if(checkButton2 == false){
                        Toast.makeText(getApplicationContext(), "Incorrect!",
                                Toast.LENGTH_LONG).show();
                        scoreCard += 0;
                        radioBquest2.setTextColor(Color.GREEN);
                        radioBquest3.setTextColor(Color.RED);
                        radioBquest4.setTextColor(Color.RED);
                        radioBquest1.setTextColor(Color.RED);
                    }
                }
                if(checkButton4 == true){
                    if(checkButton2 == false){

                        Toast.makeText(getApplicationContext(), "Incorrect!",
                                Toast.LENGTH_LONG).show();
                        scoreCard += 0;
                        radioBquest2.setTextColor(Color.GREEN);
                        radioBquest3.setTextColor(Color.RED);
                        radioBquest4.setTextColor(Color.RED);
                        radioBquest1.setTextColor(Color.RED);
                    }
                }
                TextView finalScoreView = (TextView) findViewById(R.id.final_score);
                finalScoreView.setText(String.valueOf(scoreCard));




            }
        });

        RadioGroup group2q = (RadioGroup) findViewById(R.id.maths_groupq2);

        group2q.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            RadioButton radioB2quest1 = (RadioButton) findViewById(R.id.radio_button2_a1);
            RadioButton radioB2quest2 = (RadioButton) findViewById(R.id.radio_button2_a2);
            RadioButton radioB2quest3 = (RadioButton) findViewById(R.id.radio_button2_a3);
            RadioButton radioB2quest4 = (RadioButton) findViewById(R.id.radio_button2_a4);

            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                boolean checkButton2 = radioB2quest2.isChecked();
                boolean checkButton1 = radioB2quest1.isChecked();
                boolean checkButton3 = radioB2quest3.isChecked();
                boolean checkButton4 = radioB2quest4.isChecked();


                if(checkButton1 == true){
                    if(checkButton3 == false || checkButton2 == false || checkButton4 == false ){
                        scoreCard += 10;
                        Toast.makeText(getApplicationContext(), "Correct!",
                                Toast.LENGTH_LONG).show();

                        radioB2quest1.setTextColor(Color.GREEN);
                        radioB2quest3.setTextColor(Color.RED);
                        radioB2quest4.setTextColor(Color.RED);
                        radioB2quest2.setTextColor(Color.RED);
                    }

                    else{
                        scoreCard = 0;
                    }

                }
                if(checkButton2 == true){
                    Toast.makeText(getApplicationContext(), "Incorrect!",
                            Toast.LENGTH_LONG).show();
                    scoreCard += 0;
                    radioB2quest1.setTextColor(Color.GREEN);
                    radioB2quest2.setTextColor(Color.RED);
                    radioB2quest4.setTextColor(Color.RED);
                    radioB2quest3.setTextColor(Color.RED);

                }
                if(checkButton3 == true){
                    if(checkButton1 == false){

                        Toast.makeText(getApplicationContext(), "Incorrect!",
                                Toast.LENGTH_LONG).show();
                        scoreCard += 0;
                        radioB2quest1.setTextColor(Color.GREEN);
                        radioB2quest2.setTextColor(Color.RED);
                        radioB2quest4.setTextColor(Color.RED);
                        radioB2quest3.setTextColor(Color.RED);}

                }
                if(checkButton4 == true){
                    if(checkButton1 == false){

                        Toast.makeText(getApplicationContext(), "Incorrect!",
                                Toast.LENGTH_LONG).show();
                        scoreCard += 0;
                        radioB2quest1.setTextColor(Color.GREEN);
                        radioB2quest3.setTextColor(Color.RED);
                        radioB2quest4.setTextColor(Color.RED);
                        radioB2quest2.setTextColor(Color.RED);}

                }
                TextView finalScoreView = (TextView) findViewById(R.id.final_score);
                finalScoreView.setText(String.valueOf(scoreCard));




            }
        });

        RadioGroup group3q = (RadioGroup) findViewById(R.id.maths_groupq3);

        group3q.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            RadioButton radioB3quest1 = (RadioButton) findViewById(R.id.radio_button3_a1);
            RadioButton radioB3quest2 = (RadioButton) findViewById(R.id.radio_button3_a2);
            RadioButton radioB3quest3 = (RadioButton) findViewById(R.id.radio_button3_a3);
            RadioButton radioB3quest4 = (RadioButton) findViewById(R.id.radio_button3_a4);

            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                boolean checkButton2 = radioB3quest2.isChecked();
                boolean checkButton1 = radioB3quest1.isChecked();
                boolean checkButton3 = radioB3quest3.isChecked();
                boolean checkButton4 = radioB3quest4.isChecked();


                if(checkButton3 == true){
                    if(checkButton1 == false || checkButton2 == false || checkButton4 == false ){
                        scoreCard += 10;
                        Toast.makeText(getApplicationContext(), "Correct!",
                                Toast.LENGTH_LONG).show();


                        radioB3quest3.setTextColor(Color.GREEN);
                        radioB3quest2.setTextColor(Color.RED);
                        radioB3quest4.setTextColor(Color.RED);
                        radioB3quest1.setTextColor(Color.RED);
                    }

                    else{
                        scoreCard = 0;
                    }

                }
                if(checkButton1 == true){
                    Toast.makeText(getApplicationContext(), "Incorrect!",
                            Toast.LENGTH_LONG).show();
                    scoreCard += 0;
                    radioB3quest3.setTextColor(Color.GREEN);
                    radioB3quest2.setTextColor(Color.RED);
                    radioB3quest4.setTextColor(Color.RED);
                    radioB3quest1.setTextColor(Color.RED);

                }
                if(checkButton2 == true){
                        Toast.makeText(getApplicationContext(), "Incorrect!",
                                Toast.LENGTH_LONG).show();
                        scoreCard += 0;
                        radioB3quest3.setTextColor(Color.GREEN);
                        radioB3quest2.setTextColor(Color.RED);
                        radioB3quest4.setTextColor(Color.RED);
                        radioB3quest1.setTextColor(Color.RED);

                }
                if(checkButton4 == true){

                        Toast.makeText(getApplicationContext(), "Incorrect!",
                                Toast.LENGTH_LONG).show();
                        scoreCard += 0;
                        radioB3quest3.setTextColor(Color.GREEN);
                        radioB3quest2.setTextColor(Color.RED);
                        radioB3quest4.setTextColor(Color.RED);
                        radioB3quest1.setTextColor(Color.RED);

                }




            }
        });

        RadioGroup group4q = (RadioGroup) findViewById(R.id.maths_groupq4);

        group4q.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            RadioButton radioB4quest1 = (RadioButton) findViewById(R.id.radio_button4_a1);
            RadioButton radioB4quest2 = (RadioButton) findViewById(R.id.radio_button4_a2);
            RadioButton radioB4quest3 = (RadioButton) findViewById(R.id.radio_button4_a3);
            RadioButton radioB4quest4 = (RadioButton) findViewById(R.id.radio_button4_a4);

            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                boolean checkButton2 = radioB4quest2.isChecked();
                boolean checkButton1 = radioB4quest1.isChecked();
                boolean checkButton3 = radioB4quest3.isChecked();
                boolean checkButton4 = radioB4quest4.isChecked();


                if(checkButton2 == true){
                    if(checkButton1 == false || checkButton3 == false || checkButton4 == false ){
                        scoreCard += 10;
                        Toast.makeText(getApplicationContext(), "Correct!",
                                Toast.LENGTH_LONG).show();


                        radioB4quest2.setTextColor(Color.GREEN);
                        radioB4quest3.setTextColor(Color.RED);
                        radioB4quest4.setTextColor(Color.RED);
                        radioB4quest1.setTextColor(Color.RED);
                    }

                    else{
                        scoreCard = 0;
                    }

                }
                if(checkButton1 == true){
                    Toast.makeText(getApplicationContext(), "Incorrect!",
                            Toast.LENGTH_LONG).show();
                    scoreCard += 0;
                    radioB4quest2.setTextColor(Color.GREEN);
                    radioB4quest3.setTextColor(Color.RED);
                    radioB4quest4.setTextColor(Color.RED);
                    radioB4quest1.setTextColor(Color.RED);

                }
                if(checkButton3 == true){
                    if(checkButton2 == false){
                        Toast.makeText(getApplicationContext(), "Incorrect!",
                                Toast.LENGTH_LONG).show();
                        scoreCard += 0;
                        radioB4quest2.setTextColor(Color.GREEN);
                        radioB4quest3.setTextColor(Color.RED);
                        radioB4quest4.setTextColor(Color.RED);
                        radioB4quest1.setTextColor(Color.RED);
                    }
                }
                if(checkButton4 == true){
                    if(checkButton2 == false){

                        Toast.makeText(getApplicationContext(), "Incorrect!",
                                Toast.LENGTH_LONG).show();
                        scoreCard += 0;
                        radioB4quest2.setTextColor(Color.GREEN);
                        radioB4quest3.setTextColor(Color.RED);
                        radioB4quest4.setTextColor(Color.RED);
                        radioB4quest1.setTextColor(Color.RED);
                    }
                }
                TextView finalScoreView = (TextView) findViewById(R.id.final_score);
                finalScoreView.setText(String.valueOf(scoreCard));




            }
        });

        RadioGroup group5q = (RadioGroup) findViewById(R.id.maths_groupq5);

        group5q.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            RadioButton radioB5quest1 = (RadioButton) findViewById(R.id.radio_button5_a1);
            RadioButton radioB5quest2 = (RadioButton) findViewById(R.id.radio_button5_a2);
            RadioButton radioB5quest3 = (RadioButton) findViewById(R.id.radio_button5_a3);
            RadioButton radioB5quest4 = (RadioButton) findViewById(R.id.radio_button5_a4);

            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                boolean checkButton2 = radioB5quest2.isChecked();
                boolean checkButton1 = radioB5quest1.isChecked();
                boolean checkButton3 = radioB5quest3.isChecked();
                boolean checkButton4 = radioB5quest4.isChecked();


                if(checkButton3 == true){
                    if(checkButton1 == false || checkButton2 == false || checkButton4 == false ){
                        scoreCard += 10;
                        Toast.makeText(getApplicationContext(), "Correct!",
                                Toast.LENGTH_LONG).show();

                        radioB5quest3.setTextColor(Color.GREEN);
                        radioB5quest2.setTextColor(Color.RED);
                        radioB5quest4.setTextColor(Color.RED);
                        radioB5quest1.setTextColor(Color.RED);
                    }

                    else{
                        scoreCard = 0;
                    }

                }
                if(checkButton1 == true){
                    Toast.makeText(getApplicationContext(), "Incorrect!",
                            Toast.LENGTH_LONG).show();
                    scoreCard += 0;
                    radioB5quest3.setTextColor(Color.GREEN);
                    radioB5quest2.setTextColor(Color.RED);
                    radioB5quest4.setTextColor(Color.RED);
                    radioB5quest1.setTextColor(Color.RED);

                }
                if(checkButton2 == true){
                    if(checkButton3 == false){
                        Toast.makeText(getApplicationContext(), "Incorrect!",
                                Toast.LENGTH_LONG).show();
                        scoreCard += 0;
                        radioB5quest3.setTextColor(Color.GREEN);
                        radioB5quest2.setTextColor(Color.RED);
                        radioB5quest4.setTextColor(Color.RED);
                        radioB5quest1.setTextColor(Color.RED);
                    }
                }
                if(checkButton4 == true){
                    if(checkButton3 == false){

                        Toast.makeText(getApplicationContext(), "Incorrect!",
                                Toast.LENGTH_LONG).show();
                        scoreCard += 0;
                        radioB5quest3.setTextColor(Color.GREEN);
                        radioB5quest2.setTextColor(Color.RED);
                        radioB5quest4.setTextColor(Color.RED);
                        radioB5quest1.setTextColor(Color.RED);
                    }
                } TextView finalScoreView = (TextView) findViewById(R.id.final_score);
                finalScoreView.setText(String.valueOf(scoreCard));




            }
        });


    }


}
