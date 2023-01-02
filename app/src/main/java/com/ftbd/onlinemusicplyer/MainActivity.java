package com.ftbd.onlinemusicplyer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.jean.jcplayer.model.JcAudio;
import com.example.jean.jcplayer.view.JcPlayerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    JcPlayerView jcplayerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        jcplayerView = (JcPlayerView) findViewById(R.id.jcplayer);

        String url1 = "https://firebasestorage.googleapis.com/v0/b/islamic-app-54f3c.appspot.com/o/Koi-Mahdir-Soinnora-Rukhte-Hobe-Dajjal.mp3?alt=media&token=9c605797-ed2a-426f-980a-8d43aa8afc9d";
        String url2 = "https://firebasestorage.googleapis.com/v0/b/islamic-app-54f3c.appspot.com/o/2.mp3?alt=media&token=2603fadf-c762-4761-a93e-254a179d610c";
        String url3 = "https://firebasestorage.googleapis.com/v0/b/islamic-app-54f3c.appspot.com/o/3.mp3?alt=media&token=a35102cd-f22d-431e-9bf1-0604f25a2fcf";
        String url4= "https://firebasestorage.googleapis.com/v0/b/islamic-app-54f3c.appspot.com/o/4.mp3?alt=media&token=a0558468-d69a-4041-ae35-8e97ffebeb3f";
        String url5 = "https://firebasestorage.googleapis.com/v0/b/islamic-app-54f3c.appspot.com/o/5.mp3?alt=media&token=a88d8734-980f-4847-a29d-d8b9d723e910";
        String url6 = "https://firebasestorage.googleapis.com/v0/b/islamic-app-54f3c.appspot.com/o/6.mp3?alt=media&token=783f7580-851c-4817-8e21-26ad5164392d";
        String url7 = "https://firebasestorage.googleapis.com/v0/b/islamic-app-54f3c.appspot.com/o/7.mp3?alt=media&token=8e469e33-8764-4dfe-844e-fe7093124163";
        String url8 = "https://firebasestorage.googleapis.com/v0/b/islamic-app-54f3c.appspot.com/o/8.mp3?alt=media&token=8a442f32-0757-4ff3-bf8f-e8c42963dae7";
        String url9 = "https://firebasestorage.googleapis.com/v0/b/islamic-app-54f3c.appspot.com/o/9.mp3?alt=media&token=544fcc8a-3d55-4ece-8f5a-9a3a3cfe5775";
        String url10 = "https://firebasestorage.googleapis.com/v0/b/islamic-app-54f3c.appspot.com/o/10.mp3?alt=media&token=ba9a91b9-8a14-4f85-a354-908b112bba2a";
        String url11 = "https://firebasestorage.googleapis.com/v0/b/islamic-app-54f3c.appspot.com/o/11.mp3?alt=media&token=193edcc8-1937-4b0a-b8bf-10c630a66e0e";

        ArrayList<JcAudio> jcAudios = new ArrayList<>();
        jcAudios.add(JcAudio.createFromURL("Gazal 1",url1));
        jcAudios.add(JcAudio.createFromURL("Gazal 2",url2));
        jcAudios.add(JcAudio.createFromURL("Gazal 3",url3));
        jcAudios.add(JcAudio.createFromURL("Gazal 4",url4));
        jcAudios.add(JcAudio.createFromURL("Gazal 5",url5));
        jcAudios.add(JcAudio.createFromURL("Gazal 6",url6));
        jcAudios.add(JcAudio.createFromURL("Gazal 7",url7));
        jcAudios.add(JcAudio.createFromURL("Gazal 8",url8));
        jcAudios.add(JcAudio.createFromURL("Gazal 9",url9));
        jcAudios.add(JcAudio.createFromURL("Gazal 10",url10));
        jcAudios.add(JcAudio.createFromURL("Gazal 11",url11));


        jcplayerView.initPlaylist(jcAudios, null);
        jcplayerView.createNotification(); // default icon
    }
}