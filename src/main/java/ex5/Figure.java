package ex5;

abstract class Figure {
    private String nom;

    public Figure(String nom) {
        this.nom = nom;
    }

    abstract double calculerAire();

    abstract double calculerPerimetre();

    public void afficherDetails() {
        System.out.println("Nom: " + this.nom);
        System.out.println("Aire: " + this.calculerAire());
        System.out.println("Périmètre: " + this.calculerPerimetre());
    }
}
