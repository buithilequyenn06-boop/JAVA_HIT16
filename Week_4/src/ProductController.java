import java.util.ArrayList;
import java.util.Scanner;

public class ProductController {
    public ArrayList<Product> products = new ArrayList<>();

    public ProductController() {
    }

    public ProductController(ArrayList<Product> products) {
        this.products = products;
    }

    public void addProduct(Product product) {
        if (product != null) {
            products.add(product);
            System.out.println("✅ Thêm sản phẩm thành công!");
        }
    }

    Scanner sc = new Scanner(System.in);

    public void addProduct(String type, String name, String description, double price) {
        Product newProduct = null;

        if (type.equals("laptop")) {
            System.out.print("Nhập RAM: ");
            int ram = sc.nextInt();
            sc.nextLine();
            System.out.print("Nhập CPU: ");
            String cpu = sc.nextLine();
            newProduct = new Laptop(name, description, price, ram, cpu);
        } else if (type.equals("smartphone")) {
            System.out.print("Nhập brand: ");
            String brand = sc.nextLine();
            System.out.print("Nhập storage: ");
            int storage = sc.nextInt();
            newProduct = new SmartPhone(name, description, price, brand, storage);
        } else {
            System.out.println("Loại sản phẩm không hợp lệ!");
        }
        addProduct(newProduct);
    }

    public void removeById(int id) {
        Product productToRemove = null;
        for (Product p : products) {
            if (p.getId() == id) {
                productToRemove = p;
                break;
            }
        }
        if (productToRemove != null) {
        products.remove(productToRemove);
        System.out.println("Đã xóa sản phẩm ID: " + id);
    }
        else {
        System.out.println("Không tìm thấy sản phẩm có ID: " + id);
        }
    }

    public Product getById(int id) {
        for (Product p : products) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    public ArrayList<Product> getAllProducts() {
        if (products.isEmpty()) {
            System.out.println("ℹDanh sách sản phẩm rỗng.");
        } else {
            System.out.println("DANH SÁCH TẤT CẢ SẢN PHẨM");
            for (Product p : products) {
                System.out.println(p.toString());
            }
        }
        return products;
    }
}
