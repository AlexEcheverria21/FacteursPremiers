package personnages;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PersonnagesTest {

    @Test
    void tourner_1_fois_devrait_orienter_vers_est() {
        Personnage personnage = new Personnage();
        Orientation resultat = personnage.tourner(1);
        assertThat(resultat).isEqualTo(Orientation.EST);
    }

}
