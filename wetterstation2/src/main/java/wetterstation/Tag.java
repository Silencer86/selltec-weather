package wetterstation;

class Tag {

    private int tagImMonat;
    private int temperatur;
    private Wetter wetter;

    public Tag(int tagImMonat, int temperatur, Wetter wetter) {
        this.tagImMonat = tagImMonat;
        this.temperatur = temperatur;
        this.wetter = wetter;
    }

    public int getTagImMonat() {
        return tagImMonat;
    }

    public int getTemperatur() {
        return temperatur;
    }

    public Wetter getWetter() {
    }

    public boolean istSchoen() {
    }

    public boolean istScheisse() {
    }
}