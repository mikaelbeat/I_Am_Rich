package mikaelbeat.rich;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mMediaPlayer;
    MediaPlayer happySound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        happySound = MediaPlayer.create(getApplicationContext(), R.raw.cheering);
        mMediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.rich);
        mMediaPlayer.start();

    }

    @Override
    protected void onPause() {
        super.onPause();
        mMediaPlayer.pause();
    }

    @Override
    protected void onResume(){
        super.onResume();
        mMediaPlayer.start();
    }

    public void playHappySound(View v) {
        happySound.start();
    }

}