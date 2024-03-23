package com.example.quiz_app.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.quiz_app.constants.Constants;
import com.example.quiz_app.R;

public class CategoryActivity extends AppCompatActivity implements View.OnClickListener{


    Button btMotivation,btVideoPrduction,btTesting,btPrograming,btDigitalMarketing,btAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        btMotivation = findViewById(R.id.bt_Motivation);
        btVideoPrduction = findViewById(R.id.bt_VideoProduction);
        btAnimation = findViewById(R.id.bt_Animation);
        btDigitalMarketing = findViewById(R.id.bt_DigitalMarketing);
        btPrograming = findViewById(R.id.bt_Programing);
        btTesting = findViewById(R.id.bt_Testing);

        btMotivation.setOnClickListener(this);
        btVideoPrduction.setOnClickListener(this);
        btAnimation.setOnClickListener(this);
        btDigitalMarketing.setOnClickListener(this);
        btPrograming.setOnClickListener(this);
        btTesting.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        if (view.getId() == R.id.bt_VideoProduction) {
            Intent intentVideoProduction = new Intent(CategoryActivity.this, QuizActivity2.class);
            intentVideoProduction.putExtra("Category", Constants.VIDEO_PRODUCTION);
            startActivity(intentVideoProduction);
            finish();
        } else if (view.getId() == R.id.bt_Programing) {
            Intent intentPrograming = new Intent(CategoryActivity.this, QuizActivity2.class);
            intentPrograming.putExtra("Category", Constants.PROGRAMING);
            startActivity(intentPrograming);
            finish();
        } else if (view.getId() == R.id.bt_Motivation) {
            Intent intentMotivation = new Intent(CategoryActivity.this, QuizActivity2.class);
            intentMotivation.putExtra("Category", Constants.MOTIVATION);
            startActivity(intentMotivation);
            finish();
        } else if (view.getId() == R.id.bt_Animation) {
            Intent intentAnimation = new Intent(CategoryActivity.this, QuizActivity2.class);
            intentAnimation.putExtra("Category", Constants.ANIMATION);
            startActivity(intentAnimation);
            finish();
        } else if (view.getId() == R.id.bt_Testing) {
            Intent intentTesting = new Intent(CategoryActivity.this, QuizActivity2.class);
            intentTesting.putExtra("Category", Constants.TESTING);
            startActivity(intentTesting);
            finish();
        } else if (view.getId() == R.id.bt_DigitalMarketing) {
            Intent intenDigitalMarketing = new Intent(CategoryActivity.this, QuizActivity2.class);
            intenDigitalMarketing.putExtra("Category", Constants.DIGITALMARKETING);
            startActivity(intenDigitalMarketing);
            finish();
        }

    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(CategoryActivity.this, HomeScreen.class);
        startActivity(intent);
        finish();
    }

}
