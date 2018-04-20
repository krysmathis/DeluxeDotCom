import java.util.ArrayList;

class DotCom {
    
    private int hits = 0;
    private boolean killed = false; 
    private int[] locations;
    private String[] states = { "missed", "hit", "killed", "already dead" };
    private String _name;

    public void setName(String name) {
        this._name = name;
    }

    public String getName() {
        return _name;
    }

    public void setLocations(int[] locations) {
        this.locations = locations;
    }

    public int getHits() {
        return hits;
    }

    public boolean isKilled() {
        return killed;
    }


    public String checkYourself(String guess) {

        int guessLocation = Integer.parseInt(guess);
        
        // default to missed
        String result = states[0];

        // if it is already dead
        if (hits >= locations.length) {
            return states[3];
        }

        // loop through the locations and if there's a match
        //  1. Increment the hits property
        //  2. Update the result value
        //  3. Stop looping
        for (int location : locations) {
            if (guessLocation == location) {
                hits++;
                result = states[1];
                break;
            }
        }

        if (hits >= locations.length) {
            killed = true;
            result = states[2];
        }

        return result;
    }

}