package com.example.android.popquiz;

import android.graphics.Color;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import static com.example.android.popquiz.R.id.radio_button2_a1;

public class PhysicsActivity extends AppCompatActivity {

    int scoreCard = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physics);












        RadioGroup pgroup1q = (RadioGroup) findViewById(R.id.pradio_group1);

        pgroup1q.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            RadioButton pradioBquest1 = (RadioButton) findViewById(R.id.pradio_button_q1a1);
            RadioButton pradioBquest2 = (RadioButton) findViewById(R.id.pradio_button_q1a2);
            RadioButton pradioBquest3 = (RadioButton) findViewById(R.id.pradio_button_q1a3);
            RadioButton pradioBquest4 = (RadioButton) findViewById(R.id.pradio_button_q1a4);

            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                boolean pcheckButton2 = pradioBquest2.isChecked();
                boolean pcheckButton1 = pradioBquest1.isChecked();
                boolean pcheckButton3 = pradioBquest3.isChecked();
                boolean pcheckButton4 = pradioBquest4.isChecked();


                if(pcheckButton1 == true){
                    if(pcheckButton2 == false || pcheckButton3 == false || pcheckButton4 == false ){
                        Toast.makeText(getApplicationContext(), "Correct!",
                                Toast.LENGTH_LONG).show();

                        scoreCard  = 10;
                        pradioBquest1.setTextColor(Color.GREEN);
                        pradioBquest3.setTextColor(Color.RED);
                        pradioBquest4.setTextColor(Color.RED);
                        pradioBquest2.setTextColor(Color.RED);
                    }

                    else{
                        scoreCard = 0;
                    }

                }
                if(pcheckButton2 == true){
                    Toast.makeText(getApplicationContext(), "Incorrect!",
                            Toast.LENGTH_LONG).show();
                    scoreCard += 0;
                    pradioBquest1.setTextColor(Color.GREEN);
                    pradioBquest3.setTextColor(Color.RED);
                    pradioBquest4.setTextColor(Color.RED);
                    pradioBquest2.setTextColor(Color.RED);

                }
                if(pcheckButton3 == true){
                    if(pcheckButton1 == false){
                        Toast.makeText(getApplicationContext(), "Incorrect!",
                                Toast.LENGTH_LONG).show();
                        scoreCard += 0;
                        pradioBquest1.setTextColor(Color.GREEN);
                        pradioBquest3.setTextColor(Color.RED);
                        pradioBquest4.setTextColor(Color.RED);
                        pradioBquest2.setTextColor(Color.RED);
                    }
                }
                if(pcheckButton4 == true){
                    if(pcheckButton1 == false){

                        Toast.makeText(getApplicationContext(), "Incorrect!",
                                Toast.LENGTH_LONG).show();
                        scoreCard += 0;
                        pradioBquest1.setTextColor(Color.GREEN);
                        pradioBquest3.setTextColor(Color.RED);
                        pradioBquest4.setTextColor(Color.RED);
                        pradioBquest2.setTextColor(Color.RED);
                    }
                }
                TextView finalScoreView = (TextView) findViewById(R.id.final_pscore);
                finalScoreView.setText(String.valueOf(scoreCard));




            }
        });

        RadioGroup pgroup2q = (RadioGroup) findViewById(R.id.pradio_group2);

        pgroup2q.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            RadioButton pradioB2quest1 = (RadioButton) findViewById(R.id.pradio_button_q2a1);
            RadioButton pradioB2quest2 = (RadioButton) findViewById(R.id.pradio_button_q2a2);
            RadioButton pradioB2quest3 = (RadioButton) findViewById(R.id.pradio_button_q2a3);
            RadioButton pradioB2quest4 = (RadioButton) findViewById(R.id.pradio_button_q2a4);

            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                boolean checkButton2 = pradioB2quest2.isChecked();
                boolean checkButton1 = pradioB2quest1.isChecked();
                boolean checkButton3 = pradioB2quest3.isChecked();
                boolean checkButton4 = pradioB2quest4.isChecked();


                if(checkButton4 == true){
                    if(checkButton1 == false || checkButton3 == false || checkButton2 == false ){
                        scoreCard += 10;
                        Toast.makeText(getApplicationContext(), "Correct!",
                                Toast.LENGTH_LONG).show();

                        pradioB2quest4.setTextColor(Color.GREEN);
                        pradioB2quest1.setTextColor(Color.RED);
                        pradioB2quest2.setTextColor(Color.RED);
                        pradioB2quest3.setTextColor(Color.RED);
                    }

                    else{
                        scoreCard = 0;
                    }

                }
                if(checkButton2 == true){
                    Toast.makeText(getApplicationContext(), "Incorrect!",
                            Toast.LENGTH_LONG).show();
                    scoreCard += 0;
                    pradioB2quest4.setTextColor(Color.GREEN);
                    pradioB2quest3.setTextColor(Color.RED);
                    pradioB2quest2.setTextColor(Color.RED);
                    pradioB2quest1.setTextColor(Color.RED);

                }
                if(checkButton3 == true){
                    if(checkButton4 == false){

                        Toast.makeText(getApplicationContext(), "Incorrect!",
                                Toast.LENGTH_LONG).show();
                        scoreCard += 0;
                        pradioB2quest4.setTextColor(Color.GREEN);
                        pradioB2quest3.setTextColor(Color.RED);
                        pradioB2quest2.setTextColor(Color.RED);
                        pradioB2quest1.setTextColor(Color.RED);}

                }
                if(checkButton1 == true){
                    if(checkButton4 == false){

                        Toast.makeText(getApplicationContext(), "Incorrect!",
                                Toast.LENGTH_LONG).show();
                        scoreCard += 0;
                        pradioB2quest4.setTextColor(Color.GREEN);
                        pradioB2quest1.setTextColor(Color.RED);
                        pradioB2quest2.setTextColor(Color.RED);
                        pradioB2quest3.setTextColor(Color.RED);}

                }
                TextView finalScoreView = (TextView) findViewById(R.id.final_pscore);
                finalScoreView.setText(String.valueOf(scoreCard));




            }
        });

        RadioGroup pgroup3q = (RadioGroup) findViewById(R.id.pradio_group3);

        pgroup3q.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            RadioButton pradioB3quest1 = (RadioButton) findViewById(R.id.pradio_button_q3a1);
            RadioButton pradioB3quest2 = (RadioButton) findViewById(R.id.pradio_button_q3a2);
            RadioButton pradioB3quest3 = (RadioButton) findViewById(R.id.pradio_button_q3a3);
            RadioButton pradioB3quest4 = (RadioButton) findViewById(R.id.pradio_button_q3a4);

            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                boolean checkButton2 = pradioB3quest2.isChecked();
                boolean checkButton1 = pradioB3quest1.isChecked();
                boolean checkButton3 = pradioB3quest3.isChecked();
                boolean checkButton4 = pradioB3quest4.isChecked();


                if(checkButton3 == true){
                    if(checkButton1 == false || checkButton2 == false || checkButton4 == false ){
                        scoreCard += 10;
                        Toast.makeText(getApplicationContext(), "Correct!",
                                Toast.LENGTH_LONG).show();


                        pradioB3quest3.setTextColor(Color.GREEN);
                        pradioB3quest2.setTextColor(Color.RED);
                        pradioB3quest4.setTextColor(Color.RED);
                        pradioB3quest1.setTextColor(Color.RED);
                    }

                    else{
                        scoreCard = 0;
                    }

                }
                if(checkButton1 == true){
                    Toast.makeText(getApplicationContext(), "Incorrect!",
                            Toast.LENGTH_LONG).show();
                    scoreCard += 0;
                    pradioB3quest3.setTextColor(Color.GREEN);
                    pradioB3quest2.setTextColor(Color.RED);
                    pradioB3quest4.setTextColor(Color.RED);
                    pradioB3quest1.setTextColor(Color.RED);

                }
                if(checkButton2 == true){
                    Toast.makeText(getApplicationContext(), "Incorrect!",
                            Toast.LENGTH_LONG).show();
                    scoreCard += 0;
                    pradioB3quest3.setTextColor(Color.GREEN);
                    pradioB3quest2.setTextColor(Color.RED);
                    pradioB3quest4.setTextColor(Color.RED);
                    pradioB3quest1.setTextColor(Color.RED);

                }
                if(checkButton4 == true){

                    Toast.makeText(getApplicationContext(), "Incorrect!",
                            Toast.LENGTH_LONG).show();
                    scoreCard += 0;
                    pradioB3quest3.setTextColor(Color.GREEN);
                    pradioB3quest2.setTextColor(Color.RED);
                    pradioB3quest4.setTextColor(Color.RED);
                    pradioB3quest1.setTextColor(Color.RED);

                }




            }
        });

        RadioGroup pgroup4q = (RadioGroup) findViewById(R.id.pradio_group4);

        pgroup4q.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            RadioButton radioB4quest1 = (RadioButton) findViewById(R.id.pradio_button_q4a1);
            RadioButton radioB4quest2 = (RadioButton) findViewById(R.id.pradio_button_q4a2);
            RadioButton radioB4quest3 = (RadioButton) findViewById(R.id.pradio_button_q4a3);
            RadioButton radioB4quest4 = (RadioButton) findViewById(R.id.pradio_button_q4a4);

            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                boolean checkButton2 = radioB4quest2.isChecked();
                boolean checkButton1 = radioB4quest1.isChecked();
                boolean checkButton3 = radioB4quest3.isChecked();
                boolean checkButton4 = radioB4quest4.isChecked();


                if(checkButton3 == true){
                    if(checkButton2 == false || checkButton4 == false || checkButton1 == false ){
                        scoreCard += 10;
                        Toast.makeText(getApplicationContext(), "Correct!",
                                Toast.LENGTH_LONG).show();


                        radioB4quest3.setTextColor(Color.GREEN);
                        radioB4quest4.setTextColor(Color.RED);
                        radioB4quest1.setTextColor(Color.RED);
                        radioB4quest2.setTextColor(Color.RED);
                    }

                    else{
                        scoreCard = 0;
                    }

                }
                if(checkButton2 == true){
                    Toast.makeText(getApplicationContext(), "Incorrect!",
                            Toast.LENGTH_LONG).show();
                    scoreCard += 0;
                    radioB4quest3.setTextColor(Color.GREEN);
                    radioB4quest4.setTextColor(Color.RED);
                    radioB4quest1.setTextColor(Color.RED);
                    radioB4quest2.setTextColor(Color.RED);

                }
                if(checkButton4 == true){
                    if(checkButton3 == false){
                        Toast.makeText(getApplicationContext(), "Incorrect!",
                                Toast.LENGTH_LONG).show();
                        scoreCard += 0;
                        radioB4quest3.setTextColor(Color.GREEN);
                        radioB4quest4.setTextColor(Color.RED);
                        radioB4quest1.setTextColor(Color.RED);
                        radioB4quest2.setTextColor(Color.RED);
                    }
                }
                if(checkButton1 == true){
                    if(checkButton3 == false){

                        Toast.makeText(getApplicationContext(), "Incorrect!",
                                Toast.LENGTH_LONG).show();
                        scoreCard += 0;
                        radioB4quest3.setTextColor(Color.GREEN);
                        radioB4quest4.setTextColor(Color.RED);
                        radioB4quest1.setTextColor(Color.RED);
                        radioB4quest2.setTextColor(Color.RED);
                    }
                }
                TextView finalScoreView = (TextView) findViewById(R.id.final_pscore);
                finalScoreView.setText(String.valueOf(scoreCard));




            }
        });

        RadioGroup pgroup5q = (RadioGroup) findViewById(R.id.pradio_group5);

        pgroup5q.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            RadioButton radioB5quest1 = (RadioButton) findViewById(R.id.pradio_button_q5a1);
            RadioButton radioB5quest2 = (RadioButton) findViewById(R.id.pradio_button_q5a2);
            RadioButton radioB5quest3 = (RadioButton) findViewById(R.id.pradio_button_q5a3);
            RadioButton radioB5quest4 = (RadioButton) findViewById(R.id.pradio_button_q5a4);

            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                boolean checkButton2 = radioB5quest2.isChecked();
                boolean checkButton1 = radioB5quest1.isChecked();
                boolean checkButton3 = radioB5quest3.isChecked();
                boolean checkButton4 = radioB5quest4.isChecked();


                if(checkButton1 == true){
                    if(checkButton4 == false || checkButton2 == false || checkButton3 == false ){
                        scoreCard += 10;
                        Toast.makeText(getApplicationContext(), "Correct!",
                                Toast.LENGTH_LONG).show();

                        radioB5quest1.setTextColor(Color.GREEN);
                        radioB5quest2.setTextColor(Color.RED);
                        radioB5quest3.setTextColor(Color.RED);
                        radioB5quest4.setTextColor(Color.RED);
                    }

                    else{
                        scoreCard = 0;
                    }

                }
                if(checkButton4 == true){
                    Toast.makeText(getApplicationContext(), "Incorrect!",
                            Toast.LENGTH_LONG).show();
                    scoreCard += 0;
                    radioB5quest1.setTextColor(Color.GREEN);
                    radioB5quest2.setTextColor(Color.RED);
                    radioB5quest4.setTextColor(Color.RED);
                    radioB5quest3.setTextColor(Color.RED);

                }
                if(checkButton2 == true){
                    if(checkButton1 == false){
                        Toast.makeText(getApplicationContext(), "Incorrect!",
                                Toast.LENGTH_LONG).show();
                        scoreCard += 0;
                        radioB5quest1.setTextColor(Color.GREEN);
                        radioB5quest2.setTextColor(Color.RED);
                        radioB5quest4.setTextColor(Color.RED);
                        radioB5quest3.setTextColor(Color.RED);
                    }
                }
                if(checkButton3 == true){
                    if(checkButton1 == false){

                        Toast.makeText(getApplicationContext(), "Incorrect!",
                                Toast.LENGTH_LONG).show();
                        scoreCard += 0;
                        radioB5quest1.setTextColor(Color.GREEN);
                        radioB5quest2.setTextColor(Color.RED);
                        radioB5quest4.setTextColor(Color.RED);
                        radioB5quest3.setTextColor(Color.RED);
                    }
                } TextView finalScoreView = (TextView) findViewById(R.id.final_pscore);
                TextView final_message = (TextView) findViewById(R.id.message_final);
                if(scoreCard == 50){

                    final_message.setText("Congrats!");
                }
                finalScoreView.setText(String.valueOf(scoreCard));




            }
        });


    }
}
