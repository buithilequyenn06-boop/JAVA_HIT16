import model.Book;
import model.Novel;
import model.TextBook;
import service.IBookService;
import service.impl.IBookServiceImpl;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        IBookService bookService = new IBookServiceImpl();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Thêm sách");
            System.out.println("2. Lấy sách theo ID");
            System.out.println("3. Lấy tất cả sách theo thể loại (TextBook/Novel)");
            System.out.println("4. Lấy tất cả sách");
            System.out.println("5. Xóa sách theo ID");
            System.out.println("6. Tổng giá trị thư viện");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng: ");

            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.print("Chon category (1. TextBook, 2. Novel): ");
                    int type = Integer.parseInt(scanner.nextLine());
                    System.out.print("Nhap ID: "); String id = scanner.nextLine();
                    System.out.print("Nhap Title: "); String title = scanner.nextLine();
                    System.out.print("Nhap Author: "); String author = scanner.nextLine();
                    System.out.print("Nhap Price: "); double price = Double.parseDouble(scanner.nextLine());
                    System.out.print("Nhap Quantity: "); int qty = Integer.parseInt(scanner.nextLine());

                    if (type == 1) {
                        System.out.print("Nhap Subject: "); String subject = scanner.nextLine();
                        bookService.addBook(new TextBook(id, title, author, price, qty, subject));
                    } else {
                        System.out.print("Nhap Genre: "); String genre = scanner.nextLine();
                        bookService.addBook(new Novel(id, title, author, price, qty, genre));
                    }
                    break;

                case 2:
                    System.out.print("Nhap Id sach can tim: ");
                    String searchId = scanner.nextLine();
                    Book foundBook = bookService.getBookById(searchId);
                    if (foundBook != null) foundBook.displayInfo();
                    else System.out.println("Khong tim thay!");
                    break;

                case 3:
                    System.out.print("Nhap Category(textBook/novel): ");
                    String CS = scanner.nextLine();
                    List<Book> booksByCat = bookService.getAllBooksByCategory(CS);
                    if (booksByCat.isEmpty()) System.out.println("Khong co sach thuoc the loai nay!");
                    else for (Book b : booksByCat) b.displayInfo();
                    break;

                case 4:
                    List<Book> allBooks = bookService.getAllBooks();
                    if (allBooks.isEmpty()) System.out.println("Khong co sach nao!");
                    else for (Book b : allBooks) b.displayInfo();
                    break;

                case 5:
                    System.out.print("Nhap Id can xoa: ");
                    String delId = scanner.nextLine();
                    bookService.deleteBookById(delId);
                    break;

                case 6:
                    double totalVal = bookService.calculateTotalValue();
                    System.out.printf("Tong gia tri: ", totalVal);
                    break;

                case 0:
                    System.out.println("Thoat! ");
                    System.exit(0);
                default:
                    System.out.println("Lua chon khong hop le!");
            }
        }
    }
}