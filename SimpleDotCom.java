class SimpleDotCom {

    int hits = 0;
    boolean killed = false; 
    int[] locations;

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
        
        String result = "missed";

        for (int location : locations) {
            if (guessLocation == location) {
                hits += 1;
                result = "hit";
            }
        }

        if (hits >= 3) {
            killed = true;
            result = "killed";
        }

        return result;
    }

}