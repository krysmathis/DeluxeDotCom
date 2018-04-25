import java.util.ArrayList;

class DotCom {
    
    private int hits = 0;
    private boolean killed = false; 
    private ArrayList<String> locations;
    private String[] states = { "missed", "hit", "killed", "already dead" };
    private String _name;

    public void setName(String name) {
        this._name = name;
    }

    public String getName() {
        return _name;
    }

    public void setLocations(ArrayList<String> locations) {
        this.locations = locations;
    }

    public int getHits() {
        return hits;
    }

    public boolean isKilled() {
        return killed;
    }

    public String getLocations() {
        String locationsOfDotCom ="";
        for (String loc : locations) {
            locationsOfDotCom += loc + ", ";
        }
        return locationsOfDotCom;
    }

    public String checkYourself(String guess) {

        String guessLocation = guess;
        
        // default to missed
        String result = states[0];

        // if it is already dead
        if (hits >= locations.size()) {
            return states[3];
        }

        // loop through the locations and if there's a match
        //  1. Increment the hits property
        //  2. Update the result value
        //  3. Stop looping
        for (String location : locations) {

            if (guessLocation.equals(location)) {
                hits++;
                result = states[1];
                break;
            }
        }

        if (hits >= locations.size()) {
            killed = true;
            result = states[2];
        }

        return result;
    }

}