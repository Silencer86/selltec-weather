package kassenbon1;

class KassenbonPosten {

    public Produkt produkt;
    public int stueck;

    public KassenbonPosten(Produkt produkt, int stueck) {
        this.produkt = produkt;
        this.stueck = stueck;
    }

    public Produkt getProdukt() {
        return produkt;
    }

    public int getStueck() {
        return stueck;
    }

}