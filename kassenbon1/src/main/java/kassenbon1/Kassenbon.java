package kassenbon1;

import java.util.ArrayList;
import java.util.List;

class Kassenbon {

    List<KassenbonPosten> postenListe = new ArrayList<>();

    public void postenHinzufuegen(KassenbonPosten posten) {
        postenListe.add(posten);
    }

    public String bonErzeugen(double gegeben) {

        StringBuilder sb = new StringBuilder();

        sb.append("----------------------------------\n");

        double gesamt = 0;

        for (KassenbonPosten posten : postenListe) {
            Produkt produkt = posten.getProdukt();
            double postenGesamt = posten.getStueck() * produkt.getStueckpreis();

            sb.append(produkt.getName());
            sb.append("\t");
            sb.append(posten.getStueck());
            sb.append(" x ");
            sb.append(produkt.getStueckpreis());
            sb.append(" EUR\n");
            sb.append("\t\t\t");
            sb.append(postenGesamt);
            sb.append(" EUR\n");

            gesamt += postenGesamt;
        }

        sb.append("----------------------------------\n");
        sb.append("Gesamt\t\t\t");
        sb.append(gesamt);
        sb.append(" EUR\n");
        sb.append("Gegeben\t\t\t");
        sb.append(gegeben);
        sb.append(" EUR\n\n");

        double zurueck = gegeben - gesamt;

        sb.append("Zurück\t\t\t");
        sb.append(zurueck);
        sb.append(" EUR\n");
        sb.append("----------------------------------\n");

        return sb.toString();
    }
}