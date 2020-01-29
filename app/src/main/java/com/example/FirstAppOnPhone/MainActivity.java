package com.example.FirstAppOnPhone;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView helloWorldText;
    Button clickeMeMainButton;
    Button stopMeButton; // i could not change the name on the button, since android studio froze

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //R => resources, .id er id navnet man har givet den man vil bruge
        helloWorldText = findViewById(R.id.MainText);

        helloWorldText.setText("Hør musik!");

        clickeMeMainButton = findViewById(R.id.MainButton);

        stopMeButton = findViewById(R.id.secondaryButton);

        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.sample);

        clickeMeMainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //kan gøre den til .append(" ") for at blive ved med at udskrive det, og fylde skærmen til sidst
                helloWorldText.setText("Nu har vi klikket!");
                mediaPlayer.start();
            }
        });
        stopMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.stop();
            }
        });


    }
}
