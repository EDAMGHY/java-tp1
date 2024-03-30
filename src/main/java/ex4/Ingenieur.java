package ex4;

public class Ingenieur extends Employe {
    private String specialite;

    public Ingenieur(String nom, String prenom, String email, String telephone, double salaire, String specialite) {
        super(nom, prenom, email, telephone, salaire);
        this.specialite = specialite;
    }


    @Override
    public double calculerSalire() {
        return super.getSalaire() * 1.15;
    }

    @Override
    public String toString() {
        return super.toString() + ", specialite=" + this.specialite;
    }
}
