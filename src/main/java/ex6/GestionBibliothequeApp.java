package ex6;

public class GestionBibliothequeApp {
    public static void main(String[] args) {
        Livre livre1 = new Livre("Harry Potter", "J.K. Rowling");
        DVD dvd1 = new DVD("Inception", "Christopher Nolan");
        Utilisateur utilisateur = new Utilisateur("Alice");

        utilisateur.emprunterObjet(livre1);
        utilisateur.emprunterObjet(dvd1);

        livre1.retourner();
        dvd1.retourner();
    }
}
