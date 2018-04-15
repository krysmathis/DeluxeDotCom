import java.util.ArrayList;;

public class GuessTracker {

    private ArrayList<Integer> pastGuesses = new ArrayList<Integer>();
    
    public boolean ValidateGuess(String guess) {

        // TODO: centralize and control conversion of input
        // string to integer from the main
        int newGuess = Integer.parseInt(guess);

        for (int pastGuess : pastGuesses) {
            if (newGuess == pastGuess) {
                return false;
            }
        }
        pastGuesses.add(newGuess);
        return true;
    }
}