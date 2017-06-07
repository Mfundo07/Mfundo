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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physics);

        Button btn = (Button) findViewById(R.id.button_next_physics);


     btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              ViewFlipper  vf = (ViewFlipper) findViewById(R.id.physics_view_flipper);
                vf.showPrevious();

            }
        });


    }


}
