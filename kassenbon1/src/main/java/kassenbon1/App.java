
package kassenbon1;

public class App {

    public static void main(String[] args) {

        Produkt wurst = new Produkt("Wurst", 4.20);
        Produkt kaese = new Produkt("Käse", 2.30);
        Produkt brot = new Produkt("Brot", 2.10);
        Produkt dvd = new Produkt("DVD", 12.00);

        Kassenbon bon = new Kassenbon();
        bon.postenHinzufuegen(new KassenbonPosten(wurst, 1));
        bon.postenHinzufuegen(new KassenbonPosten(kaese, 1));
        bon.postenHinzufuegen(new KassenbonPosten(brot, 1));
        bon.postenHinzufuegen(new KassenbonPosten(dvd, 2));

        String out = bon.bonErzeugen(50.00);

        System.out.println(out);
    }
}
