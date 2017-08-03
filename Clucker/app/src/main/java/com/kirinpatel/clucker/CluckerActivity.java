package com.kirinpatel.clucker;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.Random;

public class CluckerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clucker);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ImageButton cluck = (ImageButton) findViewById(R.id.button_Cluck);
        cluck.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int[] media = { R.raw.cluck_1 };
                MediaPlayer.create(
                        getApplicationContext(),
                        media[new Random().nextInt(media.length)]
                        ).start();
                Toast.makeText(getApplicationContext(), "Cluck", Toast.LENGTH_SHORT).show();
            }
        });
    }

}
