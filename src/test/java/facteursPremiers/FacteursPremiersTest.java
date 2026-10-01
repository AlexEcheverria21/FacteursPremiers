package facteursPremiers;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

public class FacteursPremiersTest {

    @Test
    void generate_1_devrait_retourner_une_liste_vide() {
        // WHEN
        List<Integer> resultat = FacteursPremiers.generate(1);

        // THEN
        assertThat(resultat).isEmpty();
    }

    @Test
    void generate_2_devrait_retourner_la_liste_avec_2() {
        // WHEN
        List<Integer> resultat = FacteursPremiers.generate(2);

        // THEN
        assertThat(resultat).containsExactly(2);
    }
}