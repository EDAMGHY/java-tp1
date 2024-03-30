package ex2;

public class Livre {

    private String ISBN;
    private String title;
    private Auteur author;

    public Livre(String isbn, String title, Auteur author) {
        this.ISBN = isbn;
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return " \nISBN: " + ISBN + "\nTitle: " + title + "\nAuthor: " + " " + author.toString();
    }
}
