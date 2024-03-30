package ex4;

public class Main {
    public static void main(String[] args) {
        // Déclaration et instanciation d'un ingénieur
        Ingenieur ingenieur = new Ingenieur("Dupont", "Jean", "jean.dupont@example.com", "123456789", 5000, "Informatique");

        // Déclaration et instanciation d'un manager
        Manager manager = new Manager("Martin", "Sophie", "sophie.martin@example.com", "987654321", 6000, "Développement");

        // Affichage des informations de l'ingénieur et du manager en utilisant la méthode toString()
        System.out.println("Informations de l'ingénieur :\n" + ingenieur);
        System.out.println("salaire :\n" + ingenieur.calculerSalire());

        System.out.println("\nInformations du manager :\n" + manager);
        System.out.println("manager :\n" + manager.calculerSalire());

    }
}
