package wetterstation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.Test;

class AppTest {

    private WetterStation init() {
        final WetterStation station = new WetterStation();
        station.addTag(8, Wetter.HEITER, "1.1.2020");
        station.addTag(10, Wetter.REGEN, "2.1.2020");
        station.addTag(4, Wetter.SCHNEE, "3.1.2020");
        station.addTag(8, Wetter.SONNENSCHEIN, "4.1.2020");
        station.addTag(12, Wetter.WOLKIG, "5.1.2020");
        station.addTag(14, Wetter.SONNENSCHEIN, "6.1.2020");
        station.addTag(14, Wetter.SONNENSCHEIN, "7.1.2020");
        station.addTag(16, Wetter.SONNENSCHEIN, "8.1.2020");
        station.addTag(17, Wetter.SONNENSCHEIN, "9.1.2020");
        station.addTag(7, Wetter.REGEN, "10.1.2020");
        return station;
    }

    @Test
    void testDatum() {
        final WetterStation station = init();

        List<Tag> tage = station.getTage();
        assertEquals(10, tage.size());

        assertEquals(LocalDate.of(2020, 1, 1), tage.get(0).getDatum());
        assertEquals(LocalDate.of(2020, 1, 2), tage.get(1).getDatum());
        assertEquals(LocalDate.of(2020, 1, 3), tage.get(2).getDatum());
        assertEquals(LocalDate.of(2020, 1, 4), tage.get(3).getDatum());
        assertEquals(LocalDate.of(2020, 1, 5), tage.get(4).getDatum());
        assertEquals(LocalDate.of(2020, 1, 6), tage.get(5).getDatum());
        assertEquals(LocalDate.of(2020, 1, 7), tage.get(6).getDatum());
        assertEquals(LocalDate.of(2020, 1, 8), tage.get(7).getDatum());
        assertEquals(LocalDate.of(2020, 1, 9), tage.get(8).getDatum());
        assertEquals(LocalDate.of(2020, 1, 10), tage.get(9).getDatum());

    }

    @Test
    void testTemperaturen() {
        final WetterStation station = init();

        List<Tag> tage = station.getTage();
        assertEquals(10, tage.size());

        assertEquals(8, tage.get(0).getTemperatur());
        assertEquals(10, tage.get(1).getTemperatur());
        assertEquals(4, tage.get(2).getTemperatur());
        assertEquals(8, tage.get(3).getTemperatur());
        assertEquals(12, tage.get(4).getTemperatur());
        assertEquals(14, tage.get(5).getTemperatur());
        assertEquals(14, tage.get(6).getTemperatur());
        assertEquals(16, tage.get(7).getTemperatur());
        assertEquals(17, tage.get(8).getTemperatur());
        assertEquals(7, tage.get(9).getTemperatur());
    }

    @Test
    void testWetter() {
        final WetterStation station = init();

        List<Tag> tage = station.getTage();
        assertEquals(10, tage.size());
        assertEquals(Wetter.HEITER, tage.get(0).getWetter());
        assertEquals(Wetter.REGEN, tage.get(1).getWetter());
        assertEquals(Wetter.SCHNEE, tage.get(2).getWetter());
        assertEquals(Wetter.SONNENSCHEIN, tage.get(3).getWetter());
        assertEquals(Wetter.WOLKIG, tage.get(4).getWetter());
        assertEquals(Wetter.SONNENSCHEIN, tage.get(5).getWetter());
        assertEquals(Wetter.SONNENSCHEIN, tage.get(6).getWetter());
        assertEquals(Wetter.SONNENSCHEIN, tage.get(7).getWetter());
        assertEquals(Wetter.SONNENSCHEIN, tage.get(8).getWetter());
        assertEquals(Wetter.REGEN, tage.get(9).getWetter());
    }

    @Test
    void testSchoen() {
        final WetterStation station = init();
        List<Tag> tage = station.getTage();

        assertTrue(tage.get(0).istSchoen());
        assertFalse(tage.get(1).istSchoen());
        assertFalse(tage.get(2).istSchoen());
        assertTrue(tage.get(3).istSchoen());
        assertFalse(tage.get(4).istSchoen());
        assertTrue(tage.get(5).istSchoen());
        assertTrue(tage.get(6).istSchoen());
        assertTrue(tage.get(7).istSchoen());
        assertTrue(tage.get(8).istSchoen());
        assertFalse(tage.get(9).istSchoen());
    }

    @Test
    void testScheisse() {
        final WetterStation station = init();
        List<Tag> tage = station.getTage();

        assertFalse(tage.get(0).istScheisse());
        assertTrue(tage.get(1).istScheisse());
        assertTrue(tage.get(2).istScheisse());
        assertFalse(tage.get(3).istScheisse());
        assertFalse(tage.get(4).istScheisse());
        assertFalse(tage.get(5).istScheisse());
        assertFalse(tage.get(6).istScheisse());
        assertFalse(tage.get(7).istScheisse());
        assertFalse(tage.get(8).istScheisse());
        assertTrue(tage.get(9).istScheisse());
    }

    @Test
    void testMin() {
        assertEquals(4, init().getMin());
    }

    @Test
    void testMax() {
        assertEquals(17, init().getMax());
    }

    @Test
    void testDurchschnitt() {
        assertEquals(11, init().getDurchschnitt());
    }

    @Test
    void testToString() {
        assertEquals(
                "Temp:\t8\t10\t4\t8\t12\t14\t14\t16\t17\t7\n"
                        + "Tag: \t1\t2\t3\t4\t5\t6\t7\t8\t9\t10"
                , init().toString());
    }
}
