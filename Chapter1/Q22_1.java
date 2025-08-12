package Chapter1;

public class Q22_1 {


	    String item;
	    int quantity;

	    public Q22_1(String item, int quantity) {
	        this.item = item;
	        this.quantity = quantity;
	    }

	    public void display() {
	        System.out.println("Item: " + item);
	        System.out.println("Quantity: " + quantity);
	    }

	    public static void main(String[] args) {
	        Q22_1 obj = new Q22_1("Pen", 10);
	        obj.display();
	    }
	

}
