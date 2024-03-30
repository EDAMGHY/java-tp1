package ex6;

public class Livre implements Empruntable {
    private String titre;
    private String auteur;
    private boolean emprunte;


    public Livre(String titre, String auteur) {
        this.titre = titre;
        this.auteur = auteur;
    }


    @Override
    public void emprunter() {
        if (!emprunte) {
            emprunte = true;
            System.out.println("Livre \"" + titre + "\" emprunté.");
        } else {
            System.out.println("Ce livre est déjà emprunté.");
        }
    }

    @Override
    public void retourner() {
        if (emprunte) {
            emprunte = false;
            System.out.println("Livre \"" + titre + "\" retourné.");
        } else {
            System.out.println("Ce livre n'est pas emprunté.");
        }
    }
}
