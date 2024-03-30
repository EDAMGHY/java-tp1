package ex2;

public class Auteur extends Personne {

    private int numAuteur;

    public Auteur(String nom, String prenom, String email, String tel, int age, int numAuteur) {
        super(nom, prenom, email, tel, age);
        this.numAuteur = numAuteur;
    }


    @Override
    public String toString() {
        return "Num : " + this.numAuteur + " " + super.toString();
    }
}
