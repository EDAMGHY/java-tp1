package ex6;

public class DVD implements Empruntable {
    private String titre;
    private String realisateur;
    private boolean emprunte;


    public DVD(String titre, String realisateur) {
        this.titre = titre;
        this.realisateur = realisateur;
    }


    @Override
    public void emprunter() {
        if (!emprunte) {
            emprunte = true;
            System.out.println("DVD \"" + titre + "\" emprunté.");
        } else {
            System.out.println("Ce DVD est déjà emprunté.");
        }
    }

    @Override
    public void retourner() {
        if (emprunte) {
            emprunte = false;
            System.out.println("DVD \"" + titre + "\" retourné.");
        } else {
            System.out.println("Ce DVD n'est pas emprunté.");
        }
    }
}