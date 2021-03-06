package com.example.jchuah.myapplication;
//kael's swag program cause he's chill
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Bundle sendBundle = new Bundle();
    MediaPlayer mpAudio;


    public void OnNextClick(View source)
    {
        Toast.makeText(getApplicationContext(), "Next button clicked", Toast.LENGTH_LONG).show();
        Intent IntrestsactivityIntent = new Intent(this, Interests.class);

        EditText nameedittext = (EditText)findViewById(R.id.nameinput);
        sendBundle.putString("name", nameedittext.getText().toString());

        IntrestsactivityIntent.putExtra("personsinfo", sendBundle);

        startActivity(IntrestsactivityIntent, sendBundle);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mpAudio = MediaPlayer.create(this, R.raw.song);
        mpAudio.setLooping(true);
        mpAudio.start();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
