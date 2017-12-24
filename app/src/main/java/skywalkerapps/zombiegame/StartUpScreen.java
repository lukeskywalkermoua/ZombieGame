package skywalkerapps.zombiegame;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * This is the start-up-screen that
 * first displays when the app runs
 *Displays for about 4 seconds and then ends
 *
 * Created by Luke Moua on 12/23/2017.
 */

public class StartUpScreen extends AppCompatActivity {
    private ViewGroup mContainerView;

    //Method adds items from the layout that should be animated
    private void addItemToAnimation() {
        Animation fade_it = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.my_anim);
        //Creat the textviews to get their ids for animation
        TextView gameTitle = findViewById(R.id.textView);
        gameTitle.setAnimation(fade_it);
        TextView authorTitle = findViewById(R.id.textView2);
        authorTitle.setAnimation(fade_it);
        TextView companyName = findViewById(R.id.textView3);
        companyName.setAnimation(fade_it);
        //Adding the items to the layout view to animate
        mContainerView.addView(gameTitle, 0);
        mContainerView.addView(authorTitle,0);
        mContainerView.addView(companyName,0);
    }
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.startupscreen);

      addItemToAnimation();

    }
    }
