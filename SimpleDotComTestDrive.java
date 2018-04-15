import java.util.Random;

class SimpleDotComTestDrive {

    private static void RunTests() {
        
        System.out.println("Running tests...");

        SimpleDotComTest test = new SimpleDotComTest();
        System.out.println("Running test suite:");
        System.out.println(test.canCheckGuess());
        System.out.println(test.canCheckHits());
        System.out.println(test.canCheckKill());
        System.out.println(test.canCheckValidGuess());
        System.out.println(test.canCheckInvalidGuess());
    }

    public static void main(String[] args) {


        for (String arg : args) {
            System.out.println(arg);
            if (arg.equals("test")) {
                RunTests();
            } 
        }

        DotCom dot = new DotCom();
        GameHelper gameHelper = new GameHelper();
        GuessTracker guessTracker = new GuessTracker();

        int numberOfGuesses = 0;
        Random r = new Random();
        int start = r.nextInt(4);

        int[] locations = {start, start + 1, start + 2};
        dot.setLocations(locations);

        //System.out.println("location starts at: " + start);
        while (!dot.isKilled()) {
            String guess = gameHelper.getUserInput("enter a number");
            if (guessTracker.ValidateGuess(guess)) {
                String result = dot.checkYourself(guess);
                System.out.println(result);
            } else {
                System.out.println("You already guessed this one");
            }
            numberOfGuesses++;
        }

        System.out.println("Completed in " + numberOfGuesses + " guesses");
       

    }

}