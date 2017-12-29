package skywalkerapps.zombiegame;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

import scenario.consequences.AbandonedVehicleScenario;

/**
 * This activity class runs the AbandonedVehicleScenario
 *
 * Created by Luke Moua on 12/24/2017.
 */

public class VehicleEncounter extends AppCompatActivity{

    //Create an AbandonedVehicleScenario
    AbandonedVehicleScenario vehicleScene = new AbandonedVehicleScenario();

    //Create TextView variable for the text
    public TextView vehicleEncounterActivityText;

    //Create button variables for options
    public Button buttonOptionA;
    public Button buttonOptionB;
    public Button buttonOptionC;
    public Button buttonOptionD;

    //Random number range of 0-9
    private final int RANDOM_NUM_BOUND = 10;

    //Stores an int generated by the random number method
    private int randomNum;

    //Generates a random number 0 or 9
    public void createRandomNum() {
        Random rand = new Random();
        //Generates random number with a chance of 10%
        randomNum = rand.nextInt(RANDOM_NUM_BOUND);
    }

    //Execute code inside onCreate() method when activity starts
    protected void onCreate(Bundle savedInstanceState) {
        //Include saved instances
        super.onCreate(savedInstanceState);

        //Ensure fullscreen mode
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        //Setup the VehicleEncounter class with xml file vehicle_encounter_activity
        setContentView(R.layout.vehicle_encounter_activity);

        //Create a new intent so that the next activity can be decided
        //The activity will be decided based on player input
        final Intent deathIntent = new Intent(VehicleEncounter.this, DeathScene.class);

        //Set button variable to id of button in xml file
        buttonOptionA = findViewById(R.id.b1button1);
        buttonOptionB = findViewById(R.id.b2button2);
        buttonOptionC = findViewById(R.id.b3button3);
        buttonOptionD = findViewById(R.id.b4button4);

        //Set TextView variable to id of TextView in xml file
        vehicleEncounterActivityText = findViewById(R.id.b5textView5);
        //Set the text
        vehicleEncounterActivityText.setText(vehicleScene.describeScene());

        buttonOptionA.setText(vehicleScene.optionOne());
        buttonOptionB.setText(vehicleScene.optionTwo());
        buttonOptionC.setText(vehicleScene.optionThree());
        buttonOptionD.setText(vehicleScene.optionFour());

        //Create button listeners for each variable button
        buttonOptionA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Create the random number
                createRandomNum();
                //Ten percent chance that randomNum is 0
                if(randomNum == 0) {
                    Toast.makeText(VehicleEncounter.this, vehicleScene.resultOne(), Toast.LENGTH_LONG).show();
                    //if player is dead, show death screen
                    startActivity(deathIntent);
                    //Kill the stack
                    finish();
                } else {
                    Toast.makeText(VehicleEncounter.this, vehicleScene.resultTwo(), Toast.LENGTH_LONG).show();
                    //Progress to next activity
                }

            }
        });
        buttonOptionB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Create the random number
                createRandomNum();
                //Ten percent chance that randomNum is 0
                if(randomNum == 0) {
                    Toast.makeText(VehicleEncounter.this, vehicleScene.resultThree(), Toast.LENGTH_LONG).show();
                    //if player is dead, show death screen
                    startActivity(deathIntent);
                    //Kill the stack
                    finish();
                } else {
                    Toast.makeText(VehicleEncounter.this, vehicleScene.resultFour(), Toast.LENGTH_LONG).show();
                    //Progress to next activity
                }
            }
        });
        buttonOptionC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create the random number
                createRandomNum();
                //Ten percent chance that randomNum is 0
                if(randomNum == 0) {
                    Toast.makeText(VehicleEncounter.this, vehicleScene.resultFive(), Toast.LENGTH_LONG).show();
                    //if player is dead, show death screen
                    startActivity(deathIntent);
                    //Kill the stack
                    finish();
                } else {
                    Toast.makeText(VehicleEncounter.this, vehicleScene.resultSix(), Toast.LENGTH_LONG).show();
                    //Progress to next activity

                }
            }
        });
        //Button D ensures that the player doesn't take the risk of dieing
        buttonOptionD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(VehicleEncounter.this, vehicleScene.resultSeven(), Toast.LENGTH_LONG).show();

                //Progress to next activity
            }
        });
    }
}
