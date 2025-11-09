public class SmartPhone extends Product {
    private String brand;
    private int storage;

    public SmartPhone() {
        super();
    }

    public SmartPhone(String name, String description, double price, String brand, int storage) {
        super(name, description, price);
        this.brand = brand;
        this.storage = storage;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    @Override
    public String toString() {
        return "SmartPhone{" + super.toString() +
                "brand='" + brand + '\'' +
                ", storage=" + storage +
                '}';
    }
}
