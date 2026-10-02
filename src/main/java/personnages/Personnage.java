package personnages;

public class Personnage {

    public Orientation tourner(int nbrDeFois) {
        int reste = nbrDeFois % 4;

        if (reste == 1) {
            return Orientation.EST;
        }
        if (reste == 2) {
            return Orientation.SUD;
        }
        if (reste == 3) {
            return Orientation.OUEST;
        }
        return Orientation.NORD;
    }

}
