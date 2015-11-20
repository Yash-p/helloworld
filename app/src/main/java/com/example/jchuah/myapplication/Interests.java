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

public class Interests extends AppCompatActivity {

    Bundle personsinfobundle;



    public void OnNextClicktwo(View source)
    {

        Toast.makeText(getApplicationContext(), "Next button clicked to go to fav color", Toast.LENGTH_LONG).show();
        Intent favcoloractivityintent = new Intent(this, favorites.class);

        EditText description = (EditText)findViewById(R.id.descriptionText);
        personsinfobundle.putString("description", description.getText().toString());

        favcoloractivityintent.putExtra("personsinfo", personsinfobundle);

        startActivity(favcoloractivityintent);


    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interests);
        personsinfobundle = getIntent().getBundleExtra("personsinfo");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_interests, menu);
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
