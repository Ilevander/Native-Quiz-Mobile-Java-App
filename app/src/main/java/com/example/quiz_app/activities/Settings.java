package com.example.quiz_app.activities;

import static com.example.quiz_app.utils.AppController.StopSound;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Switch;

import androidx.appcompat.app.AppCompatActivity;

import com.example.quiz_app.R;
import com.example.quiz_app.utils.AppController;
import com.example.quiz_app.utils.SettingsPreferences;

public class Settings extends AppCompatActivity {

    private Context mContext;
    private Switch mMusicCheckBox;
    private ImageView ok_btn;
    private boolean isMusicOn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        mContext = Settings.this;
        AppController.currentActivity = this;

        intitViews();

        populateMusicEnalbeContents();
    }

    private void intitViews() {

        mMusicCheckBox = findViewById(R.id.music_checkbox);
        mMusicCheckBox.setChecked(true);
        ok_btn = findViewById(R.id.bt_settings);
        ok_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToPlayScreen();
            }
        });

    }

    private void goToPlayScreen() {

        Intent intentPlayScreen = new Intent(Settings.this, HomeScreen.class);
        startActivity(intentPlayScreen);
        finish();

    }

    public void viewClickHandler(View view) {
        int viewId = view.getId();

        if (viewId == R.id.music_checkbox) {
            switchMusicEnableCheckbox();
        }
    }


    private void switchMusicEnableCheckbox() {

        isMusicOn = !isMusicOn;
        if (isMusicOn){
            SettingsPreferences.setMusicEnableDisable(mContext,true);
            AppController.playMusic();

        }else {
            SettingsPreferences.setMusicEnableDisable(mContext,false);
            StopSound();
        }

        populateMusicEnalbeContents();

    }


    protected void populateMusicEnalbeContents(){

        if (SettingsPreferences.getMusicEnableDisable(mContext)){
            AppController.playMusic();
            mMusicCheckBox.setChecked(true);
        }else {
            StopSound();
            mMusicCheckBox.setChecked(false);
        }
        isMusicOn = SettingsPreferences.getMusicEnableDisable(mContext);

    }

    @Override
    protected void onStop() {
        super.onStop();
        finish();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        finish();
    }

}
