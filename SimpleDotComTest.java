class SimpleDotComTest {
    
    public String canCheckGuess() {
        
        DotCom dot = new DotCom();

        int[] locations = {1,2,3};
    
        dot.setLocations(locations);
    
        // get user guess
        String userGuess = "2";
        String result = dot.checkYourself(userGuess);
        String testResults = "failed";
    
        if (result.equals("hit")) {
            testResults = "passed";
        }
    
        return testResults;

    }

    public String canCheckHits() {
        
        DotCom dot = new DotCom();

        int[] locations = {1,2,3};
    
        dot.setLocations(locations);
        dot.checkYourself("1");
        dot.checkYourself("2");


        int hits = dot.getHits();

        String testResults = "failed";
        if (hits == 2) {
            testResults = "passed";
        }

        return testResults;

    }

    public String canCheckKill() {
        DotCom dot = new DotCom();

        int[] locations = {1,2,3};
    
        dot.setLocations(locations);
        dot.checkYourself("1");
        dot.checkYourself("2");
        dot.checkYourself("3");

        boolean isKilled = dot.isKilled();

        String testResults = "failed";
        if (isKilled) {
            testResults = "passed";
        }

        return testResults;
    }
   
    public String canCheckValidGuess() {
        
        DotCom dot = new DotCom();
        GuessTracker guessTracker = new GuessTracker();
        int[] locations = {1,2,3};
    
        dot.setLocations(locations);

        boolean isValid = guessTracker.ValidateGuess("2");

        // Test condition
        String testResults = "failed";
        if (isValid) {
            testResults = "passed";
        }

        return testResults;

    }

    public String canCheckInvalidGuess() {
        
        DotCom dot = new DotCom();
        GuessTracker guessTracker = new GuessTracker();
        int[] locations = {1,2,3};
    
        dot.setLocations(locations);

        guessTracker.ValidateGuess("2");
        boolean isValid = guessTracker.ValidateGuess("2");
        

        // Test condition
        String testResults = "failed";
        if (!isValid) {
            testResults = "passed";
        }

        return testResults;

    }

}