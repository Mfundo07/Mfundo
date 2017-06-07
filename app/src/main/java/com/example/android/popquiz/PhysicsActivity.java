package com.example.android.popquiz;

import android.animation.LayoutTransition;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.graphics.Color;
import android.support.annotation.IdRes;
import android.support.transition.Fade;
import android.support.transition.Scene;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewFlipper;

import org.w3c.dom.Text;

import static android.R.attr.button;
import static android.R.attr.targetId;
import static android.R.attr.thickness;
import static com.example.android.popquiz.R.id.physics_question1;
import static com.example.android.popquiz.R.id.radio_button2_a1;
import static com.example.android.popquiz.R.id.transition_current_scene;

public class PhysicsActivity extends AppCompatActivity {

    int count = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physics);

        Button physicsNextButton = (Button) findViewById(R.id.button_next_physics);
        final Button question1option1 = (Button) findViewById(R.id.physics_question1_option1);
        final Button question1option2 = (Button) findViewById(R.id.physics_question1_option2);
        final Button question1option3 = (Button) findViewById(R.id.physics_question1_option3);
        final Button question1option4 = (Button) findViewById(R.id.physics_question1_option4);
        final Button question2option1 = (Button) findViewById(R.id.physics_question2_option1);
        final Button question2option2 = (Button) findViewById(R.id.physics_question2_option2);
        final Button question2option3 = (Button) findViewById(R.id.physics_question2_option3);
        final Button question2option4 = (Button) findViewById(R.id.physics_question2_option4);
        final Button question3option1 = (Button) findViewById(R.id.physics_question3_option1);
        final Button question3option2 = (Button) findViewById(R.id.physics_question3_option2);
        final Button question3option3 = (Button) findViewById(R.id.physics_question3_option3);
        final Button question3option4 = (Button) findViewById(R.id.physics_question3_option4);
        final Button question4option1 = (Button) findViewById(R.id.physics_question4_option1);
        final Button question4option2 = (Button) findViewById(R.id.physics_question4_option2);
        final Button question4option3 = (Button) findViewById(R.id.physics_question4_option3);
        final Button question4option4 = (Button) findViewById(R.id.physics_question4_option4);
        final Button question5option1 = (Button) findViewById(R.id.physics_question5_option1);
        final Button question5option2 = (Button) findViewById(R.id.physics_question5_option2);
        final Button question5option3 = (Button) findViewById(R.id.physics_question5_option3);
        final Button question5option4 = (Button) findViewById(R.id.physics_question5_option4);




     physicsNextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              ViewFlipper  vf = (ViewFlipper) findViewById(R.id.physics_view_flipper);
                count++;
                if (count <= 4){
                vf.showPrevious();}
                else{
                    vf.stopFlipping();
                }


            }
        });
        question1option1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                question1option1.setBackgroundColor(Color.CYAN);
                question1option1.setEnabled(false);
                question1option2.setEnabled(false);
                question1option3.setEnabled(false);
                question1option4.setEnabled(false);
            }
        });

        question1option2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                question1option2.setBackgroundColor(Color.CYAN);
                question1option2.setEnabled(false);
                question1option1.setEnabled(false);
                question1option3.setEnabled(false);
                question1option4.setEnabled(false);
            }
        });

        question1option3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                question1option3.setBackgroundColor(Color.CYAN);
                question1option3.setEnabled(false);
                question1option2.setEnabled(false);
                question1option1.setEnabled(false);
                question1option4.setEnabled(false);
            }
        });

        question1option4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                question1option4.setBackgroundColor(Color.CYAN);
                question1option4.setEnabled(false);
                question1option2.setEnabled(false);
                question1option3.setEnabled(false);
                question1option1.setEnabled(false);
            }
        });

        question2option1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                question2option1.setBackgroundColor(Color.CYAN);
                question2option1.setEnabled(false);
                question2option2.setEnabled(false);
                question2option3.setEnabled(false);
                question2option4.setEnabled(false);
            }
        });

        question2option2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                question2option2.setBackgroundColor(Color.CYAN);
                question2option2.setEnabled(false);
                question2option1.setEnabled(false);
                question2option3.setEnabled(false);
                question2option4.setEnabled(false);
            }
        });
        question2option3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                question2option3.setBackgroundColor(Color.CYAN);
                question2option3.setEnabled(false);
                question2option2.setEnabled(false);
                question2option1.setEnabled(false);
                question2option4.setEnabled(false);
            }
        });

        question2option4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                question2option4.setBackgroundColor(Color.CYAN);
                question2option4.setEnabled(false);
                question2option2.setEnabled(false);
                question2option3.setEnabled(false);
                question2option1.setEnabled(false);
            }
        });

        question3option1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                question3option1.setBackgroundColor(Color.CYAN);
                question3option1.setEnabled(false);
                question3option2.setEnabled(false);
                question3option3.setEnabled(false);
                question3option4.setEnabled(false);
            }
        });

        question3option2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                question3option2.setBackgroundColor(Color.CYAN);
                question3option2.setEnabled(false);
                question3option1.setEnabled(false);
                question3option3.setEnabled(false);
                question3option4.setEnabled(false);
            }
        });

        question3option3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                question3option3.setBackgroundColor(Color.CYAN);
                question3option3.setEnabled(false);
                question3option2.setEnabled(false);
                question3option1.setEnabled(false);
                question3option4.setEnabled(false);
            }
        });

        question3option4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                question3option4.setBackgroundColor(Color.CYAN);
                question3option4.setEnabled(false);
                question3option2.setEnabled(false);
                question3option3.setEnabled(false);
                question3option1.setEnabled(false);
            }
        });

        question4option1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                question4option1.setBackgroundColor(Color.CYAN);
                question4option1.setEnabled(false);
                question4option2.setEnabled(false);
                question4option3.setEnabled(false);
                question4option4.setEnabled(false);
            }
        });

        question4option2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                question4option2.setBackgroundColor(Color.CYAN);
                question4option2.setEnabled(false);
                question4option1.setEnabled(false);
                question4option3.setEnabled(false);
                question4option4.setEnabled(false);
            }
        });

        question4option3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                question4option3.setBackgroundColor(Color.CYAN);
                question4option3.setEnabled(false);
                question4option2.setEnabled(false);
                question4option1.setEnabled(false);
                question4option4.setEnabled(false);
            }
        });

        question4option4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                question4option4.setBackgroundColor(Color.CYAN);
                question4option4.setEnabled(false);
                question4option2.setEnabled(false);
                question4option3.setEnabled(false);
                question4option1.setEnabled(false);
            }
        });

        question5option1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                question5option1.setBackgroundColor(Color.CYAN);
                question5option1.setEnabled(false);
                question5option2.setEnabled(false);
                question5option3.setEnabled(false);
                question5option4.setEnabled(false);
            }
        });

        question5option2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                question5option2.setBackgroundColor(Color.CYAN);
                question5option2.setEnabled(false);
                question5option1.setEnabled(false);
                question5option3.setEnabled(false);
                question5option4.setEnabled(false);
            }
        });

        question5option3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                question5option3.setBackgroundColor(Color.CYAN);
                question5option3.setEnabled(false);
                question5option2.setEnabled(false);
                question5option1.setEnabled(false);
                question5option4.setEnabled(false);
            }
        });

        question5option4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                question5option4.setBackgroundColor(Color.CYAN);
                question5option4.setEnabled(false);
                question5option2.setEnabled(false);
                question5option3.setEnabled(false);
                question5option1.setEnabled(false);
            }
        });




    }


}
