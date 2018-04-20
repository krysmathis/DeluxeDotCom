import java.util.ArrayList;

class DotComBust {
   
    GameHelper gameHelper = new GameHelper();
    GuessTracker guessTracker = new GuessTracker();
    private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();

    private void SetUpGame() {

        DotCom dot1 = new DotCom();
        DotCom dot2 = new DotCom();
        DotCom dot3 = new DotCom();
        
        dot1.setName("Pets.com");
        dot2.setName("Askme.com");
        dot3.setName("Go2.com");

        dotComsList.add(dot1);
        dotComsList.add(dot2);
        dotComsList.add(dot3);

        for (DotCom dotCom : DotCom) {
            ArrayList<String> newLocation = gameHelper.placeDotCom(3);
            dotCom.setLocations(newLocations);
        } // close for loop

    } // close setup game method

    
    

}