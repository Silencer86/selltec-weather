package wetterstation;

public class App {
   
    public static void main(String[] args) {
        
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
        
        System.out.println(station);

    }
}
