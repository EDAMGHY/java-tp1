package ex3;


public class Main {
    public static void main(String[] args) {
        Voiture voiture1 = new Voiture("SUV", 35000, "Toyota", 2022);
        Moto moto1 = new Moto("Sportbike", 15000, "Yamaha", 1000);
        Avion avion1 = new Avion("Jet", 10000000, "Boeing", 1000);

        System.out.println("Emitted Sounds:");
        voiture1.emettreSon();
        moto1.emettreSon();
        avion1.emettreSon();

        System.out.println("\nInformation about Vehicles:");
        System.out.println("Voiture 1: " + voiture1.afficherInformations());
        System.out.println("Moto 1: " + moto1.afficherInformations());
        System.out.println("Avion 1: " + avion1.afficherInformations());
    }
}

