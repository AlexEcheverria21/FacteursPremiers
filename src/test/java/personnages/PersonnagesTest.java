package personnages;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PersonnagesTest {

    @Test
    void tourner_0_fois_devrait_orienter_vers_nord() {
        Personnage personnage = new Personnage();
        Orientation resultat = personnage.tourner(0);
        assertThat(resultat).isEqualTo(Orientation.NORD);
    }

    @Test
    void tourner_1_fois_devrait_orienter_vers_est() {
        Personnage personnage = new Personnage();
        Orientation resultat = personnage.tourner(1);
        assertThat(resultat).isEqualTo(Orientation.EST);
    }

    @Test
    void tourner_2_fois_devrait_orienter_vers_sud() {
        Personnage personnage = new Personnage();
        Orientation resultat = personnage.tourner(2);
        assertThat(resultat).isEqualTo(Orientation.SUD);
    }

    @Test
    void tourner_3_fois_devrait_orienter_vers_ouset() {
        Personnage personnage = new Personnage();
        Orientation resultat = personnage.tourner(3);
        assertThat(resultat).isEqualTo(Orientation.OUEST);
    }

    @Test
    void tourner_4_fois_devrait_orienter_vers_nord() {
        Personnage personnage = new Personnage();
        Orientation resultat = personnage.tourner(4);
        assertThat(resultat).isEqualTo(Orientation.NORD);
    }

    @Test
    void tourner_5_fois_devrait_orienter_vers_est() {
        Personnage personnage = new Personnage();
        Orientation resultat = personnage.tourner(5);
        assertThat(resultat).isEqualTo(Orientation.EST);
    }

}
