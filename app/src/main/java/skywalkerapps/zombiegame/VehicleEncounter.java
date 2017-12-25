package skywalkerapps.zombiegame;


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

    //Create a new intent so that the next activity can be decided
    //The activity will be decided based on player input
    //Intent myIntent = new Intent();

    //Create TextView variable for the text
    public TextView vehicleEncounterActivityText;

    //Create button variables for options
    public Button buttonOptionA;
    public Button buttonOptionB;
    public Button buttonOptionC;
    public Button buttonOptionD;

    //The number that will decide the fate of the player
    public int randomNum;

    //Generates a random number 0 or 1
    public void createRandomNum() {
        Random rand = new Random();
        //Generates random number ints 0,1 50% chance of survival
        randomNum = rand.nextInt(2);
    }

    //Execute code inside onCreate() method when activity starts
    protected void onCreate(Bundle savedInstanceState) {
        //Include saved instances
        super.onCreate(savedInstanceState);

        //Ensure fullscreen mode
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        //Setup the VehicleEncounter class with xml file vehicle_encounter_activity
        setContentView(R.layout.vehicle_encounter_activity);

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

                if(randomNum == 1) {
                    Toast.makeText(VehicleEncounter.this, vehicleScene.resultOne(), Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(VehicleEncounter.this, vehicleScene.resultTwo(), Toast.LENGTH_LONG).show();
                }

            }
        });
        buttonOptionB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Create the random number
                createRandomNum();

                if(randomNum == 1) {
                    Toast.makeText(VehicleEncounter.this, vehicleScene.resultThree(), Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(VehicleEncounter.this, vehicleScene.resultFour(), Toast.LENGTH_LONG).show();
                }
            }
        });
        buttonOptionC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Create the random number
                createRandomNum();

                if(randomNum == 1) {
                    Toast.makeText(VehicleEncounter.this, vehicleScene.resultFive(), Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(VehicleEncounter.this, vehicleScene.resultSix(), Toast.LENGTH_LONG).show();
                }
            }
        });
        //Button D ensures that the player doesn't take the risk of dieing
        buttonOptionD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(VehicleEncounter.this, vehicleScene.resultSeven(), Toast.LENGTH_LONG).show();
            }
        });
    }
}
