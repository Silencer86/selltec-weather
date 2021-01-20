package wetterstation;

import java.time.LocalDate;

class Tag {

    private LocalDate datum;
    private int temperatur;
    private Wetter wetter;

    public Tag(LocalDate datum, int temperatur, Wetter wetter) {
        this.datum = datum;
        this.temperatur = temperatur;
        this.wetter = wetter;
    }

    public LocalDate getDatum() {
        return datum;
    }

    public int getTemperatur() {
        return temperatur;
    }

    public Wetter getWetter() {
        return wetter;
    }

    public boolean istSchoen() {
        return false;
    }

    public boolean istScheisse() {
        return false;
    }
}