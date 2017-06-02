package com.example.android.popquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void openPhysics(View v){

        Intent physics = new Intent(this,PhysicsActivity.class);
        startActivity(physics);
    }

    public void openMaths(View v){

        Intent maths = new Intent(this,MathActivity.class);
        startActivity(maths);
    }

    public void openEnglish(View v){

        Intent english = new Intent(this, EnglishActivity.class);
        startActivity(english);
    }

}
