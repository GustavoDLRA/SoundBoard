package com.gustavodelosriosalatorregmail.sounds;

import android.media.AudioManager;
import android.media.SoundPool;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.media.MediaPlayer;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    SoundPool spokemon_capture,scharmander,skirby,smewtwo,sroute1,ssquirtle,spokevo,sraygun,sscorpiongoh,ssmallapp,szombie,sdrumroll;
    Button b1, b2, b3, b4, b5, b6,b7, b8, b9, b10,b11,b12;
    int pkcapture,scham,skir,smew,srou,ssquirt,spoke,sray,scorp,small,szomb,sdrum;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spokemon_capture=new SoundPool(1,AudioManager.STREAM_MUSIC,0);
        pkcapture=spokemon_capture.load(this,R.raw.pokemon_capture,1);
        scharmander=new SoundPool(1,AudioManager.STREAM_MUSIC,0);
        scham=scharmander.load(this,R.raw.charmander_cry,1);
        skirby=new SoundPool(1,AudioManager.STREAM_MUSIC,0);
        skir=skirby.load(this,R.raw.kirby_sound,1);
        smewtwo=new SoundPool(1,AudioManager.STREAM_MUSIC,0);
        smew=smewtwo.load(this,R.raw.pokemon_mewtwo_cry,1);
        sroute1=new SoundPool(1,AudioManager.STREAM_MUSIC,0);
        srou=sroute1.load(this,R.raw.pokemon_route1,1);
        ssquirtle=new SoundPool(1,AudioManager.STREAM_MUSIC,0);
        ssquirt=ssquirtle.load(this, R.raw.squirtle_cry,1);
        ssquirt=ssquirtle.load(this, R.raw.squirtle_cry,0);
        spokevo=new SoundPool(1,AudioManager.STREAM_MUSIC,0);
        spoke=spokevo.load(this,R.raw.pokeevo,1);
        sraygun=new SoundPool(1,AudioManager.STREAM_MUSIC,0);
        sray=sraygun.load(this,R.raw.raygun,1);
        sscorpiongoh=new SoundPool(1,AudioManager.STREAM_MUSIC,0);
        scorp=sscorpiongoh.load(this,R.raw.scorpiongoh,1);
        ssmallapp=new SoundPool(1,AudioManager.STREAM_MUSIC,0);
        small=ssmallapp.load(this,R.raw.smallapplause,1);
        szombie=new SoundPool(1,AudioManager.STREAM_MUSIC,0);
        szomb=szombie.load(this,R.raw.zombie,1);
        sdrumroll=new SoundPool(1,AudioManager.STREAM_MUSIC,0);
        sdrum=sdrumroll.load(this,R.raw.drumroll,0);





    }
    public void b1 (View view){
spokemon_capture.play(pkcapture,1,1,1,0,1f);
    }
public void b2 (View view){
    scharmander.play(scham,1,1,1,0,1f);
}
    public void b3 (View view){
        skirby.play(skir,1,1,1,0,1f);
    }
    public void b4 (View view){
        smewtwo.play(smew,1,1,1,0,1f);
    }
    public void b5 (View view){
        sroute1.play(srou,1,1,1,0,1f);
    }
    public void b6 (View view){
        ssquirtle.play(ssquirt,1,1,1,0,1f);
    }
    public void b7 (View view){
        spokevo.play(spoke,1,1,1,0,1f);
    }
    public void b8 (View view){
        sraygun.play(sray,1,1,1,0,1f);
    }
    public void b9 (View view){
        sscorpiongoh.play(scorp,1,1,1,0,1f);
    }
    public void b10(View view){
        ssmallapp.play(small,1,1,1,0,1f);
    }
    public void b11(View view){
        szombie.play(szomb,1,1,1,0,1f);
    }
    public void b12(View view){
        sdrumroll.play(sdrum,1,1,1,0,1f);
    }

}
        mySound=new SoundPool(1, AudioManager.STREAM_MUSIC,0);
        mySound.load(this,R.raw.kirby_sound,1);
