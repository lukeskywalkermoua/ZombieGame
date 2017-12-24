package skywalkerapps.zombiegame;

/**
 * The beginning scene where the player starts off at
 * Waking up in bed
 * Created by Student on 12/23/2017.
 */

public class StartScenario implements ScenarioInterface{

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
        return "The sound of an air-raid siren wakes you up as you panick and stumble to figure" +
                " out what is going on.";
    }

    //Possibly use an array to hold the string options
    //when implementing code

    //The four actions that the player
    //is allowed to make during every scenario
    //These will vary, and will need to be implemented in
    //each different scenario class
    public String optionOne() {
        String Aoption = "A)";
        return "";
    };
    public String optionTwo() {
        String Aoption = "B)";
        return Aoption;
    };
    public String optionThree() {
        String Coption = "C)";
        return Coption;
    };
    public String optionFour() {
        String Doption = "D)";
        return Doption;
    };

    //The consequences that will happen depending on
    //which decisions the player makes. Each choice they
    //make will have two results, good or bad consequence
    public String resultOne() {
        String resultA = "";
        return resultA;
    };
    public String resultTwo() {
        String resultB = "";
        return resultB;
    };
    public String resultThree() {
        String resultC = "";
        return resultC;
    };
    public String resultFour() {
        String resultD = "";
        return resultD;
    };
    public String resultFive() {
        String resultE = "";
        return resultE;
    };
    public String resultSix() {
        String resultF = "";
        return resultF;
    };
    public String resultSeven() {
        String resultG = "";
        return resultG;
    };
    public String resultEight() {
        String resultH = "";
        return resultH;
    };
}
