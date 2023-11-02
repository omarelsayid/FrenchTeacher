package com.example.frenchteacher;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
Button redBTN,yellowBTN,balckBTN,purpelBTN,greenBTN;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        redBTN=findViewById(R.id.redBTN);
        yellowBTN=findViewById(R.id.yellowBTN);
        balckBTN=findViewById(R.id.blackBTN);
        purpelBTN=findViewById(R.id.purpelBTN);
        greenBTN=findViewById(R.id.greenBTN);
//        redBTN.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                MediaPlayer mediaPlayer= MediaPlayer.create(
//                        getApplicationContext(),
//                        R.raw.red
//                );
//                mediaPlayer.start();
//            }
//        });
//        balckBTN.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                MediaPlayer mediaPlayer= MediaPlayer.create(
//                        getApplicationContext(),
//                        R.raw.black
//                );
//                mediaPlayer.start();
//            }
//        });
//        yellowBTN.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                MediaPlayer mediaPlayer= MediaPlayer.create(
//                        getApplicationContext(),
//                        R.raw.yellow
//                );
//                mediaPlayer.start();
//            }
//        });
//        purpelBTN.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                MediaPlayer mediaPlayer= MediaPlayer.create(
//                        getApplicationContext(),
//                        R.raw.purple
//                );
//                mediaPlayer.start();
//            }
//        });
//        greenBTN.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                MediaPlayer mediaPlayer= MediaPlayer.create(
//                        getApplicationContext(),
//                        R.raw.green
//                );
//                mediaPlayer.start();
//            }
//        });
    redBTN.setOnClickListener(this);
    balckBTN.setOnClickListener(this);
    greenBTN.setOnClickListener(this);
    yellowBTN.setOnClickListener(this);
    purpelBTN.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
int clikedBtnClicked=v.getId();
if(clikedBtnClicked==R.id.redBTN){
playSound(R.raw.red);

} else if (clikedBtnClicked==R.id.blackBTN) {
    playSound(R.raw.black);

} else if (clikedBtnClicked==R.id.greenBTN) {
    playSound(R.raw.green);
} else if (clikedBtnClicked==R.id.purpelBTN) {
    playSound(R.raw.purple);
}else {
    playSound(R.raw.yellow);
}
    }
public void playSound(int id){
    MediaPlayer mediaPlayer= MediaPlayer.create(
            this,
            id
    );
    mediaPlayer.start();
}

}