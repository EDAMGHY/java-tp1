package ex4;

public class Manager extends Employe {
    private String service;

    public Manager(String nom, String prenom, String email, String telephone, double salaire, String service) {
        super(nom, prenom, email, telephone, salaire);
        this.service = service;
    }

    @Override
    public double calculerSalire() {
        return super.getSalaire() * 1.20;
    }

    @Override
    public String toString() {
        return super.toString() + ", service=" + this.service;
    }
}
