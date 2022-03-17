package com.example.conseils;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    Button lirelasuite1;
    Button lirelasuite2;
    Button lirelasuite3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lirelasuite1 = findViewById(R.id.lirelasuite1);
        lirelasuite1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Lirelasuite1.class);
                startActivity(intent);
            }
        });

        lirelasuite2 = findViewById(R.id.lirelasuite2);
        lirelasuite2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Lirelasuite2.class);
                startActivity(intent);
            }
        });
        lirelasuite3 = findViewById(R.id.lirelasuite3);
        lirelasuite3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Lirelasuite3.class);
                startActivity(intent);
            }
        });

        VideoView videoView = (VideoView) findViewById(R.id.videoView);
videoView.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.videoclip));

        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        videoView.start();

    }
}