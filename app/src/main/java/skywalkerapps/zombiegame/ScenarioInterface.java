package skywalkerapps.zombiegame;

/**
 * Scenario interface is the building block of the different
 * scenarios that the player will encounter. Through here, multiple
 * options of actions will be created as strings and will be implemented
 * by specific scenario classes.
 *
 * Created by Luke Moua on 12/23/2017.
 */

public interface ScenarioInterface {

    public String getScenarioName();

    //Possibly use an array to hold the string options
    //when implementing code

    //The four actions that the player
    //is allowed to make during every scenario
    //These will vary, and will need to be implemented in
    //each different scenario class
    public String optionOne();
    public String optionTwo();
    public String optionThree();
    public String optionFour();

    //The consequences that will happen depending on
    //which decisions the player makes. Each choice they
    //make will have two results, good or bad consequence
    public String resultOne();
    public String resultTwo();
    public String resultThree();
    public String resultFour();
    public String resultFive();
    public String resultSix();
    public String resultSeven();
    public String resultEight();


}
