import java.util.ArrayList;

class SimpleDotComTest {
    
    public String canCheckGuess() {
        
        DotCom dot = new DotCom();
        
        ArrayList<String> locations = new ArrayList<String>();
        locations.add("1");
        locations.add("2");
        locations.add("3");
        
        dot.setLocations(locations);
    
        // get user guess
        String userGuess = "2";
        String result = dot.checkYourself(userGuess);
        
        String testResults = "failed";
        if (result.equals("hit")) {
            testResults = "passed";
        }
        System.out.println("canCheckGuess");
        return testResults;

    }

    public String canCheckHits() {
        
        DotCom dot = new DotCom();

        ArrayList<String> locations = new ArrayList<String>();
        locations.add("b1");
        locations.add("b2");
        locations.add("b3");
    
        dot.setLocations(locations);
        dot.checkYourself("b1");
        dot.checkYourself("b2");


        int hits = dot.getHits();

        String testResults = "failed";
        if (hits == 2) {
            testResults = "passed";
        }
        System.out.println("canCheckHits");
        return testResults;

    }

    public String canCheckKill() {
        DotCom dot = new DotCom();

        ArrayList<String> locations = new ArrayList<String>();
        locations.add("1");
        locations.add("2");
        locations.add("3");
    
        dot.setLocations(locations);
        dot.checkYourself("1");
        dot.checkYourself("2");
        dot.checkYourself("3");

        boolean isKilled = dot.isKilled();

        String testResults = "failed";
        if (isKilled) {
            testResults = "passed";
        }
        System.out.println("canCheckKill");
        return testResults;
    }
   
    public String canCheckValidGuess() {
        
        DotCom dot = new DotCom();
        GuessTracker guessTracker = new GuessTracker();
        ArrayList<String> locations = new ArrayList<String>();
        locations.add("B1");
        locations.add("B2");
        locations.add("B3");
    
        dot.setLocations(locations);

        boolean isValid = guessTracker.ValidateGuess("B2");

        // Test condition
        String testResults = "failed";
        if (isValid) {
            testResults = "passed";
        }
        System.out.println("canCheckValidGuess");
        return testResults;

    }

    public String canCheckInvalidGuess() {
        
        DotCom dot = new DotCom();
        GuessTracker guessTracker = new GuessTracker();
        ArrayList<String> locations = new ArrayList<String>();
        locations.add("1");
        locations.add("2");
        locations.add("3");

    
        dot.setLocations(locations);

        guessTracker.ValidateGuess("2");
        boolean isValid = guessTracker.ValidateGuess("2");
        

        // Test condition
        String testResults = "failed";
        if (!isValid) {
            testResults = "passed";
        }
        System.out.println("canCheckInvalidGuess");
        return testResults;

    }

    public String GameHelperCanGetList() {
        
        GameHelper gameHelper = new GameHelper();
        ArrayList<String> locations = gameHelper.placeDotCom(3);
        String testResults = "failed";
        if (locations.size() == 3) {
            testResults = "passed";
        }
        System.out.println("GameHelperCanGetList");
        return testResults;
    }

}