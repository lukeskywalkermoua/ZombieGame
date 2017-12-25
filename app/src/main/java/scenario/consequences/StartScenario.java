package scenario.consequences;

import scenario.consequences.ScenarioInterface;

/**
 * The beginning scene where the player starts off at
 * Waking up in bed
 * Created by Student on 12/23/2017.
 */

public class StartScenario implements ScenarioInterface {

    //Constructor
    public StartScenario() {
    };

    //Returns the title of the scenario
    public String getScenarioName() {
        String sceneName = "The Beginning";
        return sceneName;
    };

    //Returns the name of the scene
    public String describeScene() {
        return "Zombies are everywhere, DECIDE YOUR FATE";
    }

    //Possibly use an array to hold the string options
    //when implementing code

    //The four actions that the player
    //is allowed to make during every scenario
    //These will vary, and will need to be implemented in
    //each different scenario class
    public String optionOne() {
        return "A) ";
    };
    public String optionTwo() {

        return "B) ";
    };
    public String optionThree() {
        return "C) ";
    };
    public String optionFour() {

        return "D) ";
    };

    //The consequences that will happen depending on
    //which decisions the player makes. Each choice they
    //make will have two results, good or bad consequence
    public String resultOne() {
        return " ";
    };
    public String resultTwo() {
        return " ";
    };
    public String resultThree() {
        return "";
    };
    public String resultFour() {
        return "";
    };
    public String resultFive() {
        return "";
    };
    public String resultSix() {
        return "";
    };
    public String resultSeven() {
        return "";
    };
    public String resultEight() {
        return "";
    };
}
