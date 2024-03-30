package ex1;

public class Compte {
    private String numero;
    private double solde;
    private static int nbCompte;

    public Compte() {
        this.numero = "";
        this.solde = 0;
        nbCompte += 1;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public void deposer(double solde) {
        this.solde += solde;
    }

    public void retirer(double solde) {
        if (this.solde < solde) {
            throw new Error("There is not enough cash to withdraw");
        }
        this.solde -= solde;
    }

    public void afficherCompteInfo() {
        System.out.println("Your Account number is : " + this.numero + " and your solde is " + this.solde);
    }

    public static void afficherNbComptes() {
        System.out.println("The number of Compte accounts is : " + nbCompte);
    }
}
