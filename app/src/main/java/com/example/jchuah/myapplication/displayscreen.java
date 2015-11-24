package com.example.jchuah.myapplication;

import android.graphics.Movie;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

public class displayscreen extends AppCompatActivity {

    Bundle personsinfobundle;
    public static final String videourl = "https://www.youtube.com/watch?v=BGLGzRXY5Bw";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.displayscreen);
        
        VideoView vid = (VideoView) findViewById(R.id.videoView);
        Uri video = Uri.parse(videourl);
        vid.setMediaController(new MediaController(this));
        vid.setVideoURI(video);
        vid.start();
        vid.requestFocus();

        personsinfobundle = getIntent().getBundleExtra("personsinfo");
        Log.i("Collected data (name)", personsinfobundle.getString("name"));

        personsinfobundle = getIntent().getBundleExtra("personsinfo");
        Log.i("Collected data (desc)", personsinfobundle.getString("description"));

        personsinfobundle = getIntent().getBundleExtra("personsinfo");
        Log.i("Collected data (movie)", personsinfobundle.getString("movie"));

        personsinfobundle = getIntent().getBundleExtra("personsinfo");
        Log.i("Collected data (song)", personsinfobundle.getString("song"));

        personsinfobundle = getIntent().getBundleExtra("personsinfo");
        Log.i("Collected data (you.)", personsinfobundle.getString("youtuber"));

        personsinfobundle = getIntent().getBundleExtra("personsinfo");
        Log.i("Collected data (video)", personsinfobundle.getString("videogame"));




        String name = personsinfobundle.getString("name");
        String description = personsinfobundle.getString("description");
        String movie = personsinfobundle.getString("movie");
        String song = personsinfobundle.getString("song");
        String youtuber = personsinfobundle.getString("youtuber");
        String videogame = personsinfobundle.getString("videogame");

        TextView nametextview = (TextView)findViewById(R.id.namedisplay);
        nametextview.setText(name);

        TextView descriptiontextview = (TextView)findViewById(R.id.descriptiondisplay);
        descriptiontextview.setText(description);

        TextView movietextview = (TextView)findViewById(R.id.moviedisplay);
        movietextview.setText(movie);

        TextView songtextview = (TextView)findViewById(R.id.songdisplay);
        songtextview.setText(song);

        TextView youtubertextview = (TextView)findViewById(R.id.youtuberdisplay);
        youtubertextview.setText(youtuber);

        TextView videogametextview = (TextView)findViewById(R.id.videogamedisplay);
        videogametextview.setText(videogame);





    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_hobbies, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
