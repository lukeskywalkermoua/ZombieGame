package skywalkerapps.zombiegame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * App Game: ZombieWorld
 *
 * Game Description:
 * Decision making game forces the user with limited options
 * that the user must take. With skill, knowledge, and a whole lot of luck,
 * the player just might survive the apocalypse!
 *
 * Creator & Company Name:
 * Luke Moua
 * Skywalker Apps
 *
 * Date:
 * 12/23/2017
 *
 */
public class MainActivity extends AppCompatActivity {

    //Create the beginning scene object
    //All ascpects of this scene will be retrieve though this object name
    StartScenario myStartScenario = new StartScenario();

    //Declare class variables here, buttons etc.

    //onCreate() All code inside this method will be executed first when the app starts
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Gets the user's screen resolution settings to adjust for full screen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        //Create a text that is implemented by the StartScenario
        //method describeScene(), which describes the scene
        TextView myText = findViewById(R.id.text_a1);
        myText.setText(myStartScenario.describeScene());

        //Create a StoryLauncher telling player what they have to do
        StoryLauncher launchIt = new StoryLauncher();
        //Start executing StoryLauncher
        launchIt.start();



    }
    private class StoryLauncher extends Thread {

        //Non-changing int for set screen display time
        private final int STORY_TIME = 4000;
        //Uses a try catch block to try and run story screen for 4 seconds or 4000 millisecs
        //Then if success, switches to a new activity screen
        public void run() {
            try {
                //Method shows activity screen for param(int X) amount of milliseconds
                sleep(STORY_TIME);
                //catch an interruption exception in case it doesn't work
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
            //Need to create an intent to change activities each time you want to switch from one to another
            //Params, switches from this activity to the next which in this case is MainActivity
            Intent intent = new Intent(MainActivity.this, GameActivityOne.class);
            //Start the activity transition
            startActivity(intent);
            ///.this.finish() will destroy this activity so that you can't go back to it
            MainActivity.this.finish();


        }
    }
}
