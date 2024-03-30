package ex5;

public class Main {
    public static void main(String[] args) {
// Create mock data for a circle and a rectangle
        Cercle cercle = new Cercle("Cercle", 5);
        Rectangle rectangle = new Rectangle("Rectangle", 4, 6);

        // Display details of the circle and the rectangle
        System.out.println("Details of the Circle:");
        cercle.afficherDetails();

        System.out.println("\nDetails of the Rectangle:");
        rectangle.afficherDetails();

    }
}
