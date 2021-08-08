package com.pankajkcodes.audiohandling;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;

public class MainActivity extends AppCompatActivity {
    MediaPlayer Player;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Player = MediaPlayer.create(this, R.raw.music);

    }
    public void Play(View view) {
     Player.start();
    }

    public void Prev(View view) {
        Player.pause();
    }

    public void next(View view) {
        Player.stop();

    }
}