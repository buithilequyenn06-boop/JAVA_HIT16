package model;

public abstract class Book implements Borrowable {
    private String id;
    private String title;
    private String author;
    private double price;
    private int quantity;

    public Book() {
    }

    public Book(String id, String title, String author, double price, int quantity) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean borrow(int quantityBorrow) {
        if(quantityBorrow >0 && quantityBorrow <= this.quantity){
            this.quantity -= quantityBorrow;
            return true;
        }
        return false;
    }

    @Override
    public int getAvailableQuantity() {
        return this.quantity;
    }

    public abstract void displayInfo();
}
