import java.util.Random;

class SimpleDotComTestDrive {

    public static void main(String[] args) {

        SimpleDotComTest test = new SimpleDotComTest();
        System.out.println(test.canCheckGuess());
        System.out.println(test.canCheckHits());
        System.out.println(test.canCheckKill());

        SimpleDotCom dot = new SimpleDotCom();

        Random r = new Random();
        int start = r.nextInt(4);

        int[] locations = {start, start + 1, start + 2};
        dot.setLocations(locations);

        System.out.println("location starts at: " + start);
        while (!dot.isKilled()) {
            System.out.println("Enter a number");
            String guess = System.console().readLine();
            String result = dot.checkYourself(guess);
            System.out.println(result);
        }
       

    }

}