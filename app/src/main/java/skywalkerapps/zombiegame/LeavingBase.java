package skywalkerapps.zombiegame;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

/**
 * Leaving base
 * Created by Luke Moua on 12/24/2017.
 */

public class LeavingBase extends AppCompatActivity{
    //When the activity starts, code in onCreate() method will execute
    TextView leaveBaseDescription;
    Button startGameButton;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //Set java code to implement leavingbase.xml file
        setContentView(R.layout.leavingbase);

        //Transition into next activity display
        final Intent startGameIntent = new Intent(LeavingBase.this, VehicleEncounter.class);

        //Set
        leaveBaseDescription = findViewById(R.id.leave_base_text);
        //Set the text for the Start screen game
        leaveBaseDescription.setText("It's survival day one, and you're forced to leave base" +
                " to look for survival supplies...");

        //Set starGameButton variable to the leavingbase.xml startbutton id
        startGameButton = findViewById(R.id.start_game_button);
        //Create start_game_listener button
        startGameButton.setOnClickListener(new View.OnClickListener() {
            //Start action onClick() method
            @Override
            public void onClick(View view) {
                //What to do after player clicks start game button
                //Start the next activity (main game) using the start button
                startActivity(startGameIntent);

                //Once you start the game, you can't go back to start menu
                //Must go back to loadouts
                LeavingBase.this.finish();
            }
        });
    }

}
