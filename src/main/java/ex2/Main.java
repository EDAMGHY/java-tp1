package ex2;

public class Main {
    public static void main(String[] args) {
        Personne personne1 = new Personne("Doe", "John", "john.doe@example.com", "123456789", 30);
        Personne personne2 = new Personne("Smith", "Alice", "alice.smith@example.com", "987654321", 25);

        Adherent adherent1 = new Adherent("Johnson", "Mike", "mike.johnson@example.com", "111222333", 35, 1001);
        Adherent adherent2 = new Adherent("Brown", "Emma", "emma.brown@example.com", "444555666", 28, 1002);

        Auteur auteur1 = new Auteur("Miller", "David", "david.miller@example.com", "777888999", 40, 2001);
        Auteur auteur2 = new Auteur("Wilson", "Sophia", "sophia.wilson@example.com", "123123123", 32, 2002);

        Livre livre1 = new Livre("978-3-16-148410-0", "Java Programming", auteur1);
        Livre livre2 = new Livre("978-3-16-148411-1", "Python Programming", auteur2);

        // Displaying the generated data
        System.out.println("Personne 1: " + personne1);
        System.out.println("Personne 2: " + personne2);
        System.out.println("Adherent 1: " + adherent1);
        System.out.println("Adherent 2: " + adherent2);
        System.out.println("Auteur 1: " + auteur1);
        System.out.println("Auteur 2: " + auteur2);
        System.out.println("Livre 1: " + livre1);
        System.out.println("Livre 2: " + livre2);
    }
}
