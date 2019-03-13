package book;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Book {
    // Fields
    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;

    // Constructors
    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = new Author[authors.length];
        for (int i = 0; i < authors.length; ++i)
            this.authors[i] = authors[i].clone();
        this.price = price;
    }
    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = new Author[authors.length];
        for (int i = 0; i < authors.length; ++i)
            this.authors[i] = authors[i].clone();
        this.price = price;
        this.qty = qty;
    }

    // Getters & Setters
    public String getName() {
        return name;
    }
    public Author[] getAuthors() {
        return authors;
    }
    public double getPrice() {
        return price;
    }
    public int getQty() {
        return qty;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setQty(int qty) {
        this.qty = qty;
    }

    // Override metods
    @Override
    public String toString() {
        String result = "book[name=\"" + name + "\",authors={";
        for (Author author: authors) {
            result += author.toString();
            if (author != authors[authors.length-1])
                result += ",";
        }
        result += "},price=" + price + ",qty=" + qty + "]";
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Book)) return false;
        Book book = (Book)obj;
        if ((name != book.name) || (authors.length != book.authors.length))
            return false;
        for (int i = 0; i < authors.length; ++i) {
            if (!authors[i].equals(book.authors[i])) return false;
        }
        return true;
    }
    @Override
    public int hashCode() {
        int result = 10;
        result = 31 * result + name.hashCode();
        result = 31 * result + Arrays.hashCode(authors);
        return result;
    }

    // New metods
    public String getAuthorNames() {
        String result = "";
        for (Author author: authors) {
            result += author.getName();
            if (author != authors[authors.length-1])
                result += ",";
        }
        return result;
    }
}
