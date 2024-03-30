package ex3;

public class Vehicule {

    private String nom;
    private double prix;

    public Vehicule(String nom, double prix) {
        this.nom = nom;
        this.prix = prix;
    }

    public void emettreSon() {
        System.out.println("Le véhicule émet un son inconnu.");
    }

    public String afficherInformations() {
        return "nom=" + this.nom + ", prix=" + this.prix;
    }
}
