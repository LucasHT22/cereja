package model;

/**
 *
 * @author lucas
 */

public class Book {
    private int id;
    private String title;
    private String author;
    private String publisher;
    private int quantity;
    private int editionYear;
    private String language;
    private String isbn;

    public Book(int id, String title, String author, String publisher, int quantity, int editionYear, String language, String isbn) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
        this.editionYear = editionYear;
        this.language = language;
        this.isbn = isbn;
    }

    public Book() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    
    public String getPublisher() {
        return publisher;
    }
    
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getEditionYear() {
        return editionYear;
    }

    public void setEditionYear(int editionYear) {
        this.editionYear = editionYear;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
    
    public String getIsbn() {
    return isbn;
}

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

}