package scenario.consequences;

import scenario.consequences.ScenarioInterface;

/**
 * Player sees abandoned vehicle, what do they do?
 * Options are to search it, attempt to start it, or move on
 *
 * Created by Luke Moua on 12/24/2017.
 */

public class AbandonedVehicleScenario implements ScenarioInterface {

    //Returns the name of the scene
    public String getScenarioName() {
        return "Abandoned Vehicle";
    }

    //Returns the description of the scene
    public String describeScene(){
        return "You see an abandoned vehicle, what do you do?";
    }

    //Possibly use an array to hold the string options
    //when implementing code

    //The four actions that the player
    //is allowed to make during every scenario
    //These will vary, and will need to be implemented in
    //each different scenario class
    public String optionOne(){
        return "A) Loot it";
    }
    public String optionTwo(){
        return "B) Attempt to start it";
    }
    public String optionThree(){
        return "C) Honk the horn";
    }
    public String optionFour(){
        return "D) Move on";
    }

    //The consequences that will happen depending on
    //which decisions the player makes. Each choice they
    //make will have two results, good or bad consequence
    //Bad scenario for optionA
    public String resultOne(){
        return "You made too much noise while looting and zombies killed you...";
    }
    //TODO Maybe later in the future add some class of item to this
    //Good scenario for optionA
    public String resultTwo(){
        //Goodies can be food/ammo/medical supplies etc.
        return "You found nothing but trash..";
    }
    //Bad scenario for optionA
    public String resultThree(){
        return "ZOMBIE IN THE BACKSEAT! YOU ARE DEAD";
    }
    //Good scenario for optionB
    public String resultFour(){
        return "Of course...no gas left";
    }
    public String resultFive(){
        return "A zombie horde heard the noise and killed you!";
    }
    public String resultSix(){
        return "A zombie horde heard the noise, but you got away!";
    }
    public String resultSeven(){
        return "You decided to not take the risk and move on...";
    }
    public String resultEight(){
        return "A ZOMBIE IN THE BACKSEAT!!! YOU'RE DEAD";
    }
}
