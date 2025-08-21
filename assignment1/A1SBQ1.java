package assignment1;

public class A1SBQ1 {
    private int num;  
    
    public A1SBQ1() {
        this.num = 0;
    }

    
    public A1SBQ1(int num) {
        this.num = num;
    }

   
    public boolean isNegative() {
        return num < 0;
    }

    
    public boolean isPositive() {
        return num > 0;
    }

    
    public boolean isOdd() {
        return num % 2 != 0;
    }

   
    public boolean isEven() {
        return num % 2 == 0;
    }

    
    public void display() {
        System.out.println("Number: " + num);
        System.out.println("Is Negative: " + isNegative());
        System.out.println("Is Positive: " + isPositive());
        System.out.println("Is Odd     : " + isOdd());
        System.out.println("Is Even    : " + isEven());
    }

    
    public static void main(String[] args) {
    	A1SBQ1 number;

        if (args.length > 0) {
            try {
                int val = Integer.parseInt(args[0]);
                number = new A1SBQ1(val);  
            } catch (NumberFormatException e) {
                System.out.println("Please provide a valid integer.");
                return;
            }
        } else {
            System.out.println("No argument provided. Using default value 0.");
            number = new A1SBQ1();  
        }

        number.display();
    }
}
