package com.example.r626926.myappportfolio;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    public void launchApp(View view) {
        Context context = getApplicationContext();
        CharSequence text = "";
        int duration = Toast.LENGTH_SHORT;

        switch(view.getId()) {
            case(R.id.button1):
                text = "Launching app: Spotify Streamer";
                break;
            case(R.id.button2):
                text = "Launching app: Scores App";
                break;
            case(R.id.button3):
                text = "Launching app: Library App";
                break;
            case(R.id.button4):
                text = "Launching app: Build It Bigger";
                break;
            case(R.id.button5):
                text = "Launching app: XYZ Reader";
                break;
            case(R.id.button6):
                text = "This button will launch my capstone app";
                break;
        }
        
        Toast.makeText(context, text, duration).show();
    }
}
