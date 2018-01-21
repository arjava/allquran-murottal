package com.arjava.allquranmurottal;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;

import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    int id_surah = 001;
    String url = "http://all-quran.net/documents/Abd_Al_Muhsin_Al_Qasim/Abd_Al_Muhsin_Al_Qasim_files/001.mp3";
    String url_abdul_al_baset = "http://all-quran.net/documents/Abd_Al_Baset_Muratal/Abd_Al_Baset_Muratal_files/"+id_surah+".mp3";
    String url_mishari_al_efasy = "http://www.all-quran.com/documents/Mishary-Al-Efasy/Mishary-Al-Efasy_files/"+id_surah+".mp3";
    Button start, pause, stop;
    MediaPlayer mediaPlayer;
    TextView tvStatus;
    ImageView img_replay;
    private String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mediaPlayer = new MediaPlayer();
        start = findViewById(R.id.btn_start);
        pause = findViewById(R.id.btn_pause);
        stop = findViewById(R.id.btn_stop);
        img_replay = findViewById(R.id.img_replay);

        tvStatus = findViewById(R.id.tvStatus);

        //mengatur tipe streaming
        mediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);

        //dengarkan jika file audio tidak bisa disiapkan
        mediaPlayer.setOnErrorListener(new MediaPlayer.OnErrorListener() {
            @Override
            public boolean onError(MediaPlayer mediaPlayer, int i, int i1) {
//                react appropriately ...
                // The MediaPlayer has moved to the Error state, must be reset!
                return false;
            }
        });

        //Lampirkan saat file audio disiapkan untuk diputar
        mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                mediaPlayer.start();
            }
        });

        //Set the data source to the remote URL
        try {
            mediaPlayer.setDataSource(url_abdul_al_baset);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Memicu persiapan async yang akan memberi pendengar saat selesai
        mediaPlayer.prepareAsync();
        mediaPlayer.start();

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.start();
                tvStatus.setText(R.string.resume);
            }
        });

        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.pause();
                tvStatus.setText(R.string.pause);
                id_surah = id_surah+1;
                Log.d(TAG, "onClick: ID_Surah = "+id_surah);
            }
        });

        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.stop();
                tvStatus.setText(R.string.stop);
            }
        });

        img_replay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.start();
                tvStatus.setText(R.string.replay);
            }
        });

    }
}
