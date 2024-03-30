package ex7;

public class GestionPaiementApp {
    public static void main(String[] args) {
        // Création d'instances de Commande avec différents moyens de paiement
        CarteCredit carteCredit = new CarteCredit(100.0, "123456789", "1234-5678-9012-3456");
        PayPal paypal = new PayPal(50.0, "987654321", "user@example.com");

        // Appel de la méthode processPayment() pour chaque commande
        Commande commande1 = new Commande(100.0, carteCredit);
        commande1.processPayment();

        Commande commande2 = new Commande(50.0, paypal);
        commande2.processPayment();
    }
}

