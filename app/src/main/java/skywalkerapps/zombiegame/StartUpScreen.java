package skywalkerapps.zombiegame;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;


import org.w3c.dom.Text;

/**
 * This is the start-up-screen that
 * first displays when the app runs
 *Displays for about 4 seconds and then ends
 *
 * Created by Luke Moua on 12/23/2017.
 */

public class StartUpScreen extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Gets the user's screen resolution settings to adjust for full screen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.startupscreen);

        //Create a StartUpScreen launcher
        LogoLauncher launchStartUp = new LogoLauncher();

        //Runs code inside LogoLauncher class
        launchStartUp.start();
    }
    //This class is used to Launch the StartUpScreen activity for a specific time
    //You still need to create a LogoLauncher object in whatever class that you plan on
    //using this code in
    private class LogoLauncher extends Thread {

        //Non-changing int for set screen display time
        private final int DISPLAY_TIME = 4000;
        //Uses a try catch block to try and run startupscreen for 4 seconds or 4000 millisecs
        //Then if success, switches to a new activity screen
        public void run() {
            try {
                //Method shows activity screen for param(int X) amount of milliseconds
                sleep(DISPLAY_TIME);
                //catch an interruption exception in case it doesn't work
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
            //Need to create an intent to change activities each time you want to switch from one to another
            //Params, switches from this activity to the next which in this case is MainActivity
            Intent intent = new Intent(StartUpScreen.this, MainActivity.class);
            //Start the activity transition
            startActivity(intent);
            ///.this.finish() will destroy this activity so that you can't go back to it
            StartUpScreen.this.finish();


        }
    }
    }