import java.util.Random;

class SimpleDotComTestDrive {

    public static void main(String[] args) {

        SimpleDotComTest test = new SimpleDotComTest();
        System.out.println("Running test suite:");
        System.out.println(test.canCheckGuess());
        System.out.println(test.canCheckHits());
        System.out.println(test.canCheckKill());

        SimpleDotCom dot = new SimpleDotCom();

        int numberOfGuesses = 0;
        Random r = new Random();
        int start = r.nextInt(4);

        int[] locations = {start, start + 1, start + 2};
        dot.setLocations(locations);

        //System.out.println("location starts at: " + start);
        while (!dot.isKilled()) {
            System.out.println("Enter a number");
            String guess = System.console().readLine();
            String result = dot.checkYourself(guess);
            System.out.println(result);
            numberOfGuesses++;
        }

        System.out.println("Completed in " + numberOfGuesses + " guesses");
       

    }

}