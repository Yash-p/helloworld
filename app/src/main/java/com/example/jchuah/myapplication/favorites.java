package com.example.jchuah.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class favorites extends AppCompatActivity {

    Bundle personsinfobundle;

    public void OnNextClickthree(View source)
    {

        Toast.makeText(getApplicationContext(), "Next button clicked to go to hobbies", Toast.LENGTH_LONG).show();
        Intent hobbiesactivityintent = new Intent(this, hobbies.class);

        EditText movie = (EditText)findViewById(R.id.movie);
        personsinfobundle.putString("movie", movie.getText().toString());

        EditText song = (EditText)findViewById(R.id.song);
        personsinfobundle.putString("song", song.getText().toString());

        EditText youtuber = (EditText)findViewById(R.id.youtuber);
        personsinfobundle.putString("youtuber", youtuber.getText().toString());

        EditText videogame = (EditText)findViewById(R.id.videogame);
        personsinfobundle.putString("videogame", videogame.getText().toString());

        hobbiesactivityintent.putExtra("personsinfo", personsinfobundle);

        startActivity(hobbiesactivityintent);


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorites);

        personsinfobundle = getIntent().getBundleExtra("personsinfo");
        Log.i("Collected data (desc)", personsinfobundle.getString("description"));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_favcolor, menu);
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
