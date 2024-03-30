package ex7;

public class Paiement {
    private double montant;
    private String numeroTransaction;

    public Paiement(double montant, String numeroTransaction) {
        this.montant = montant;
        this.numeroTransaction = numeroTransaction;
    }

    public void effectuerPaiement(double montant) {
        System.out.println("Paiement de " + montant + " effectué avec succès.");
    }
}
