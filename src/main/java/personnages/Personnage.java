package personnages;

public class Personnage {

    public Orientation tourner(int nbrDeFois) {
        if (nbrDeFois == 4) {
            return Orientation.NORD;
        }
        if (nbrDeFois == 3) {
            return Orientation.OUEST;
        }
        if (nbrDeFois > 1) {
            return Orientation.SUD;
        }
        return Orientation.EST;
    }

}
