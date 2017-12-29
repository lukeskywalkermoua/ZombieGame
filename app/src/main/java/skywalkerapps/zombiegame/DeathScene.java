package skywalkerapps.zombiegame;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;
import android.widget.Toast;

import skywalkerapps.zombiegame.R;

/**
 * This class implements the screen display
 * that shows the player character when they are dead
 *
 * Created by Luke Moua on 12/27/2017.
 */

public class DeathScene extends AppCompatActivity{

    //When activity starts, run class main
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Make sure screen is set to fullscreen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        //Set to implement layout deathscene1.xml file
        setContentView(R.layout.deathscene1);







    }
}
