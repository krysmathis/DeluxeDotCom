import java.util.ArrayList;

class DotComBust {
   
    GameHelper gameHelper = new GameHelper();
    GuessTracker guessTracker = new GuessTracker();
    private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
    int numOfUserGuesses;

    public void SetUpGame() {

        DotCom dot1 = new DotCom();
        DotCom dot2 = new DotCom();
        DotCom dot3 = new DotCom();
        
        dot1.setName("Pets.com");
        dot2.setName("Askme.com");
        dot3.setName("Go2.com");

        dotComsList.add(dot1);
        dotComsList.add(dot2);
        dotComsList.add(dot3);

        for (DotCom dotCom : dotComsList) {
            ArrayList<String> newLocations = gameHelper.placeDotCom(3);
            dotCom.setLocations(newLocations);
        } // close for loop
        

        System.out.println("Locations of DotComs");
        System.out.println(dot1.getLocations());
        System.out.println(dot2.getLocations());
        System.out.println(dot3.getLocations());


    } // close setup game method

    public void startPlaying() {
        int i = 0;
        while (dotComsList.size() > 0) {
            checkUserGuess(gameHelper.getUserInput("enter a value"));
            i++;
            if (i > 10) {
                break;
            }
        }
        finishGame();
    }
    
    private void checkUserGuess(String userGuess) {
        
        numOfUserGuesses++;
        String result = "miss";

        for (int i = 0; i < dotComsList.size(); i++) {

            result = dotComsList.get(i).checkYourself(userGuess);
            
            if (result == "hit") {
                break;
            }

            if (result == "killed") {
                dotComsList.remove(i);
                break;
            }
        }
        
        System.out.println(result);

    }
    
    private void finishGame() {
        if (numOfUserGuesses < 5) {
            System.out.println("UNBELIEVABLE!!!");
        } else {
            System.out.println("OK job I guess...");
        }
    }

    private static void RunTests() {
        
        System.out.println("Running tests...");

        SimpleDotComTest test = new SimpleDotComTest();
        System.out.println("Running test suite:");
        System.out.println(test.canCheckGuess());
        System.out.println(test.canCheckHits());
        System.out.println(test.canCheckKill());
        System.out.println(test.canCheckValidGuess());
        System.out.println(test.canCheckInvalidGuess());
        System.out.println(test.GameHelperCanGetList());
    }

    public static void main(String[] args) {


        for (String arg : args) {
            System.out.println(arg);
            if (arg.equals("test")) {
                RunTests();
            } 
        }

        DotComBust dotComBust = new DotComBust();
        dotComBust.SetUpGame();
        dotComBust.startPlaying();
       

    }
    

}