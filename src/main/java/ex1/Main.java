package ex1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Creating some accounts
        Compte compte1 = new Compte();
        compte1.setNumero("12345");
        compte1.deposer(1000);

        Compte compte2 = new Compte();
        compte2.setNumero("67890");
        compte2.deposer(500);

        Compte compte3 = new Compte();
        compte3.setNumero("54321");
        compte3.deposer(1500);

        Compte compte4 = new Compte();
        compte4.setNumero("09876");
        compte4.deposer(200);

        // Displaying account information
        System.out.println("Account 1:");
        compte1.afficherCompteInfo();

        System.out.println("\nAccount 2:");
        compte2.afficherCompteInfo();

        System.out.println("\nAccount 3:");
        compte3.afficherCompteInfo();

        System.out.println("\nAccount 4:");
        compte4.afficherCompteInfo();

        // Making some transactions
        System.out.println("\nMaking transactions:");
        compte1.retirer(200);
        compte2.retirer(100);
        compte3.retirer(400);
        compte4.retirer(50);


        // Displaying updated account information
        System.out.println("\nUpdated Account 1:");
        compte1.afficherCompteInfo();

        System.out.println("\nUpdated Account 2:");
        compte2.afficherCompteInfo();

        System.out.println("\nUpdated Account 3:");
        compte3.afficherCompteInfo();

        System.out.println("\nUpdated Account 4:");
        compte4.afficherCompteInfo();


        System.out.println("---------------------");

        // Displaying the number of accounts
        Compte.afficherNbComptes();


    }
}
