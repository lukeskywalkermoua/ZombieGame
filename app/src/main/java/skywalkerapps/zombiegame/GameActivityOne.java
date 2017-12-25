package skywalkerapps.zombiegame;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

/**
 * Player chooses weapon at beginning of game
 *
 * Created by Luke Moua on 12/24/2017.
 */

public class GameActivityOne extends AppCompatActivity {

    //Strings of weapon names, they don't change
    private final String MY_WEAPON_ONE = "Pistol";
    private final String MY_WEAPON_TWO = "Shotgun";
    private final String MY_WEAPON_THREE = "Machete";
    private final String MY_WEAPON_FOUR = "Crossbow";

    //Create buttons variables
    public Button weaponOneButton;
    public Button weaponTwoButton;
    public Button weaponThreeButton;
    public Button weaponFourButton;
    //Create text description display
    public TextView descriptionText;

    public String weaponChoice;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Create an intent so that we can transition to the next screen
        //Params are (current activity, desired acitivy)

        //Set screen resolution to fullscreen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //Set to layout design view
        setContentView(R.layout.weaponsloadout);

        final Intent gameActivityIntent = new Intent(GameActivityOne.this, LeavingBase.class);

        //TEXT DISPLAY CODE
        //Set the text id of description in weaponsloadout.xml to descriptionText
        descriptionText = findViewById(R.id.textView4);
        //Set the text description on TextView display
        descriptionText.setText("Choose a weapon: " +
                "\nPistol: Great medium range, loud, highly customizable......." +
                "\n\nShotgun: Great shortrange, loud, but hard to miss with this." +
                "\n\nMachete: Great for chopping zombie heads and survival......." +
                "\n\nCrossbow: Great shortrange, reusable ammo, long reload times");

        //BUTTON1 CODE
        //Set these buttons to the id of the ones in xml file user display
        //Set text to these buttons through code for testing purposes
        weaponOneButton = findViewById(R.id.weapon_button1);
        //Sets button1 text display
        weaponOneButton.setText(MY_WEAPON_ONE);
        //Create button listener
        weaponOneButton.setOnClickListener(new View.OnClickListener() {
            //What to do when weapon_button1 is clicked
            @Override
            public void onClick(View v) {
                //If weapon_button1 is pressed, store the weapon name to weaponChoice variable
                weaponChoice = MY_WEAPON_ONE;

                //When done, transition to the next activity using gameActivityIntent created above
                startActivity(gameActivityIntent);

            }
        });
        //BUTTON2 CODE
        //Set button variable to weaponsloadout.xml file button
        weaponTwoButton = findViewById(R.id.weapon_button2);
        //Sets button2 text display
        weaponTwoButton.setText(MY_WEAPON_TWO);
        //Create button listener
        weaponTwoButton.setOnClickListener(new View.OnClickListener() {
            //What action to take when weapon_button2 is clicked
            @Override
            public void onClick(View view) {
                //If weapon_button2 is pressed, store the weapon name to weaponChoice variable
                weaponChoice = MY_WEAPON_TWO;

                //When done, transition to the next activity using gameActivityIntent created above
                startActivity(gameActivityIntent);

            }
        });
        //BUTTON3 CODE
        //Set button variable to weaponsloadout.xml file button
        weaponThreeButton = findViewById(R.id.weapon_button3);
        //Sets button3 text display
        weaponThreeButton.setText(MY_WEAPON_THREE);
        //Create button listener
        weaponThreeButton.setOnClickListener(new View.OnClickListener() {
            //What action to take when weapon_button3 is clicked
            @Override
            public void onClick(View view) {
                //If weapon_button3 is pressed, store the weapon name to weaponChoice variable
                weaponChoice = MY_WEAPON_THREE;

                //When done, transition to the next activity using gameActivityIntent created above
                startActivity(gameActivityIntent);


            }
        });
        //BUTTON4 CODE
        //Set button variable to weaponsloadout.xml file button
        weaponFourButton = findViewById(R.id.weapon_button4);
        //Sets button4 text display
        weaponFourButton.setText(MY_WEAPON_FOUR);
        //Create button listener
        weaponFourButton.setOnClickListener(new View.OnClickListener() {
            //What action to take when weapon_button4 is clicked
            @Override
            public void onClick(View view) {
                //If weapon_button4 is pressed, store the weapon name to weaponChoice variable
                weaponChoice = MY_WEAPON_FOUR;

                //When done, transition to the next activity using gameActivityIntent created above
                startActivity(gameActivityIntent);



            }
        });
    }
}
