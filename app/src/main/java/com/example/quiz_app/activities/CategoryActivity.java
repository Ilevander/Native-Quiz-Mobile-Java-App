package com.example.quiz_app.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.quiz_app.constants.Constants;
import com.example.quiz_app.R;

public class CategoryActivity extends AppCompatActivity implements View.OnClickListener {

    Button btMotivation, btVideoProduction, btTesting, btPrograming, btDigitalMarketing, btAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        btMotivation = findViewById(R.id.bt_Motivation);
        btVideoProduction = findViewById(R.id.bt_VideoProduction);
        btAnimation = findViewById(R.id.bt_Animation);
        btDigitalMarketing = findViewById(R.id.bt_DigitalMarketing);
        btPrograming = findViewById(R.id.bt_Programing);
        btTesting = findViewById(R.id.bt_Testing);

        btMotivation.setOnClickListener(this);
        btVideoProduction.setOnClickListener(this);
        btAnimation.setOnClickListener(this);
        btDigitalMarketing.setOnClickListener(this);
        btPrograming.setOnClickListener(this);
        btTesting.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(CategoryActivity.this, QuizActivity2.class);

        switch (view.getId()) {
            case R.id.bt_VideoProduction:
                intent.putExtra("Category", Constants.VIDEO_PRODUCTION);
                break;
            case R.id.bt_Programing:
                intent.putExtra("Category", Constants.PROGRAMING);
                break;
            case R.id.bt_Motivation:
                intent.putExtra("Category", Constants.MOTIVATION);
                break;
            case R.id.bt_Animation:
                intent.putExtra("Category", Constants.ANIMATION);
                break;
            case R.id.bt_Testing:
                intent.putExtra("Category", Constants.TESTING);
                break;
            case R.id.bt_DigitalMarketing:
                intent.putExtra("Category", Constants.DIGITALMARKETING);
                break;
        }

        startActivity(intent);
        finish();
    }
}
