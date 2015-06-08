package com.brindlewaye.dave.myappportfolio;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
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

    /** Called when the user touches the button */
    public void sendMessage(View view) {
        Context context = getApplicationContext();
        int viewID = view.getId();
        Button myButton = (Button) findViewById(viewID);
        String name = myButton.getText().toString();
        String msg = "This button will launch my ";
        CharSequence text = "Hello toast";
        switch (viewID) {
            case R.id.buttonSpotify:
                text = msg + "Spotify App";
                break;
            case R.id.buttonScores:
                text = msg + "Football Scores App";
                break;
            case R.id.buttonLibrary:
                text = msg + "Library App";
                break;
            case R.id.buttonBigger:
                text = msg + "Build It Bigger App";
                break;
            case R.id.buttonXYZ:
                text = msg + "XYZ Reader App";
                break;
            case R.id.buttonCapstone:
                text = msg + "Capstone App";
                break;
            default:
                text = msg + name;
        }

        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
