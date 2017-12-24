package skywalkerapps.zombiegame;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;
import android.widget.TextView;

/**
 * Leaving base
 * Created by Luke Moua on 12/24/2017.
 */

public class LeavingBase extends AppCompatActivity{
    //When the activity starts, code in onCreate() method will execute
    TextView leaveBaseDescription;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //Set java code to implement leavingbase.xml file
        setContentView(R.layout.leavingbase);

        leaveBaseDescription = findViewById(R.id.leave_base_text);
        leaveBaseDescription.setText("It's survival day one, and you're forced to leave base" +
                " to look for survival supplies");

    }
}
