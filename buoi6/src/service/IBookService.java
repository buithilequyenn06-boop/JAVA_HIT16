package service;

import model.Book;

import java.util.List;
import java.util.Objects;

public interface IBookService {
    void addBook(Book Book);
    Book getBookById(String id);
    List<Book> getAllBooksByCategory(String category);
    boolean deleteBookById(String id);
    double calculateTotalValue();
    List<Book> getAllBooks();
}
