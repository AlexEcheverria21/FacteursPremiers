package facteursPremiers;

import java.util.ArrayList;
import java.util.List;

public class FacteursPremiers {

    public static List<Integer> generate(int nbre) {
        List<Integer> facteurs = new ArrayList<>();
        if (nbre > 1) {
            facteurs.add(2);
        }
        return facteurs;
    }
}