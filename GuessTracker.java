import java.util.ArrayList;;

public class GuessTracker {

    private ArrayList<String> pastGuesses = new ArrayList<String>();
    
    public boolean ValidateGuess(String guess) {

        if (pastGuesses.contains(guess)) {
            return false;
        }
       
        pastGuesses.add(guess);
        return true;
    }
}