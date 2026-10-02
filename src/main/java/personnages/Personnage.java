package personnages;

public class Personnage {

    public Orientation tourner(int fois) {
        if (fois > 1) {
            return Orientation.SUD;
        }
        return Orientation.EST;
    }

}
