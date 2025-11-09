import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductController controller = new ProductController();

        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Thêm sản phẩm mới");
            System.out.println("2. Xóa sản phẩm theo ID");
            System.out.println("3. Hiển thị tất cả sản phẩm");
            System.out.println("4. Thoát");
            System.out.print("Chọn: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("\n--- THÊM SẢN PHẨM MỚI ---");
                    System.out.print("Nhập loại sản phẩm (laptop/smartphone): ");
                    String type = sc.nextLine();
                    System.out.print("Nhập Tên sản phẩm: ");
                    String name = sc.nextLine();
                    System.out.print("Nhập Mô tả: ");
                    String description = sc.nextLine();
                    System.out.print("Nhập Giá: ");
                    double price = sc.nextDouble();
                    sc.nextLine();
                    controller.addProduct(type, name, description, price);
                    break;
                case 2:
                    System.out.println("\n--- XÓA SẢN PHẨM ---");
                    System.out.print("Nhập ID cần xóa: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    controller.removeById(id);
                    break;
                case 3:
                    controller.getAllProducts();
                    break;
                case 4:
                    System.out.println("Hoàn thành thao tác! ");
                    return;
                default:
                    System.out.println("Lựa chọn khong hợp lệ! ");
            }
        }while (choice!=0);
    }
}