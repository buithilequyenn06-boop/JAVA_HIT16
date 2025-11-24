package service.impl;

import model.Book;
import model.Novel;
import model.TextBook;
import service.IBookService;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class IBookServiceImpl implements IBookService {
    private List<Book> books = new ArrayList<>();

    @Override
    public void addBook(Book Book) {
        books.add(Book);
        System.out.println("da them sach thanh cong!");
    }

    @Override
    public Book getBookById(String id) {
        for(Book book:books){
            if(book.getId().equalsIgnoreCase(id))
                return book;
        }
        return null;
    }

    @Override
    public List<Book> getAllBooksByCategory(String category) {
        List<Book> result = new ArrayList<>();
        String CS= category.toString();
        for(Book book:books){
            if(CS.equalsIgnoreCase("text book")){
                if(book instanceof TextBook)
                    result.add(book);
            }
            else if(CS.equalsIgnoreCase("novel")){
                if(book instanceof Novel)
                    result.add(book);
            }
        }
        return result;
    }

    @Override
    public boolean deleteBookById(String id) {
        Book book = getBookById(id);
        if(book!=null){
            books.remove(book);
            System.out.println("da xoa sach!");
            return true;
        }
        System.out.println("ko tim thay sach xoa!");
        return false;
    }

    @Override
    public double calculateTotalValue() {
        double total=0;
        for(Book book :books){
            total+=(book.getPrice()*book.getQuantity());
        }
        return total;
    }

    @Override
    public List<Book> getAllBooks() {
        return this.books;
    }
}










