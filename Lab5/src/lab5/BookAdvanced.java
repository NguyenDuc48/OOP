package lab5;

import java.util.Arrays;

public class BookAdvanced {
    private String name;
    private AuthorAdvanced[] authors;
    private double price;
    private int qty = 0;

    public BookAdvanced(String name, AuthorAdvanced[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public BookAdvanced(String name, AuthorAdvanced[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public AuthorAdvanced[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String toString() {
        return "Book[" +
                "name= " + name +
                ", authors= " + Arrays.toString(authors) +
                ", price= " + price +
                ", qty= " + qty + ']';
    }

    public String getAuthorNames() {
        StringBuilder authorNames = new StringBuilder();
        for (AuthorAdvanced author : authors) {
            authorNames.append(author.getName()).append(", ");
        }
        if (authorNames.charAt(authorNames.length() - 2) == ',') {
            authorNames.delete(authorNames.length() - 2, authorNames.length());
        }
        return authorNames.toString();
    }
}