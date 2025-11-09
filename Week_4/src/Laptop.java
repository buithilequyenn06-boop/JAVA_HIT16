public class Laptop extends Product{
    private int ram;
    private String cpu;

    public Laptop() {
        super();
    }

    public Laptop(String name, String description, double price, int ram, String cpu){
        super(name, description, price);
        this.ram=ram;
        this.cpu=cpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    @Override
    public String toString() {
        return "Laptop{ "+ super.toString() +
                "ram=" + ram +
                ", cpu='" + cpu + '\'' +
                '}';
    }
}
