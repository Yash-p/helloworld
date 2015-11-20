package com.example.jchuah.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

public class hobbies extends AppCompatActivity {

    Bundle personsinfobundle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hobbies);

        personsinfobundle = getIntent().getBundleExtra("personsinfo");
        Log.i("Collected data (movie)", personsinfobundle.getString("movie"));

        personsinfobundle = getIntent().getBundleExtra("personsinfo");
        Log.i("Collected data (song)", personsinfobundle.getString("song"));

        personsinfobundle = getIntent().getBundleExtra("personsinfo");
        Log.i("Collected data (you.)", personsinfobundle.getString("youtuber"));

        personsinfobundle = getIntent().getBundleExtra("personsinfo");
        Log.i("Collected data (video)", personsinfobundle.getString("videogame"));
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
