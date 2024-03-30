package ex5;

public class Cercle extends Figure {
    private double rayon;

    public Cercle(String nom, double rayon) {
        super(nom);
        this.rayon = rayon;
    }

    @Override
    public double calculerAire() {
        return Math.pow(this.rayon, 2) * Math.PI;
    }

    @Override
    public double calculerPerimetre() {
        return this.rayon * 2 * Math.PI;
    }
}
