package skywalkerapps.zombiegame;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

/**
 * Player chooses weapon at beginning of game
 *
 * Created by Luke Moua on 12/24/2017.
 */

public class GameActivityOne extends AppCompatActivity {

    //Create buttons variables
    public Button weaponOneButton;
    public Button weaponTwoButton;
    public Button weaponThreeButton;
    public Button weaponFourButton;
    public TextView descriptionText;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Set screen resolution to fullscreen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //Set to layout design view
        setContentView(R.layout.weaponsloadout);

        //Set the text id of description in weaponsloadout.xml to descriptionText
        descriptionText = findViewById(R.id.textView4);
        descriptionText.setText("Choose a weapon: ");

        //Set these buttons to the id of the ones in xml file user display
        //Set text to these buttons through code for testing purposes, maybe later use classes
        weaponOneButton = findViewById(R.id.button);
        weaponOneButton.setText("Pistol");

        weaponTwoButton = findViewById(R.id.button2);
        weaponTwoButton.setText("Shotgun");

        weaponThreeButton = findViewById(R.id.button3);
        weaponThreeButton.setText("Machete");

        weaponFourButton = findViewById(R.id.button4);
        weaponFourButton.setText("CrossBow");
    }
}
