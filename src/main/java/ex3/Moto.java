package ex3;

public class Moto extends Vehicule {

    private String marque;
    private int puissance;

    public Moto(String nom, double prix, String marque, int puissance) {
        super(nom, prix);
        this.marque = marque;
        this.puissance = puissance;
    }

    @Override
    public void emettreSon() {
        System.out.println("La moto rugit.");
    }

    @Override
    public String afficherInformations() {
        return super.afficherInformations() + "\nMarque:" + this.marque + "\nPuissance:" + this.puissance;
    }

}
