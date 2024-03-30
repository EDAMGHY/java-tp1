package ex7;

public class Commande {
    private double montant;
    private Paiement moyenPaiement;

    public Commande(double montant, Paiement moyenPaiement) {
        this.montant = montant;
        this.moyenPaiement = moyenPaiement;
    }

    public void processPayment() {
        moyenPaiement.effectuerPaiement(this.montant);
    }
}
