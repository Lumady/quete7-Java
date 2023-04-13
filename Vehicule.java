public abstract class Vehicule {

    // attributs
    private String brand;
    private int kilometres;

    // constructeurs
    public Vehicule(String brand) {
        this.brand = brand;
        this.kilometres = 154;
    }

    // accesseurs et mutateurs
    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getKilometres() {
        return this.kilometres;
    }

    public void setKilometres(int kilometres) {
        this.kilometres = kilometres;
    }

    // méthode abstraite
    public abstract String doStuff();

}
