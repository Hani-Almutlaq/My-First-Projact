import java.text.NumberFormat;
public class Phones {
    
    NumberFormat nf = NumberFormat.getCurrencyInstance();
    
    String name;
    int storage;
    double price;
    
    public Phones(String name) {
        this.name = name;
    }
    
    public void phs(int phs) {
        storage = phs;
    }
    
    public void php(double php) {
        price = php;
    }
    
    public void print() {
        System.out.println("Model: "+name);
        System.out.println("Storage: "+storage+"G");
        System.out.println("Price: "+nf.format(price));
    }
}
