package Chapter1;

public class Q22_2 {

    String product;
    double price;

    // Parameterized constructor
    public Q22_2(String product, double price) {
        this.product = product;
        this.price = price;
    }

    // Copy constructor
    public Q22_2(Q22_2 other) {
        this.product = other.product;
        this.price = other.price;
    }

    public void display() {
        System.out.println("Product: " + product);
        System.out.println("Price: ₹" + price);
    }

    public static void main(String[] args) {
        Q22_2 original = new Q22_2("Notebook", 45.50);
        Q22_2 copy = new Q22_2(original);

        System.out.println("Original Object:");
        original.display();

        System.out.println("Copied Object:");
        copy.display();
    }
}