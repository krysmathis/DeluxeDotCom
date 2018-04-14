class SimpleDotComTest {
    
    public String canCheckGuess() {
        
        SimpleDotCom dot = new SimpleDotCom();

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
        
        SimpleDotCom dot = new SimpleDotCom();

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
        SimpleDotCom dot = new SimpleDotCom();

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
   

}