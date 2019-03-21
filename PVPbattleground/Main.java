
public class Main {

    public static void main(String[] args) {

        Fighter playerA = new Fighter("Eric");
        playerA.showStats();

        Mage playerB = new Mage("Dumbledore");
        playerB.showStats();

        Paladin playerC = new Paladin("Hagrid");
        playerC.showStats();

        Priest playerD = new Priest("Snape");
        playerD.showStats();

        

        System.out.println(PlayerCharacter.numCharacters());

    }
}
