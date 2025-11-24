package model;

public class TextBook extends Book {
    private String subject;

    public TextBook(String id, String title, String author, double price, int quantity, String subject) {
        super(id, title, author, price, quantity);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public void displayInfo() {
        System.out.println("TextBook [ID: "+ getId()+", Title: "+ getTitle() + ", Author: "+ getAuthor()+", Price: "+getPrice()+", Quantity: "+getQuantity()+ ", Subject: "+getSubject()+"]\n");
    }
}
