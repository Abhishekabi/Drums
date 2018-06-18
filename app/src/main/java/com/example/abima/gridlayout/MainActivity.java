package com.example.abima.gridlayout;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

//    public void playMusic(View view) {
//        //Button id
//        int ID = view.getId();
//        String resource = view.getResources().getResourceEntryName(ID);
//        int identifier = view.getResources().getIdentifier(resource,"raw","com.example.abima.gridlayout");
//
//        mediaPlayer = MediaPlayer.create(this,identifier);
////        mediaPlayer.start();
//
//        mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
//            // Close the progress bar and play the video
//            public void onPrepared(MediaPlayer mp) {
//                if (mp != null)
//                    mp.start();
//            }
//        });
//
//    }


    public void playMusic(View view){
        int ID = view.getId();
        String resource = view.getResources().getResourceEntryName(ID);
        int identifier = view.getResources().getIdentifier(resource,"raw","com.example.abima.gridlayout");

        mediaPlayer = MediaPlayer.create(this,identifier);

        mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            // Close the progress bar and play the video
            public void onPrepared(MediaPlayer mp) {
                if (mp != null)
                    mp.start();
            }
        });

        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
    }



}
