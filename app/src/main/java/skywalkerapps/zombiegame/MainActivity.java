package skywalkerapps.zombiegame;

import android.content.Intent;
import android.os.Handler;
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

    public static int SPLASH_TIME_OUT = 4000;
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
        TextView myText = (TextView)findViewById(R.id.text_a1);
        myText.setText(myStartScenario.describeScene());



        //TODO create a second activity and try to switch between activities
        //Create an intent to move to welcome screen

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent homeIntent = new Intent(MainActivity.this, StartUpScreen.class);
                startActivity(homeIntent);
                finish();
            }
        }, SPLASH_TIME_OUT);



    }
}
