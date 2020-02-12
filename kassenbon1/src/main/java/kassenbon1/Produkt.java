package kassenbon1;

class Produkt {

    public String name;
    public double stueckpreis;

    public Produkt(String name, double stueckpreis){
        this.name = name;
        this.stueckpreis = stueckpreis;
    }

    public String getName(){
        return name;
    }

    public double getStueckpreis(){
        return stueckpreis;
    }

}